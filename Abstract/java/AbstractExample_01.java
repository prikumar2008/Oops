package Abstract.java;

abstract class Shape {
    abstract public double perimeter();

    abstract public double area();
}

class Circle extends Shape{
    int r;
    Circle(int r){
        this.r  = r;
    }
    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }
    @Override
    public double area() {
        return Math.PI * r * r;
    }
}
class Rectangle extends Shape{
    int l , b ;
    Rectangle(int l, int b){
        this.l = l;
        this.b = b;
    }
    @Override
    public double perimeter(){
        return 2*(l+b);
    }
    @Override
    public double area() {
        return l * b;
    }
}
public class AbstractExample_01 {
    public static void main(String[] args) {
        Shape sc = new Circle(5);
        System.out.println("area of Circle" + sc.area());
        System.out.println("perimeter of Circle" + sc.perimeter());
        Shape sc2 = new Rectangle(2,3);
        System.out.println(sc2.area());
        System.out.println(sc2.perimeter());
    }
}
