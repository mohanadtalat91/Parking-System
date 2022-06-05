# Parking-System
* This application manages a parking space for a configurable maximum number of vehicles.

# Stack
* Java, OOP, OOD, Design Patterns, SOLID principles.

# Functionalities

* Each vehicle shall be identified by a model name, unique identification number, Model year and vehicle dimensions (vehicle width and depth).
* Park-in function that marks the arrival time of a vehicle if there is an available slot. The application shall capture such time automatically from the system.
* During the park-in function the application shall pick a free slot based on the active slot configuration. There are two configurations (i) first come first served slots i.e., the park-in function will use the first free slot available from the parking garage slots. (ii) best-fit approach where you need to find the slot with the minimum dimension to hold the vehicle.
* Park-out function that marks the departure time of a vehicle from the garage. The application shall capture such time automatically from the system.
* Calculate the parking fees during the park-out based on the time-of-stay with an hourly rate of 5 EGP.
* Calculate the total income as well as the total number of vehicles that used the parking garage at any given point in time.
* Display the available parking slots
* Enrich your application with the capability to handle a set of exceptions that can happen during user interaction and through any other calculations. The displayed error message for exceptional behavior should be descriptive.
