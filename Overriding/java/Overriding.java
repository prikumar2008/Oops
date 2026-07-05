package Overriding.java;

class Tv{
    public void switchOn(){
        System.out.println("Switch On");
    }
    public void channelChange(){
        System.out.println("channel changed ok");
    }
    public void display(){
        System.out.println("pnc");
    }

}
class SmartTv extends Tv {
    @Override
    public void switchOn(){
        System.out.println("Switch On");
    }
    @Override
    public void channelChange(){
        System.out.println("channel changed ok");
    }
    public void powerOff(){
        System.out.println("Power Off");
    }
    public void browser(){
        System.out.println("Browsering started");
    }
}
public class Overriding {
    public static void main(String[] args) {
//        Tv tv = new Tv();
//        tv.switchOn();
//        tv.channelChange();

//       SmartTv s = new SmartTv();
//       s.channelChange();
//       s.powerOff();
//       s.browser();
//       s.display();

        //here is a important and notice able thing that is see we can  use object of the sub class in the reference of the parent class
        Tv t = new SmartTv();
        t.channelChange();
        t.switchOn();
//        t.browser(); //we can't access them ok only overrided method will call only ok
//        t.powerOff();

//        SmartTv st = new Tv();      //this thing what i am talking about we can't take reference class sub and object of the parent class ok


    }
}
