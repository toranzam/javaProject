package exam.abstractex;

public class Circle extends DrawingObject{

  String color;

  public Circle(String color) {
    this.color = color;
  }

  @Override
  public void draw() {
    System.out.println(color + "색상으로 원 그리기");
  }
}
