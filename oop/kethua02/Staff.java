
/**
 * The code Staff class represents a staff member, which is a specialized type of Person.
 * It includes additional attributes such as the school where the staff works and their pay.
 */
public class Staff extends Person {
    private String school;
    private double pay;

    /**
     * Constructs a new {@code Staff} member with the specified name, address, school,
     * and pay.
     *
     * @param name    the name of the staff member
     * @param address the address of the staff member
     * @param school  the school where the staff member works
     * @param pay     the payment for the staff member
     */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    /**
     * Returns the school where the staff member works.
     *
     * @return the school name
     */
    public String getSchool() {
        return school;
    }

    /**
     * Sets the school where the staff member works.
     *
     * @param school the new school name
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * Returns the pay for the staff member.
     *
     * @return the pay amount
     */
    public double getPay() {
        return pay;
    }

    /**
     * Sets the pay for the staff member.
     *
     * @param pay the new pay amount
     */
    public void setPay(double pay) {
        this.pay = pay;
    }

    /**
     * Returns a string representation of the {@code Staff} object.
     *
     * @return a string representing the staff member's name, address, school, and pay
     */
    @Override
    public String toString() {
        return "Staff["
                + super.toString()
                + ",school=" + getSchool()
                + ",pay=" + getPay()
                + "]";
    }
}
