package Overriding.java;

class Car{
    public void start(){
        System.out.println("Car start");
    }
    public void changeGear(){
        System.out.println("Car Gear changed");
    }
    public void accelerator(){
        System.out.println("Car accelerator");
    }
}
class LuxuryCar extends Car{
    public void changeGear(){
        System.out.println("Luxury Car gear changed");
    }
    public void acOn(){
        System.out.println("Luxury Car acOn");
    }
}
public class OverridingExample {
    public static void main(String[] args) {
        LuxuryCar luxury = new LuxuryCar();
        luxury.start();
        luxury.changeGear();
        luxury.accelerator();
        luxury.acOn();
        //method dispacher
        Car car = new LuxuryCar();
        car.start();
        car.changeGear();//this is the overrided method ok so value will print of the object  wale method ki ok
        car.accelerator();
        //car.acOn(); //ye isliya work nahi karega kyuki reference dusri class ka hai chahe fir object bale hi isi class ka kyu na ho
    }


}
