package exam.finalalgoex;

public class Product implements Comparable<Product> {
  private String productName;
  private int productStock;

  public Product(String productName) {
    this.productName = productName;
  }

  public Product(String productName, int productStock) {
    this.productName = productName;
    this.productStock = productStock;
  }

  // 문자열 비교
  @Override
  public int compareTo(Product o) {
    return this.productName.compareTo(o.productName);
  }

  @Override
  public String toString() {
    return productName + " : " + productStock + " ";
  }

  // Storage에서 사용
  public int getProduct(int quantity) {
    // 수량 부족
    if (quantity <= 0 || productStock < quantity) {
      return -1;
    }

    productStock -= quantity;

    if (productStock == 0) {
      return 0;
    }

    // 반출 성공
    return 1;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public int getProductStock() {
    return productStock;
  }

  public void setProductStock(int productStock) {
    this.productStock = productStock;
  }

}
