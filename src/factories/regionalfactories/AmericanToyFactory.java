package factories.regionalfactories;
import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AmericanCarToy;
import toyproducts.models.AmericanHelicopterToy;

public class AmericanToyFactory extends ToyFactory {

    @Override
    public Toy createToy(String type) {
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
            AmericanCarToy newCar = new AmericanCarToy(this.serial.next());
            return newCar;
        }
       
    private AmericanHelicopterToy createAmericanHelicopter(){
        AmericanHelicopterToy newHelicopter = new AmericanHelicopterToy(this.serial.next());
        return newHelicopter;
    }
    
}
