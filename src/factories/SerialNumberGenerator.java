package factories;

public class SerialNumberGenerator {
    private int serialNumber = 0;
    private static SerialNumberGenerator serialNumberGenerator = null;

    private SerialNumberGenerator() {
    }
    
    public static SerialNumberGenerator getInstance() {
        if(serialNumberGenerator == null) {
            serialNumberGenerator = new SerialNumberGenerator();
        }
        return serialNumberGenerator;
    }
    
    public Integer next(){
        return this.serialNumber++;
     }
}


