
/**
 * The Student class represents a student, which is a specialized type of Person.
 * It includes additional attributes such as program of study, year of study, and fee.
 */
public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    /**
     * Constructs a new {@code Student} with the specified name, address, program,
     * year of study, and fee.
     *
     * @param name    the name of the student
     * @param address the address of the student
     * @param program the program of study for the student
     * @param year    the year of study for the student
     * @param fee     the fee for the student
     */
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    /**
     * Returns the program of study for the student.
     *
     * @return the program of study
     */
    public String getProgram() {
        return program;
    }

    /**
     * Sets the program of study for the student.
     *
     * @param program the new program of study
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * Returns the year of study for the student.
     *
     * @return the year of study
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the year of study for the student.
     *
     * @param year the new year of study
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Returns the fee for the student.
     *
     * @return the fee amount
     */
    public double getFee() {
        return fee;
    }

    /**
     * Sets the fee for the student.
     *
     * @param fee the new fee amount
     */
    public void setFee(double fee) {
        this.fee = fee;
    }

    /**
     * Returns a string representation of the {@code Student} object.
     *
     * @return a string representing the student's name, address, program, year, and fee
     */
    @Override
    public String toString() {
        return "Student["
                + super.toString() 
                + ",program=" + getProgram()
                + ",year=" + getYear()
                + ",fee=" + getFee()
                + "]";
    }
}
