import java.util.Scanner;

class BarbershopService {
    private String serviceDescription;
    private double price;

    public void setServiceDescription(String service) {
        serviceDescription = service;
    }

    public void setPrice(double servicePrice) {
        price = servicePrice;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public double getPrice() {
        return price;
    }
}

public class CreateBarbershopServices {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double price;

        BarbershopService firstService = new BarbershopService();
        BarbershopService secondService = new BarbershopService();

        // First service
        System.out.print("Enter description for first service: ");
        String desc = keyboard.nextLine();

        System.out.print("Enter price for first service: ");
        price = keyboard.nextDouble();

        firstService.setServiceDescription(desc);
        firstService.setPrice(price);

        keyboard.nextLine();

        // Second service
        System.out.print("Enter description for second service: ");
        desc = keyboard.nextLine();

        System.out.print("Enter price for second service: ");
        price = keyboard.nextDouble();

        secondService.setServiceDescription(desc);
        secondService.setPrice(price);

        // Display Service Details
        System.out.println("\nService Details");
        System.out.println("Service 1: " + firstService.getServiceDescription());
        System.out.println("Price: $" + firstService.getPrice());
        System.out.println("Service 2: " + secondService.getServiceDescription());
        System.out.println("Price: $" + secondService.getPrice());
    }
}
