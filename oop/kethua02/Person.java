
/**
 * The Person class represents an individual with a name and address.
 * It provides methods to access and modify these properties.
 */
public class Person {
    private String name;
    private String address;

    /**
     * Constructs a new {@code Person} with the specified name and address.
     *
     * @param name    the name of the person
     * @param address the address of the person
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Returns the name of the person.
     *
     * @return the name of the person
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the person.
     *
     * @param name the new name of the person
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the address of the person.
     *
     * @return the address of the person
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address of the person.
     *
     * @param address the new address of the person
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Returns a string representation of the {@code Person} object.
     *
     * @return a string representing the person's name and address
     */
    @Override
    public String toString() {
        return "Person["
                + "name=" + getName()
                + ",address=" + getAddress()
                + "]";
    }
}
