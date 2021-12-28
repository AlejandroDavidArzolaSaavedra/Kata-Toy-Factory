package factories;
import static factories.SerialNumberGenerator.getInstance;
import toyproducts.Toy;

public abstract class ToyFactory {
    
    public Toy produceToy(){
        Toy toy = this.createToy(getInstance().next());
        toy.pack();
        toy.label();
        return toy;
    }
    
    protected abstract Toy createToy(Integer serialNumber);
}

