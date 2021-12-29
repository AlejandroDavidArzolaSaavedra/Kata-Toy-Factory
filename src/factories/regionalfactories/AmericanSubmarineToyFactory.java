package factories.regionalfactories;
import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AmericanSubmarineToy;

public class AmericanSubmarineToyFactory extends ToyFactory {

    @Override
    public Toy createToy(Integer serialNumber) {
        return createAmericanSubmarine(serialNumber);
    }
    
    private AmericanSubmarineToy createAmericanSubmarine(Integer serialNumber){
            AmericanSubmarineToy newSubmarine = new AmericanSubmarineToy(serialNumber);
            return newSubmarine;
        }   
}

