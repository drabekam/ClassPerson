import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import static java.nio.file.StandardOpenOption.CREATE;

public class PersonReader {

    public static void main(String[] args) {

        File selectedFile;
        ArrayList<Person> people = new ArrayList<>();
        JFileChooser chooser = new JFileChooser();

        final int FIELDS_LENGTH = 5;

        try {

            File workingDirectory = new File(System.getProperty("user.dir"));

            chooser.setCurrentDirectory(workingDirectory);

            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                selectedFile = chooser.getSelectedFile();
                Path file = selectedFile.toPath();

                InputStream in = new BufferedInputStream(Files.newInputStream(file, CREATE));
                BufferedReader reader = new BufferedReader(new InputStreamReader(in));

                System.out.println("ID#   Firstname       Lastname      Title     YOB");
                System.out.println("======================================================");

                String rec;
                while ((rec = reader.readLine()) != null) {
                    String[] fields = rec.split(",");
                    if (fields.length == FIELDS_LENGTH) {
                        String id = fields[0].trim();
                        String firstName = fields[1].trim();
                        String lastName = fields[2].trim();
                        String title = fields[3].trim();
                        int yob = Integer.parseInt(fields[4].trim());

                        Person person = new Person(id, firstName, lastName, title, yob);
                        people.add(person);
                    } else {
                        System.out.println("Found a record that may be corrupt: ");
                        System.out.println(rec);
                    }
                }
                reader.close();

                for (Person person : people) {
                    System.out.printf("\n%-8s%-25s%-25s%-6s%6d",
                            person.getID(), person.getFirstName(), person.getLastName(),
                            person.getTitle(), person.getYearOfBirth());
                }
            } else {
                System.out.println("Failed to choose a file to process");
                System.out.println("Run the program again!");
                System.exit(0);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!!!");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
