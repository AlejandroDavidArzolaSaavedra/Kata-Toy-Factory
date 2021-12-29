package componentfactories.regionalcomponentFactories;

import componentfactories.ComponentFactory;
import toyproducts.components.Engine;
import toyproducts.components.Propeller;
import toyproducts.components.RotorBlade;
import toyproducts.components.Wheel;
import toyproducts.components.asian.AsianEngine;
import toyproducts.components.asian.AsianPropeller;
import toyproducts.components.asian.AsianRotorBlade;
import toyproducts.components.asian.AsianWheel;

public class AsianComponentFactory extends ComponentFactory {
    ComponentFactory componentFactory;
    @Override
    public Wheel createWheel() {
        return new AsianWheel();
    }

    @Override
    public Engine createEngine() {
        return new AsianEngine();
    } 

    @Override
    public RotorBlade createRotorBlade() {
        return new AsianRotorBlade();
    }

    @Override
    public Propeller createPropeller() {
        return new AsianPropeller();
    }
}
