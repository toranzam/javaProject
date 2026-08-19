package datastructure.linkedlist;

public class ListNodeCustom {
  private String data; // |데이터|링크|
  public ListNodeCustom link; // 다음 데이터 주소

  public ListNodeCustom() {
    this.data = null;
    this.link = null;
  }

  public ListNodeCustom(String data) {
    this.data = data;
    this.link = null;
  }

  public ListNodeCustom(String data, ListNodeCustom link) {
    this.data = data;
    this.link = link;
  }

  public String getData() {
    return this.data;
  }

}
