package toys;

public class Car {
    private final Integer serialNumber;
    private final String type;
    
    public Car( Integer serialNumber){
        this.serialNumber = serialNumber;
        this.type = "Car";
    }

    public String getType() {
        return type;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }
    
    public void pack(){
        System.out.printf("Packing '%s': with S/N '%d'\n",this.getType(),this.getSerialNumber());
    }
    public void label(){
        System.out.printf("Labelling '%s': with S/N '%d'\n",this.getType(),this.getSerialNumber());
    }
}
