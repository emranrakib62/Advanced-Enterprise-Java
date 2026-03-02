

package mavenproject1;

/**
 *
 * @author Emranul Hoque
 */
public class Main {

    public static void main(String[] args) {
       Bus bus = new Bus();

        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleId("BUS-101");

        System.out.println("Vehicle ID: " + vehicle.getVehicleId());

        bus.showTransportType();
        bus.calculateFare(10);

        bus.addPassenger(5);
        bus.addPassenger(3, 25.5);
    }
}
