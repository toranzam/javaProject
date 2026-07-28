package exam.abstractex;

public class Poly  extends DrawingObject{

  String color;

  public Poly(String color) {
    this.color = color;
  }

  @Override
  public void draw() {
    System.out.println(color + "색상으로 선 그리기");
  }
  
}
