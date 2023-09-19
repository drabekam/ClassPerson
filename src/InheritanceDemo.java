import java.util.ArrayList;
import java.util.List;



public class InheritanceDemo {
    public static void main(String[] args) {
        List<Worker> workers = new ArrayList<>();

        // Create Worker instances and add them to the list
        Worker worker1 = new Worker("W1", "Andrew", "Drabek", "Worker", 1990, 15.0);
        Worker worker2 = new Worker("W2", "Chloe", "Sillanpaa", "Worker", 1985, 18.0);
        Worker worker3 = new Worker("W3", "Maddie", "Drabek", "Worker", 1995, 16.5);

        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);

        // Create SalaryWorker instances and add them to the list
        SalaryWorker salaryWorker1 = new SalaryWorker("S1", "Parker", "Drabek", "SalaryWorker", 1980, 50,100000);
        SalaryWorker salaryWorker2 = new SalaryWorker("S2", "Jeremy", "Jackson", "SalaryWorker", 1975, 55,110000);
        SalaryWorker salaryWorker3 = new SalaryWorker("S3", "John", "Drabek", "SalaryWorker", 1990, 52,104000);

        workers.add(salaryWorker1);
        workers.add(salaryWorker2);
        workers.add(salaryWorker3);

        // Simulate three weekly pay periods
        for (int week = 1; week <= 3; week++) {
            System.out.println("Week " + week + " Payroll:");
            System.out.println("----------------------------------------");
            for (Worker worker : workers) {
                double hoursWorked;
                if (week == 2) {
                    // Week 2 is crunch time with 50 hours
                    hoursWorked = 50;
                } else {
                    // Week 1 and Week 3 are normal with 40 hours
                    hoursWorked = 40;
                }

                System.out.println(worker.getFirstName() + " " + worker.getLastName() + " (" + worker.getTitle() + "): $" + worker.calculateWeeklyPay(hoursWorked));
            }
            System.out.println();
        }
    }
}






