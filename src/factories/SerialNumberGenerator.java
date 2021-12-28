package factories;

public class SerialNumberGenerator {
    private int serialNumber = 0;
    
    public Integer next(){
        return this.serialNumber++;
     }
}

