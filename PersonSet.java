import java.util.ArrayList;

/**
 * A class that implements the PersonList interface using an ArrayList.
 * This class ensures that no duplicate Person objects are added.
 */
public class PersonSet implements PersonList {
    protected ArrayList<Person> people;

    /**
     * Constructor for the PersonSet class.
     * Initializes the ArrayList to store Person objects.
     */
    public PersonSet() {
        people = new ArrayList<>();
    }

    /**
     * Adds a Person object to the set if it's not already present.
     * 
     * @param p The Person object to add
     */
    @Override
    public void add(Person p) {
        if (!people.contains(p)) {
            people.add(p);
        }
    }

    /**
     * Retrieves a Person object from the set at the specified index.
     * 
     * @param index The index of the Person object to retrieve
     * @return The Person object at the specified index
     */
    @Override
    public Person get(int index) {
        return people.get(index);
    }

    /**
     * Returns a string representation of all Person objects in the set.
     * 
     * @return A string containing all Person objects, one per line
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Person p : people) {
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }
}
