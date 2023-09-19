import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    Worker w1;
    double weeklyPay;

    @BeforeEach
    void setUp() {

        w1 = new Worker("01111111", "Andrew", "Drabek", "Student", 2000, 35.00);

    }


    @Test
    void setHourlyPayRate() {
        w1.setHourlyPayRate(40.00);
        assertEquals(40.00, w1.getHourlyPayRate());
    }

    @Test
    void calculateWeeklyPay() {
        w1.calculateWeeklyPay(40.00);
        assertEquals(1400.00, w1.calculateWeeklyPay(40.00));
    }

    @Test
    //tjos is the same thign as the other test where i could not figure out how do this and then i saw people have them in variable so i created variables and then called the variabels in my assertEquals statement
    void displayWeeklyPay() {
            String expected = "Regular Hours: 40.0\n" +
                    "Regular Pay: $1400.0\n" +
                    "Overtime Hours: 0.0\n" +
                    "Overtime Pay: $0.0\n" +
                    "Total Pay: $1400.0";
            String actual = w1.displayWeeklyPay(40.0); // Assuming 40 hours worked per week
            assertEquals(expected, actual);
        }
    }