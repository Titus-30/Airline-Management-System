import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

// Aircraft Hierarchy
class Aircraft {
    private String modelNumber;
    private int capacity;
    private double fuelConsumption;

    public Aircraft(String modelNumber, int capacity, double fuelConsumption) {
        this.modelNumber = modelNumber;
        this.capacity = capacity;
        this.fuelConsumption = fuelConsumption;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public double calculateRange() {
        return 10000 / fuelConsumption; // Simplified calculation
    }
}

// Flight Management
class Flight {
    private String flightNumber;
    private String departureTime;
    private String destination;

    public Flight(String flightNumber, String departureTime, String destination) {
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        this.destination = destination;
    }

    public String calculateDuration() {
        return "Duration calculated based on route.";
    }
}

class DomesticFlight extends Flight {
    public DomesticFlight(String flightNumber, String departureTime, String destination) {
        super(flightNumber, departureTime, destination);
    }

    @Override
    public String calculateDuration() {
        return "Domestic flight duration calculated.";
    }
}

class InternationalFlight extends Flight {
    private boolean customsCheckRequired;

    public InternationalFlight(String flightNumber, String departureTime, String destination, boolean customsCheckRequired) {
        super(flightNumber, departureTime, destination);
        this.customsCheckRequired = customsCheckRequired;
    }

    @Override
    public String calculateDuration() {
        return "International flight duration calculated.";
    }
}

// Employee Management
class AirlineEmployee {
    private String employeeID;
    private String name;
    private double baseSalary;

    public AirlineEmployee(String employeeID, String name, double baseSalary) {
        this.employeeID = employeeID;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }
}

class Pilot extends AirlineEmployee {
    public Pilot(String employeeID, String name, double baseSalary) {
        super(employeeID, name, baseSalary);
    }

    public void performPreFlightCheck() {
        System.out.println("Pilot is performing pre-flight checks.");
    }
}

class Ticket {
    private String ticketID;
    private double price;
    private String seatNumber;

    public Ticket(String ticketID, double price, String seatNumber) {
        this.ticketID = ticketID;
        this.price = price;
        this.seatNumber = seatNumber;
    }

    public double calculateFinalPrice() {
        return price;
    }
}

class EconomyTicket extends Ticket {
    public EconomyTicket(String ticketID, double price, String seatNumber) {
        super(ticketID, price, seatNumber);
    }

    @Override
    public double calculateFinalPrice() {
        return super.calculateFinalPrice() * 0.9; // 10% discount
    }
}

// Main Class
public class AirlineManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Aircraft Details
        System.out.print("Enter Aircraft Model Number: ");
        String modelNumber = scanner.nextLine();

        System.out.print("Enter Aircraft Capacity: ");
        int capacity = scanner.nextInt();

        System.out.print("Enter Aircraft Fuel Consumption (per km): ");
        double fuelConsumption = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        Aircraft aircraft = new Aircraft(modelNumber, capacity, fuelConsumption);

        // Input Flight Details
        System.out.print("Enter Flight Number: ");
        String flightNumber = scanner.nextLine();

        System.out.print("Enter Departure Time: ");
        String departureTime = scanner.nextLine();

        System.out.print("Enter Destination: ");
        String destination = scanner.nextLine();

        Flight flight = new Flight(flightNumber, departureTime, destination);

        // Input Employee Details
        System.out.print("Enter Pilot ID: ");
        String pilotID = scanner.nextLine();

        System.out.print("Enter Pilot Name: ");
        String pilotName = scanner.nextLine();

        System.out.print("Enter Pilot Base Salary: ");
        double pilotSalary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        Pilot pilot = new Pilot(pilotID, pilotName, pilotSalary);

        // Input Ticket Details
        System.out.print("Enter Ticket ID: ");
        String ticketID = scanner.nextLine();

        System.out.print("Enter Ticket Price: ");
        double ticketPrice = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Seat Number: ");
        String seatNumber = scanner.nextLine();

        EconomyTicket ticket = new EconomyTicket(ticketID, ticketPrice, seatNumber);

        // Display all information
        System.out.println("\n--- Aircraft Details ---");
        System.out.println("Model Number: " + aircraft.getModelNumber());
        System.out.println("Capacity: " + aircraft.getCapacity());
        System.out.println("Range: " + aircraft.calculateRange() + " km");

        System.out.println("\n--- Flight Details ---");
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Departure Time: " + departureTime);
        System.out.println("Destination: " + destination);

        System.out.println("\n--- Pilot Details ---");
        System.out.println("Pilot ID: " + pilotID);
        System.out.println("Name: " + pilotName);
        System.out.println("Salary: " + pilot.calculateSalary());
        pilot.performPreFlightCheck();

        System.out.println("\n--- Ticket Details ---");
        System.out.println("Ticket ID: " + ticketID);
        System.out.println("Price: $" + ticket.calculateFinalPrice());
        System.out.println("Seat Number: " + seatNumber);

        scanner.close();
    }
}
