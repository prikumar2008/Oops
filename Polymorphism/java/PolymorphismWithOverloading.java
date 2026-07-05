package Polymorphism.java;


//polymorphism achieved by the use of method overloading ok in a same class and it could be in different class is well ok
class Test{
    public int max(int a , int b){
        return a>b?a:b;
    }
    public int max(int a, int b, int c){
        if(a>b && a>c) return a;
        else if(b>a && b>c) return b;
        else return c;
    }
}
public class PolymorphismWithOverloading {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.max(3,8));
        System.out.println(t.max(3,8,9));
    }
}
