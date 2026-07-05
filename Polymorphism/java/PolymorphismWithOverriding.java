package Polymorphism.java;

//here we already know that only one way to get polymorphism that is using two different class ok.
class Super{
    public void display(){
        System.out.println("Super Prince");
    }
}
class Sub extends Super{
    public void display(){
        System.out.println("Sub Nisha");
    }
}
public class PolymorphismWithOverriding {
    public static void main(String[] args) {
        Super s = new Sub();
                            //here at runtime point will decide which method be call ok because all things depends on the object ok
        s.display();
    }
}
