/**
 * CSCI 2251 --
 * 
 * Author: Zach Nowlin
 * Date: October 9, 2024
 * 
 * This project involves creating classes to manage Nintendo character data,
 * including reading from a file, removing duplicates, and creating new
 * sorted and unit-converted versions.
 */

public class Person {
    private String name;
    private double height; // in cm
    private double weight; // in kg

    public Person(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    // Getter methods
    public String getName() { return name; }
    public double getHeight() { return height; }
    public double getWeight() { return weight; }

    // Setter methods
    public void setHeight(double height) { this.height = height; }
    public void setWeight(double weight) { this.weight = weight; }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (o == this) return true;
        if (!(o instanceof Person)) return false;
        Person p = (Person) o;
        return this.name.equals(p.name) && 
               this.height == p.height && 
               this.weight == p.weight;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %.2f", name, height, weight);
    }
}
