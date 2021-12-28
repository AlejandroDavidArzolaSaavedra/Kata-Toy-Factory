package toyproducts.models;
import toyproducts.Toy;

public class AmericanSubmarineToy implements Toy {

    private final Integer serialNumber;
    private final String type;
    
    public AmericanSubmarineToy( Integer serialNumber){
        this.serialNumber = serialNumber;
        this.type = "Submarine";
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "AmericanSubmarineToy{" + "serialNumber=" + serialNumber + '}';
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
}



