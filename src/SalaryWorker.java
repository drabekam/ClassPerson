public class SalaryWorker extends Worker
{
    double annualSalary = 0;

    public SalaryWorker(String ID, String firstName, String lastName, String title, int yearOfBirth, double hourlyPayRate, double annualSalary) {
        super(ID, firstName, lastName, title, yearOfBirth, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    @Override
    public String toString() {
        return "SalaryWorker{" +
                "annualSalary=" + annualSalary + '\'' +
                ", hourlyPayRate=" + this.getHourlyPayRate() + '\'' +
                ", ID='" + this.getID() + '\'' +
                ", firstName='" + this.getFirstName() + '\'' +
                ", lastName='" + this.getLastName() + '\'' +
                ", Title='" + this.getTitle() + '\'' +
                ", YearOfBirth=" + this.getYearOfBirth() +
                '}';
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }


    @Override
    public double calculateWeeklyPay(double hoursworked){
        return annualSalary / 52.0;
    }

    @Override
    //remember here it does not matter for the property leave the weeklyworkedhours so that it follows the same pattern as the returned value in calculate weekly pay is the annualy salary devided by
    public String displayWeeklyPay(double weeklyWorkedHours) {
        double weeklyPay = calculateWeeklyPay(weeklyWorkedHours);
        return "Weekly Pay: $" + weeklyPay + " (1/52 of Annual Salary: $" + annualSalary + ")";
    }
}
