package componentfactories;
import toyproducts.components.RotorBlade;
import toyproducts.components.Wheel;
import toyproducts.components.Engine;
import toyproducts.components.Propeller;

public abstract class ComponentFactory {
    public abstract Wheel createWheel();
    public abstract Engine createEngine();
    public abstract RotorBlade createRotorBlade();
    public abstract Propeller createPropeller();
}
