
package kata6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproducts.Toy;
import toys.ToyBusiness;

public class Main {
    
    public static void main(String[] args) {
        
        ToyBusiness toyBusiness = new ToyBusiness();
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
                                .map(Object::toString)
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
