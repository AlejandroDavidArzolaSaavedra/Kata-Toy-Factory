package branches;
import business.ToyBusiness;
import toyproducts.Toy;
import toyproducts.models.AmericanCarToy;
import toyproducts.models.AmericanHelicopterToy;

public class AmericanToyBusiness extends ToyBusiness {
    
    public Toy createToy(String type){
      switch(type) {
            case "car" :
                return createAmericanCar();
            case "helicopter":
                return createAmericanHelicopter();
            default:
                return null;
        }  
}
         private AmericanCarToy createAmericanCar(){
            AmericanCarToy newCar = new AmericanCarToy(super.serial.next());
            newCar.pack();
            newCar.label();
            return newCar;
        }
       
    private AmericanHelicopterToy createAmericanHelicopter(){
        AmericanHelicopterToy newHelicopter = new AmericanHelicopterToy(super.serial.next());
        newHelicopter.pack();
        newHelicopter.label();
        return newHelicopter;
    }
}
