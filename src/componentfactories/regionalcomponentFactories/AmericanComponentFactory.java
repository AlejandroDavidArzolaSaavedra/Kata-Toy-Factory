package componentfactories.regionalcomponentFactories;
import componentfactories.ComponentFactory;
import toyproducts.components.Engine;
import toyproducts.components.Propeller;
import toyproducts.components.RotorBlade;
import toyproducts.components.Wheel;
import toyproducts.components.american.AmericanEngine;
import toyproducts.components.american.AmericanPropeller;
import toyproducts.components.american.AmericanRotorBlade;
import toyproducts.components.american.AmericanWheel;

public class AmericanComponentFactory extends ComponentFactory {
    
    @Override
    public Wheel createWheel() {
        return new AmericanWheel();
    }

    @Override
    public Engine createEngine() {
        return new AmericanEngine();
    }

    @Override
    public RotorBlade createRotorBlade() {
        return new AmericanRotorBlade();
    }

    @Override
    public Propeller createPropeller() {
        return new AmericanPropeller();
    }

   
}
