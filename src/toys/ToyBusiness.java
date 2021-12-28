package toys;


import toyproducts.models.HelicopterToy;
import toyproducts.models.CarToy;
import toyproducts.Toy;

public class ToyBusiness {
    private final SerialNumberGenerator serial = new SerialNumberGenerator(); 
    
    public Toy createToy(String type){
        switch(type) {
            case "car" :
                return this.createCar();
            case "helicopter":
                return this.createHelicopter();
            default:
                return null;
        }
    }
    
    private CarToy createCar(){
        CarToy newCar = new CarToy(this.serial.next());
        newCar.pack();
        newCar.label();
        return newCar;
    }
       
    private HelicopterToy createHelicopter(){
        
        HelicopterToy newHelicopter = new HelicopterToy(this.serial.next());
        newHelicopter.pack();
        newHelicopter.label();
        return newHelicopter;
    }
}
