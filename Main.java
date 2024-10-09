import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Test Person and PersonSet
        Person testPerson = new Person("Test", 170.0, 70.0);
        PersonSet personSet = new PersonSet();

        // Read data from hr.txt
        try {
            Scanner fileReader = new Scanner(new File("hr.txt"));
            
            // Skip the header line
            if (fileReader.hasNextLine()) {
                fileReader.nextLine();
            }

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine().trim();
                if (!line.isEmpty()) {
                    String[] parts = line.split("\\s+");
                    if (parts.length == 3) {
                        String name = parts[0];
                        try {
                            double height = Double.parseDouble(parts[1]);
                            double weight = Double.parseDouble(parts[2]);
                            
                            Person person = new Person(name, height, weight);
                            personSet.add(person);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid data format for line: " + line);
                        }
                    } else {
                        System.out.println("Invalid line format: " + line);
                    }
                }
            }

            fileReader.close();

            // Display the data
            System.out.println("Data from hr.txt (duplicates removed):");
            System.out.println(personSet);

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
