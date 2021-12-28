package factories;
import toyproducts.Toy;

public abstract class ToyFactory {
    protected final SerialNumberGenerator serial = new SerialNumberGenerator();
    
    public Toy produceToy(String type){
        Toy toy = this.createToy(type);
        toy.pack();
        toy.label();
        return toy;
    }
    protected abstract Toy createToy(String type);
}

