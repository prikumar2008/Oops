package InnerClasses.java;

class OuterI{
    void Display(){                 //this class define inside a method ok
        class Inner{
            void innerDisplay(){
                System.out.println("Inner Display");
            }
        }
//        Inner i = new Inner();
//        i.innerDisplay();
                                //we can write like above given two lines using the anonymous class
        new Inner().innerDisplay(); //this will also work and save your space ok
    }
}
public class LocalClass {
    public static void main(String[] args) {
        OuterI obj = new OuterI();
        obj.Display();
    }
}
