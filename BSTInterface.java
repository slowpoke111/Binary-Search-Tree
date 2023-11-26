public interface BSTInterface<T extends Comparable>{
  public int size();
  public boolean isEmpty();
  public void insert(T value);
  public boolean has(T value);
  public void remove(T value);
}
