package factories.regionalfactories;
import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AsianCarToy;
import toyproducts.models.AsianHelicopterToy;

public class AsianToyFactory extends ToyFactory {

    private AsianCarToy createAsianCar(){
        AsianCarToy newCar = new AsianCarToy(this.serial.next());
        return newCar;
    }
       
    private AsianHelicopterToy createAsianHelicopter(){
        AsianHelicopterToy newHelicopter = new AsianHelicopterToy(this.serial.next());
        return newHelicopter;
    }

    @Override
    public Toy createToy(String type) {
        switch(type) {
            case "car" :
                return createAsianCar();
            case "helicopter":
                return createAsianHelicopter();
            default:
                return null;
        }  
    }
    
}
