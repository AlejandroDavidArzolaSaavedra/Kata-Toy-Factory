package factories.regionalfactories;

import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AsianSubmarineToy;

public class AsianSubmarineToyFactory extends ToyFactory {
      
    private AsianSubmarineToy createAsianSubmarine(Integer serialNumber){
        AsianSubmarineToy newSubmarine = new AsianSubmarineToy(serialNumber);
        return newSubmarine;
    }

    @Override
    public Toy createToy(Integer serialNumber) {
        return createAsianSubmarine(serialNumber);
    }
    
}
