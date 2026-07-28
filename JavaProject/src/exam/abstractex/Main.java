package exam.abstractex;

public class Main {

  public static void main(String[] args) {

    DrawingObject ob1 = new Poly("red");
    DrawingObject ob2 = new Circle("blue");
    DrawingObject ob3 = new Rect("green");

    ob1.draw();
    ob2.draw();
    ob3.draw();
    
    
  }
}
