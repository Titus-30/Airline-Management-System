# Airline Management System

## Introduction

The Airline Management System is a console-based Java program designed to simulate key operations of an airline. It covers aircraft details, flight management, employee roles, and ticket pricing. This program demonstrates core object-oriented programming concepts such as inheritance, polymorphism, and abstraction, making it a comprehensive example for educational purposes.

## Features

### Aircraft Management
   - Store details such as model number, capacity, and fuel consumption.
   - Calculate and display the range of an aircraft based on its fuel efficiency.

### Flight Management
   - Create and manage flight details for domestic and international flights.
   - Override methods to specialize flight duration calculations.

### Employee Management
   - Maintain employee records, such as pilots, with details like ID, name, and salary.
   - Perform role-specific actions, such as pre-flight checks by pilots.

### Ticket Management
   - Handle ticket details, including ticket ID, price, and seat number.
   - Apply discounts for economy-class tickets.

## Code Structure

### Classes and Hierarchies

#### Aircraft
- **`Aircraft` Class**
  - Represents the base class for all aircraft.
  - Stores attributes: model number, capacity, and fuel consumption.
  - Calculates aircraft range.

#### Flight
- **`Flight` Class**
  - Represents a flight with flight number, departure time, and destination.
  - Provides a method to calculate flight duration.
- **`DomesticFlight` Class**
  - Extends `Flight` to handle domestic-specific calculations.
- **`InternationalFlight` Class**
  - Extends `Flight` and adds customs check requirements.

#### Employee
- **`AirlineEmployee` Class**
  - Base class for employees, with attributes like ID, name, and base salary.
  - Provides a method to calculate salary.
- **`Pilot` Class**
  - Extends `AirlineEmployee` to include pilot-specific actions, such as pre-flight checks.

#### Ticket
- **`Ticket` Class**
  - Represents a basic ticket with attributes for ID, price, and seat number.
  - Provides a method to calculate the final price.
- **`EconomyTicket` Class**
  - Extends `Ticket` to apply a 10% discount for economy-class tickets.

### Main Class
- **`AirlineManagementSystem`**
  - Handles user inputs and displays data related to aircraft, flights, employees, and tickets.
  - Provides a menu-driven interface for interaction.

## How to Run

### Steps

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/airline-management-system.git
   ```

2. Navigate to the project directory:
   ```bash
   cd airline-management-system
   ```

3. Compile the program:
   ```bash
   javac AirlineManagementSystem.java
   ```

4. Run the program:
   ```bash
   java AirlineManagementSystem
   ```

5. Follow the prompts to input details and view output.

## Example Usage

1. Input aircraft details, including model number, capacity, and fuel consumption.
2. Provide flight details, such as flight number, departure time, and destination.
3. Add employee information for a pilot, including their ID, name, and base salary.
4. Enter ticket details, including ticket ID, price, and seat number.
5. View a summary of all entered details, including calculations for range, salary, and ticket discounts.

## Key Concepts Demonstrated

### Object-Oriented Programming
- **Inheritance**: Extending base classes for flights, employees, and tickets.
- **Polymorphism**: Overriding methods to provide specialized behavior.
- **Abstraction**: Abstracting shared properties and behaviors into base classes.

### Encapsulation
- Used private fields with getter and setter methods to manage access.

### User Interaction
- Engages users with a console-based interface for inputs and outputs.

## Future Enhancements

### Planned Features

- Add more employee roles, such as cabin crew and ground staff.
- Implement detailed scheduling and duration calculations with real-time validation.
- Store data persistently using files or databases.
- Introduce a graphical user interface (GUI) for better user experience.

## Contribution

Feel free to fork this repository and submit pull requests with improvements or new features.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

