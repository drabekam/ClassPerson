import java.time.Year;

public class Person {

//    a. ID  (a string)
//    b. firstName
//    c. lastName
//    d. Title
//    e. YearOfBirth

    private String ID;
    private String firstName;
    private String lastName;
    private String Title;
    private int YearOfBirth;

    private int year = 2023;

    public Person(String ID, String firstName, String lastName, String title, int yearOfBirth) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        Title = title;
        YearOfBirth = yearOfBirth;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getYearOfBirth() {
        return YearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        YearOfBirth = yearOfBirth;
    }


    @Override
    public String toString() {
        return "Person{" +
                "ID='" + ID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Title='" + Title + '\'' +
                ", YearOfBirth=" + YearOfBirth +
                '}';
    }

    public String toCSV()
    {
        return ID + ", " + firstName + ", " + lastName + ", " + Title + ", " + YearOfBirth;

    }

    public String FullName()
    {
        return firstName + " " + lastName;

    }

    public String formalName()
    {
        return Title + " " + FullName();
    }

    public String getAge() {
        int currentYear = Year.now().getValue();
        return calculateAge(currentYear, YearOfBirth);
    }

    public String getAge(int year) {
        return calculateAge(year, YearOfBirth);
    }


    private String calculateAge(int currentYear, int birthYear) {
        int age = currentYear - birthYear;
        return String.valueOf(age);
    }
}
