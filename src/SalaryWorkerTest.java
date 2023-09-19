import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    SalaryWorker s1;


    @BeforeEach
    void setUp() {
        s1 = new SalaryWorker("01111112", "Drew", "Drabek", "Student", 2000,40, 60000);
    }

    @Test
    void setAnnualSalary() {
        s1.setAnnualSalary(65000);
        assertEquals(65000,s1.getAnnualSalary());
    }

    @Test
    void calculateWeeklyPay() {
        s1.calculateWeeklyPay(40);
        assertEquals(1153.8461538461538,s1.calculateWeeklyPay(40));
    }

    @Test
    //created variables for this here because i could not figure out how to test for the output string so when i googled it i saw other people do this to make it easier
    public void displayWeeklyPay() {
        String expected = "Weekly Pay: $1153.8461538461538 (1/52 of Annual Salary: $60000.0)";
        String actual = s1.displayWeeklyPay(40.0);
        assertEquals(expected, actual);
    }
}