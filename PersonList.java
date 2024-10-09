/**
 * Interface defining the basic operations for a list of Person objects.
 */
public interface PersonList {
    /**
     * Adds a Person object to the list.
     * 
     * @param p The Person object to add
     */
    void add(Person p);

    /**
     * Retrieves a Person object from the list at the specified index.
     * 
     * @param index The index of the Person object to retrieve
     * @return The Person object at the specified index
     */
    Person get(int index);
}
