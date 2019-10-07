package Assignment4.Q1;

public  class Square extends Shape {

          public  Square(double s){

              side = s;
              perimeter = 4*side;
              area = side*side;
          }
          double side;

    @Override
    public void getPerimeter() {
        System.out.println(perimeter);

    }

    @Override
    public void getArea() {
        System.out.println(area);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}
