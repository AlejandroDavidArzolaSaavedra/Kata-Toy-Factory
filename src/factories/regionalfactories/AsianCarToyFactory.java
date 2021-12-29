package factories.regionalfactories;
import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AsianCarToy;

public class AsianCarToyFactory extends ToyFactory {

    private AsianCarToy createAsianCar(Integer serialNumber){
        AsianCarToy newCar = new AsianCarToy(serialNumber);
        return newCar;
    }
    @Override
    public Toy createToy(Integer serialNumber) {
        return createAsianCar(serialNumber);
    }
}
