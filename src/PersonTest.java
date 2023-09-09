import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person p1;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {

        p1 = new Person("000001", "Andrew", "Drabek", "Student", 2000);
    }

    @org.junit.jupiter.api.Test
    void setID() {
        p1.setID("000002");
        assertEquals("000002",p1.getID());
    }

    @org.junit.jupiter.api.Test
    void setFirstName() {
        p1.setFirstName("Drew");
        assertEquals("Drew",p1.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void setLastName() {
        p1.setLastName("Martin");
        assertEquals("Martin",p1.getLastName());
    }

    @org.junit.jupiter.api.Test
    void setTitle() {
        p1.setTitle("Worker");
        assertEquals("Worker",p1.getTitle());
    }

    @org.junit.jupiter.api.Test
    void setYearOfBirth() {
        p1.setYearOfBirth(2001);
        assertEquals(2001,p1.getYearOfBirth());
    }

    @org.junit.jupiter.api.Test
    void toCSV() {
    }

    @org.junit.jupiter.api.Test
    void fullName() {
        p1.FullName();
        assertEquals("Andrew Drabek", p1.FullName());
    }

    @org.junit.jupiter.api.Test
    void formalName() {
        p1.formalName();
        assertEquals("Student Andrew Drabek", p1.formalName());
    }

    @org.junit.jupiter.api.Test
    void getAge() {
        assertEquals("23",p1.getAge());
    }

    @org.junit.jupiter.api.Test
    void testGetAge() {
        assertEquals("20",p1.getAge(2020));
    }
}