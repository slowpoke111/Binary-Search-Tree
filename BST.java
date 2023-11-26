
//Fix children
//Copy value to change children
//return newnode;
  
public class BST<T extends Comparable> implements BSTInterface<T>{
  public class Node<T extends Comparable>{
    
    public T element;
    public Node<T> child1;
    public Node<T> child2;
    
    public Node(T element){
      this.element=element;
    }
  }
  
  
  public int size;
  public Node<T> root;
  
  public BST(T rootElement){
    this.root=new Node<>(rootElement);
  }
  
  public int size(){return size;}
  public boolean isEmpty(){return size==0;}
  public void insert(T value){
    insertRecursive(value,root);
    size++;
  }
  
  private void insertRecursive(T value,Node<T> currentNode){
    
    if (value.compareTo(currentNode.element)<0){
      
      if (currentNode.child1==null){
        currentNode.child1=new Node<T>(value);
      }
      
      else{
        insertRecursive(value, currentNode.child1);
      }
      
    }
    else{
      
      if (currentNode.child2==null){
        currentNode.child2=new Node<T>(value);
      }
      else{
        insertRecursive(value, currentNode.child2);
      }
      
    }
    
  }
  
    public boolean has(T value){
      return hasRecursive(value, root);
    };
    
    private boolean hasRecursive(T value, Node curr){
      if (curr.element.compareTo(value)==0){
        return true;
      }
      
      else{
        
        if (value.compareTo(curr.element)<0 && curr.child1!=null){
          return hasRecursive(value, curr.child1);
        }
        
        else if (curr.child2!=null){
          return hasRecursive(value, curr.child2);
        }
      }
      return false;
    }
    
    
    public void remove(T value){}
    
    public void DFSPost(){
      DFSPostRecursive(root);
    }
    
    private void DFSPostRecursive(Node<T> curr){
      
      if (curr.child1!=null){
        DFSPostRecursive(curr.child1);
      }
      
      if (curr.child2!=null){
        DFSPostRecursive(curr.child2);
      }
      
      System.out.println(curr.element);
      
    }
 
    public void DFSIn(){
      DFSInRecursive(root);
    }
    
    private void DFSInRecursive(Node<T> curr){
      
      if (curr.child1!=null){
        DFSInRecursive(curr.child1);
      }
      
      System.out.println(curr.element);
      
      if (curr.child2!=null){
        DFSInRecursive(curr.child2);
      }
      
    } 
    
    
    public void DFSPre(){
      DFSPreRecursive(root);
    }
    
    private void DFSPreRecursive(Node<T> curr){
      
      System.out.println(curr.element);
      
      if (curr.child1!=null){
        DFSPreRecursive(curr.child1);
      }
      
      if (curr.child2!=null){
        DFSPreRecursive(curr.child2);
      }
      
    } 
    
    public void remove(T el){
      root=removeR(el, root);
    }
    
    private Node<T> removeR(T el, Node<T> curr) throws IllegalArgumentException{
      
      if (curr==null){
        throw new IllegalArgumentException();
      }
      
      else if (curr.element.compareTo(el)==0){
        
        if (curr.child1==null && curr.child2==null){
          return null;
        }
        
        else if (curr.child1==null ^ curr.child2==null){
          
          if curr.child1!=null{
            return curr.child1;
          }
          
          else{
            return curr.child2;
          }
          
        }
        
        else{
          
          curr2=curr.child1;
          
          while (curr2.child2!=null){
            curr2=curr2.child2;
          }
          
          curr.child1 = removeR(curr2.element,curr.child1)
          
          return curr2; 
          
        }
        
      }
      
      if (curr.element.compareTo(el)>0){
        curr.child1 = removeR(el,curr.child1);
      }
      
      else{
        curr.child2 = removeR(el,curr.child2);
      }
      
      return curr;
      

    }
    
    public void clear(){
      root=null;
      size=0;
    }
}
