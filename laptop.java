import java.util.Scanner; 
class Car {
    String model;
    int year;
    String color;
    Car(String m, int y, String c) {
        model = m;
        year = y;
        color = c;
    }
    void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }
}

public class laptop {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details for Car 1:");
        System.out.print("Enter Model: ");
        String model1 = scanner.nextLine();
        System.out.print("Enter Year: ");
        int year1 = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Color: ");
        String color1 = scanner.nextLine();

        Car car1 = new Car(model1, year1, color1);

        System.out.println("\nEnter details for Car 2:");
        System.out.print("Enter Model: ");
        String model2 = scanner.nextLine();
        System.out.print("Enter Year: ");
        int year2 = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Color: ");
        String color2 = scanner.nextLine();

        
        Car car2 = new Car(model2, year2, color2);
        
        System.out.println("\nCar 1 Details:");
        car1.displayDetails();

        System.out.println("\nCar 2 Details:");
        car2.displayDetails();
        scanner.close();
    }
}