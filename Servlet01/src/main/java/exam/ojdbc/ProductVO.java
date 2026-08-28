package exam.ojdbc;

public class ProductVO {

  private Long productId;
  private String productName;
  private int price;
  private int stock;

  public ProductVO() {
  }

  public ProductVO(Long productId, String productName, int price, int stock) {
    this.productId = productId;
    this.productName = productName;
    this.price = price;
    this.stock = stock;
  }

  public Long getProductId() {
    return productId;
  }

  public String getProductName() {
    return productName;
  }

  public int getPrice() {
    return price;
  }

  public int getStock() {
    return stock;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

}
