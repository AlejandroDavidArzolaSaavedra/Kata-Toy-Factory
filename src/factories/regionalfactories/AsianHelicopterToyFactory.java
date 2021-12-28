package factories.regionalfactories;
import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AsianHelicopterToy;

public class AsianHelicopterToyFactory extends ToyFactory {
      
    private AsianHelicopterToy createAsianHelicopter(Integer serialNumber){
        AsianHelicopterToy newHelicopter = new AsianHelicopterToy(serialNumber);
        return newHelicopter;
    }

    @Override
    public Toy createToy(Integer serialNumber) {
        return createAsianHelicopter(serialNumber);
    }
    
}
