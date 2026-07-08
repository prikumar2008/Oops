package InnerClasses.java;
class Outer{
    int x = 10;
    Inner i = new Inner();
    class Inner{
        int y = 20;
        public void innerDisplay(){
            System.out.println(x+" "+y);    //we can access member of outer class directly in the inner class
        }
    }
    public void outerDisplay(){
        i.innerDisplay();
        System.out.println(i.y);    //but in outer class method we have to create object for accessing the inner class member
    }
}

public class NestedInnerClass {
    public static void main(String []args){
//            Outer o = new Outer();
//            o.outerDisplay();  (      // flow>>> we call outerDisplay method it call innerDisplay method

        //with this method we can directly access the inner class method ok
        Outer.Inner oi = new Outer().new Inner();
        oi.innerDisplay();
    }

}
