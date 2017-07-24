import java.util.Scanner;
import java.util.ArrayList;

public class CarApp {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userInput;

        //pushing values into an array list  <> (second one can be kept blank, Peter likes to put something in them)
        ArrayList<Car> carInfo = new ArrayList<Car>();

        System.out.println("Welcome to the Grand Circus Motors Admin Console");
        System.out.println();

        System.out.println("How many cars are you entering:");
        userInput = scan.nextInt();
        System.out.println();

        //create for loop for user input
        for (int i = 0; i < userInput; i++) {

            //calls on the class car that was created before
            Car car = new Car();

            System.out.print("Enter Car " + "#" +(i + 1) + " Make:");
            car.setMake(scan.next());

            System.out.print("Enter Car " + "#" +(i + 1) + " Model:");
            car.setModel(scan.next());

            System.out.print("Enter Car " + "#" +(i + 1) + " Year:");
            car.setYear(scan.nextInt());

            System.out.print("Enter Car " + "#" +(i + 1) + " Price:");
            car.setPrice(scan.nextDouble());
            System.out.println();

            carInfo.add(car);

        }
        System.out.println("...");
        System.out.println("Current Inventory:");

        for (Car car1 : carInfo) {
            System.out.println(car1.getMake() + "\t" + car1.getModel() + " " + "\t" +
                    car1.getYear() + "\t" + "$" + car1.getPrice());

        }
        System.out.println("Thank you for using Grand Circus Motors Admin Console");
    }
}