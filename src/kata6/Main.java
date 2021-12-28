
package kata6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toys.Car;
import toys.Helicopter;
import toys.ToyBusiness;

public class Main {
    
  public static void main(String[] args) {
        ToyBusiness toyBusiness = new ToyBusiness();
        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Helicopter> hel = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        String line = null;
        while(!"exit".equals(line)){
            line = sc.nextLine();
                switch(line) {
                    case "car" :
                        cars.add(toyBusiness.createCar());
                        System.out.println("Built cars: "+ cars
                                .stream()
                                .map(c -> c.getSerialNumber().toString())
                                .collect(Collectors.joining(", ")));
                        break;
                    case "helicopter":
                        hel.add(toyBusiness.createHelicopter());
                        System.out.println("Built helicopter: "+ hel
                                .stream()
                                .map(c -> c.getSerialNumber().toString())
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
