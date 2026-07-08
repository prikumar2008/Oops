package InnerClasses.java;

abstract class OuterP{
    abstract void display();
}
class Inner {
    public void meth(){
        OuterP O = new OuterP(){
            public void display(){
                System.out.println("pnc");
            }
        };
        O.display();
    }
}
public class AnonymousClass {
    public static void main(String[] args) {
        Inner i = new Inner();
        i.meth();
    }
}
