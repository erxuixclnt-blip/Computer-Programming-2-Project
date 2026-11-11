public class Color {

 public enum ColorEnum {
 RED, BLUE, GREEN, BLACK, WHITE, YELLOW
 

}
}


public class Model { 
    public enum ModelEnum {
        SEDAN, SUV, CONVERTIBLE, HATCHBACK
    }
}

public class Car {
    private int year;
    private Model.ModelEnum model;
    private Color.ColorEnum color;

    public Car(int yr, Model.ModelEnum m, Color.ColorEnum c) {
        year = yr;
        model = m;
        color = c;
    }

        public void display () {
            System.out.println("Year: " + year);
            System.out.println("Model: " + model);
            System.out.println("Color: " + color);
            System.out.println("----------");
        }
}


public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car(2014, Model.ModelEnum.SUV, Color.ColorEnum.RED);
        Car car2 = new Car(2020, Model.ModelEnum.SEDAN, Color.ColorEnum.BLACK);

        car1.display ();
        car2.display ();
    }
    
}
