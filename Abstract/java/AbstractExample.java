package Abstract.java;

abstract class Kfc {
    public void MakeItem(){
        System.out.println("Making Item");
    }
    abstract void billing();
    abstract void offer();

}
class MyKfc extends Kfc{
    public void billing(){
        System.out.println("billing");
    }
    public void offer(){
        System.out.println("festival offer provided");
    }
}
public class AbstractExample {
    public static void main(String[] args) {
        Kfc kf = new MyKfc();
        kf.billing();
        kf.offer();
    }
}
