
public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    
    /**
     * Phuong thuc khoi tao khong co tham so.
     */
    public Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    /**
     * Phuong thuc khoi tao co tham so bao gom: name, id, and email.
     *
     * @param name  the student's name
     * @param id    the student's id
     * @param email the student's email address
     */    
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.group = "K62CB";
        this.email = email;
    }

    /**
     * Phuong thuc khoi tao sao chep.
     *
     * @param s the student 
     */
    public Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    // Getter và Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Phương thức getInfo
    public String getInfo() {
        return name + " - " + id + " - " + group + " - " + email;
    }
}

