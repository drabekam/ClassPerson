public class Worker extends Person
{
    private double hourlyPayRate = 0.00;


    public Worker(String ID, String firstName, String lastName, String title, int yearOfBirth, double hourlyPayRate) {
        super(ID, firstName, lastName, title, yearOfBirth);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "hourlyPayRate=" + hourlyPayRate +
                ", ID='" + this.getID() + '\'' +
                ", firstName='" + this.getFirstName() + '\'' +
                ", lastName='" + this.getLastName() + '\'' +
                ", Title='" + this.getTitle() + '\'' +
                ", YearOfBirth=" + this.getYearOfBirth() +
                '}';
    }

 /* When researching anything that I can use to create the methods for calculating the payscales and if there were any java libraries to make it easier I found the Math library.
    we might have learned about this programming one as well when using the random library  */

    public double calculateWeeklyPay(double weeklyWorkedHours) {
        double regularHours = Math.min(40, weeklyWorkedHours);
        double overtimeHours = Math.max(weeklyWorkedHours - 40, 0);
        double regularPay = regularHours * hourlyPayRate;
        double overtimePay = overtimeHours * (hourlyPayRate * 1.5);
        return regularPay + overtimePay;
    }

    //Remember the return allows you to store a value in a variable if you call this method as it will out put something based on the return value

    public String displayWeeklyPay(double weeklyWorkedHours) {
        double regularHours = Math.min(40, weeklyWorkedHours);
        double overtimeHours = Math.max(weeklyWorkedHours - 40, 0);
        double regularPay = regularHours * hourlyPayRate;
        double overtimePay = overtimeHours * (hourlyPayRate * 1.5);
        double totalPay = regularPay + overtimePay;

        String displayString = "Regular Hours: " + regularHours + "\n";
        displayString += "Regular Pay: $" + regularPay + "\n";
        displayString += "Overtime Hours: " + overtimeHours + "\n";
        displayString += "Overtime Pay: $" + overtimePay + "\n";
        displayString += "Total Pay: $" + totalPay;

        return displayString;
    }

}
