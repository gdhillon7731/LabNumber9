
public class Car {
    //create 4 instance variables
    private String make;
    private String model;
    private int year;
    private double price;

    //create no-argument constructor
    public Car() {
        make = "";
        model = "";
        year = 0;
        price = 0.0;
    }

    //create a 4 argument constructor
    public Car(String mk, String md, int y, double p){
        make = mk;
        model = md;
        year = y;
        price = p;
    }

    //create getters
    public String getMake(){

        return make;
    }

    public String getModel(){

        return model;
    }

    public int getYear(){

        return year;
    }

    public double getPrice(){

        return price;
    }

    //create setters
    public void setMake(String carMake) {

        make = carMake;
    }

    public void setModel(String carModel){

        this.model = carModel;
    }

    public void setYear(int carYear){

        this.year = carYear;
    }

    public void setPrice(double carPrice){
        this.price = carPrice;

    }
}