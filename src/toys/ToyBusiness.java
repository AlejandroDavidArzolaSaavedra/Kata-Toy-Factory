package toys;

public class ToyBusiness {
    private final SerialNumberGenerator serial = new SerialNumberGenerator(); 
    
    public Car createCar(){
        Car newCar = new Car(this.serial.next());
        newCar.pack();
        newCar.label();
        return newCar;
    }
    
    public Helicopter createHelicopter(){
        Helicopter newHelicopter = new Helicopter(this.serial.next());
        newHelicopter.pack();
        newHelicopter.label();
        return newHelicopter;
    }
}
