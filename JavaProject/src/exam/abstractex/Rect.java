package exam.abstractex;

public class Rect extends DrawingObject{

  String color;

  public Rect(String color) {
    this.color = color;
  }

  @Override
  public void draw() {
    System.out.println(color + "색상으로 사각형 그리기");
  }
}
