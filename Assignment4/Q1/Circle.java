package Assignment4.Q1;


import java.math.BigDecimal;
import java.text.DecimalFormat;

public class  Circle extends Shape {

    DecimalFormat bg = new DecimalFormat("#.00");
    public Circle(double r){
            name = "Circle";
            radius =r;
            perimeter = 2*radius*Math.PI;
            area = radius*radius*Math.PI;

        }

        @Override
        public void getArea() {
            System.out.println(bg.format(area));
        }

        @Override
        public void getPerimeter() {
            System.out.println(bg.format(perimeter));
        }

        @Override
        public void draw() {
            System.out.println("Drawing Circle");
        }

        double radius;
    }


