package toyproducts.models;
import toyproducts.Toy;

import toyproducts.Toy;

public class AsianHelicopterToy implements Toy {
    private final Integer serialNumber;
    private final String type;
    
    public AsianHelicopterToy( Integer serialNumber){
        this.serialNumber = serialNumber;
        this.type = "Asian Helicopter";
    }

    @Override
    public String toString() {
        return "AsianHelicopterToy{" + "serialNumber=" + serialNumber + '}';
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
        System.out.printf("Packing '%s': with S/N '%d'\n",this.getType(),this.getSerialNumber());
    }
    @Override
    public void label(){
        System.out.printf("Labelling '%s': with S/N '%d'\n",this.getType(),this.getSerialNumber());
    }
}
