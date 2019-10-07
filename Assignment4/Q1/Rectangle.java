package Assignment4.Q1;

public class Rectangle extends Shape {
    public  Rectangle(double h,double w){

        height = h;
        width = w;
        perimeter = 2*(height+width);
        area = height * width;

    }
    double height;
    double width;

    @Override
    public void getArea() {
        System.out.println(area);
    }

    @Override
    public void getPerimeter() {
        System.out.println(perimeter);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangular");
    }
}
