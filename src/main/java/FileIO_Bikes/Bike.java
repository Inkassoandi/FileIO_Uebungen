package FileIO_Bikes;

public class Bike {

    String name;
    double power;
    double weight;
    double price;

    public Bike(String name, double power, double weight, double price) {
        this.name = name;
        this.power = power;
        this.weight = weight;
        this.price = price;
    }


    public double getNormalizedPower(){
        return this.getWeight() / this.getPower();
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bike [Name=" + name +"]";
    }
}
