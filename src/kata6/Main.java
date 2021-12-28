
package kata6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toys.Car;
import toys.SerialNumberGenerator;

public class Main {
    
    public static void main(String[] args) {
        SerialNumberGenerator generator = new SerialNumberGenerator();
        boolean bandera = false;
        ArrayList<Car> cars = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String line = null;
        while(!"exit".equals(line)){
            line = sc.nextLine();
            if(!line.equals("exit")){
                Car newCar = new Car(generator.next());
                newCar.pack();
                newCar.label();
                cars.add(newCar);
                System.out.println("Built cars: "+ cars
                        .stream()
                        .map(c -> c.getSerialNumber().toString())
                        .collect(Collectors.joining(", ")));
            }
        }
    }
    
}
