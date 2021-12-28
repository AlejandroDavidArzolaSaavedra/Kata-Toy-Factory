
package kata6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toys.Car;
import toys.Helicopter;
import toys.SerialNumberGenerator;

public class Main {
    
    public static void main(String[] args) {
        SerialNumberGenerator generator = new SerialNumberGenerator();
        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Helicopter> hel = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        String line = null;
        while(!"exit".equals(line)){
            line = sc.nextLine();
                switch(line) {
                    case "car" :
                        Car newCar = new Car(generator.next());
                        newCar.pack();
                        newCar.label();
                        cars.add(newCar);
                        System.out.println("Built cars: "+ cars
                                .stream()
                                .map(c -> c.getSerialNumber().toString())
                                .collect(Collectors.joining(", ")));
                        break;
                    case "helicopter":
                        Helicopter newHelicopter = new Helicopter(generator.next());
                        newHelicopter.pack();
                        newHelicopter.label();
                        hel.add(newHelicopter);
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
