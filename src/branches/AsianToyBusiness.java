
package branches;
import business.ToyBusiness;
import toyproducts.Toy;
import toyproducts.models.AsianCarToy;
import toyproducts.models.AsianHelicopterToy;

public class AsianToyBusiness extends ToyBusiness {
    private AsianCarToy createAsianCar(){
        AsianCarToy newCar = new AsianCarToy(super.serial.next());
        newCar.pack();
        newCar.label();
        return newCar;
    }
       
    private AsianHelicopterToy createAsianHelicopter(){
        AsianHelicopterToy newHelicopter = new AsianHelicopterToy(super.serial.next());
        newHelicopter.pack();
        newHelicopter.label();
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
