// VERSION 1 //
import java.util.Scanner;

interface AllowanceCalculator {
    double computeAllowance(double dailyAllowance, int weeks);
}

interface IncreaseCalculator {
    double applyIncrease(double allowance);
}

class AllowanceTracker implements AllowanceCalculator, IncreaseCalculator {

    @Override
    public double computeAllowance(double dailyAllowance, int weeks) {
        int days = weeks * 7;
        return dailyAllowance * days;
    }

    @Override
    public double applyIncrease(double allowance) {
        return allowance * 1.03; // 3% increase
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        AllowanceTracker tracker = new AllowanceTracker();

        System.out.print("Enter daily allowance: ");
        double dailyAllowance = input.nextDouble();

        int totalSemesters = 6;
        int weeksPerSemester = 18;

        for (int semester = 1; semester <= totalSemesters; semester++) {

            double allowance = tracker.computeAllowance(dailyAllowance, weeksPerSemester);

            // Apply increase every 2 semesters
            if (semester % 2 == 0) {
                allowance = tracker.applyIncrease(allowance);
                dailyAllowance *= 1.03;
                System.out.println("\nSemester " + semester + " (3% Increase Applied)");
            } else {
                System.out.println("\nSemester " + semester);
            }

            System.out.printf("Daily Allowance: %.2f\n", dailyAllowance);
            System.out.printf("Total Allowance: %.2f\n", allowance);
        }

        input.close();
    }
}

// VERSION 2 //

import java.util.Scanner;

interface AllowancePolicy {
    double calculate(double dailyAllowance, int weeks);
}

interface IncreasePolicy {
    double increase(double value);
}

class StandardAllowancePolicy implements AllowancePolicy {

    @Override
    public double calculate(double dailyAllowance, int weeks) {
        int totalDays = weeks * 7;
        return dailyAllowance * totalDays;
    }
}

class ThreePercentIncreasePolicy implements IncreasePolicy {

    @Override
    public double increase(double value) {
        return value * 1.03;
    }
}

class SemesterTracker {

    private final AllowancePolicy allowancePolicy;
    private final IncreasePolicy increasePolicy;

    private static final int TOTAL_SEMESTERS = 6;
    private static final int WEEKS_PER_SEMESTER = 18;

    public SemesterTracker(AllowancePolicy allowancePolicy, IncreasePolicy increasePolicy) {
        this.allowancePolicy = allowancePolicy;
        this.increasePolicy = increasePolicy;
    }

    public void run(double dailyAllowance) {

        for (int semester = 1; semester <= TOTAL_SEMESTERS; semester++) {

            double totalAllowance = allowancePolicy.calculate(dailyAllowance, WEEKS_PER_SEMESTER);

            if (semester % 2 == 0) {
                totalAllowance = increasePolicy.increase(totalAllowance);
                dailyAllowance = increasePolicy.increase(dailyAllowance);

                System.out.println("\nSemester " + semester + " (Increase Applied)");
            } else {
                System.out.println("\nSemester " + semester);
            }

            System.out.printf("Daily Allowance: %.2f\n", dailyAllowance);
            System.out.printf("Total Allowance: %.2f\n", totalAllowance);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter daily allowance: ");
        double dailyAllowance = input.nextDouble();

        AllowancePolicy allowancePolicy = new StandardAllowancePolicy();
        IncreasePolicy increasePolicy = new ThreePercentIncreasePolicy();

        SemesterTracker tracker = new SemesterTracker(allowancePolicy, increasePolicy);
        tracker.run(dailyAllowance);

        input.close();
    }
}
