package toyproducts.models;
import componentfactories.ComponentFactory;
import componentfactories.regionalcomponentFactories.AmericanComponentFactory;
import toyproducts.Toy;
import toyproducts.components.Engine;
import toyproducts.components.RotorBlade;

public class AmericanHelicopterToy implements Toy {
    private final Integer serialNumber;
    private final String type;
    private Engine engine;
    private RotorBlade rotorBlade;
    final private ComponentFactory componentFactory;
    public AmericanHelicopterToy( Integer serialNumber){
        this.serialNumber = serialNumber;
        this.type = "Helicopter";
        this.componentFactory = new AmericanComponentFactory();
    }

    @Override
    public String toString() {
        return "AmericanHelicopterToy{" + "serialNumber=" + serialNumber + '}';
    }

    public String getType() {
        return type;
    }

    @Override
    public Integer getSerialNumber() {
        return serialNumber;
    }
    
    @Override
    public void pack(){
        System.out.printf("Packing '%s': '%d'\n",this.getType(),this.getSerialNumber());
    }
    @Override
    public void label(){
        System.out.printf("Labelling '%s': '%d'\n",this.getType(),this.getSerialNumber());
    }

    @Override
    public void prepare() {
        this.engine = this.componentFactory.createEngine();
        this.rotorBlade = this.componentFactory.createRotorBlade();
        System.out.println("Motor y alas americanas listos");    
    }
}

