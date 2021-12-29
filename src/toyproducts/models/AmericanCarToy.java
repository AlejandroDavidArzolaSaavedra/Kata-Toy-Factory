package toyproducts.models;
import componentfactories.ComponentFactory;
import componentfactories.regionalcomponentFactories.AmericanComponentFactory;
import toyproducts.Toy;
import toyproducts.components.Engine;
import toyproducts.components.Wheel;

public class AmericanCarToy implements Toy {
    private final Integer serialNumber;
    private final String type;
    private final Wheel wheels[] = new Wheel[4];
    private Engine engine;
    final private ComponentFactory componentFactory;
    
    public AmericanCarToy( Integer serialNumber){
        this.serialNumber = serialNumber;
        this.type = "Car";
        this.componentFactory = new AmericanComponentFactory();
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "AmericanCarToy{" + "serialNumber=" + serialNumber + '}';
    }

    @Override
    public Integer getSerialNumber() {
        return serialNumber;
    }
    
    @Override
    public void pack(){
        System.out.printf("Packing '%s':'%d'\n",this.getType(),this.getSerialNumber());
    }
    @Override
    public void label(){
        System.out.printf("Labelling '%s':'%d'\n",this.getType(),this.getSerialNumber());
    }

    @Override
    public void prepare() {
        this.engine = this.componentFactory.createEngine();
        for(int i = 0; i<this.wheels.length;i++){
            this.wheels[i] = this.componentFactory.createWheel();
        }
        System.out.println("Ruedas y motor americanos listos");
    }
}
