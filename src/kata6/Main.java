
package kata6;
import business.ToyBusiness;
import factories.regionalfactories.AmericanCarToyFactory;
import factories.regionalfactories.AmericanHelicopterToyFactory;
import factories.regionalfactories.AmericanSubmarineToyFactory;
import java.util.ArrayList;

import java.util.Scanner;
import java.util.stream.Collectors;
import toyproducts.Toy;

public class Main {
    
    public static void main(String[] args) {
        //AsianToyFactory asianCarToyFactory = new AsianToyFactory();
        ToyBusiness toyBusiness =  new ToyBusiness();
        toyBusiness.add("car", new AmericanCarToyFactory());
        toyBusiness.add("helicopter", new AmericanHelicopterToyFactory());
        toyBusiness.add("submarine", new AmericanSubmarineToyFactory());
        ArrayList<Toy> toys = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        String line = null;
        while(!"exit".equals(line)){
            line = sc.nextLine();
                switch(line) {
                    case "submarine" :
                    case "car" :
                    case "helicopter":
                        toys.add(toyBusiness.produceToy(line));
                        System.out.println("Built Toys: "+ toys
                                .stream()
                                .map((toy) -> {
                                    return toy.toString();
                                    })
                                .collect(Collectors.joining(", ")));
                        break;
                    case "exit":
                        System.out.println("Command Exit");
                        break;
                    default:
                        System.out.println("Unknown!");
                        break;
            }
        }
    }
}

