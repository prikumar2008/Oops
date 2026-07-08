package InnerClasses.java;

class OuterIP{
    static int x=10;
    int y=20;
    static class Inner{
        void display(){
            System.out.println(x);
            //we can't access y here because we did not decleare static ok and in static class  we have declear it static then we can access it
            //System.out.println(y);
        }
    }
}
public class StaticClass {
    public static void main(String[] args){
        OuterIP.Inner i = new OuterIP. Inner();
        i.display();
    }
}
