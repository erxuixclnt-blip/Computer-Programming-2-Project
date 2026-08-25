public class Main {
    public static void main(String[] args) {
        
        
        for(int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }

        for(int i = 5; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("getoff");

        for(int i = 1; i <= 10; i++) {
            if(i % 3 == 0) {
                System.out.println(i + " is even");
            }
        }

        int count = 1;
        while(count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }

        int count2 = 1;
        while(count2 <= 5) {
            System.out.println("Count2: " + count2);
            count2++;
            if(count2 == 3) break;
        }

        
        int day = 3;
        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid");
        }
        
    }
} 
