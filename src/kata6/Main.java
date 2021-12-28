
package kata6;

import branches.AsianToyBusiness;
import business.ToyBusiness;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproducts.Toy;

public class Main {
    
    public static void main(String[] args) {
        //ToyBusiness toyBusiness = new AmericanToyBusiness();
        ToyBusiness toyBusiness =  new AsianToyBusiness();
        ArrayList<Toy> toys = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        String line = null;
        while(!"exit".equals(line)){
            line = sc.nextLine();
                switch(line) {
                    case "car" :
                    case "helicopter":
                        toys.add(toyBusiness.createToy(line));
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
