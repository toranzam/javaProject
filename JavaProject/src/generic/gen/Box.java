package generic.gen;

public class Box<T> {
  private T product;

  public void set(T product) {
    this.product = product;
  }

  public T get() {
    return this.product;
  }
}
