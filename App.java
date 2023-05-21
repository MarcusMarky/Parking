public class App {
    public static void main(String[] args) {
        Parking parking = new Parking();

        Car bmw = new Car("  BMW   ");
        Car fiat = new Car("  Fiat  ");
        Car mercedes = new Car("Mercedes");
        
       
        
        parking.parkCar(bmw, "1B");

        parking.parkCar(fiat, "1A");

        parking.parkCar(bmw, "2A");

        parking.parkCar(mercedes, "2C");

        System.out.println(parking.toString());
    }
}

