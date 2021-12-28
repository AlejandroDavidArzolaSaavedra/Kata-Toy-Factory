package factories.regionalfactories;

import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AmericanHelicopterToy;

public class AmericanHelicopterToyFactory extends ToyFactory {

    @Override
    public Toy createToy(Integer serialNumber) {
        return createAmericanHelicopter(serialNumber);
    }
       
    private AmericanHelicopterToy createAmericanHelicopter(Integer serialNumber){
        AmericanHelicopterToy newHelicopter = new AmericanHelicopterToy(serialNumber);
        return newHelicopter;
    }
    
}
