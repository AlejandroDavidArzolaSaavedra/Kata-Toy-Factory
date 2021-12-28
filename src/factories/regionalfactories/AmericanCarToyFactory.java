package factories.regionalfactories;
import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AmericanCarToy;

public class AmericanCarToyFactory extends ToyFactory {

    @Override
    public Toy createToy(Integer serialNumber) {
        return createAmericanCar(serialNumber);
    }
    
    private AmericanCarToy createAmericanCar(Integer serialNumber){
            AmericanCarToy newCar = new AmericanCarToy(serialNumber);
            return newCar;
        }   
}


