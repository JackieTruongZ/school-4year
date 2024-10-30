

import java.util.LinkedHashMap;
import java.util.Map;

class StudentManagement {
    private Student[] students;
    private int studentCount;

    // Khởi tạo mảng chứa Student với kích thước tối đa là 100
    public StudentManagement() {
        students = new Student[100];
        studentCount = 0;
    }

    // Phương thức thêm Student
    public void addStudent(Student newStudent) {
        if (studentCount < students.length) {
            students[studentCount] = newStudent;
            studentCount++;
        } else {
            System.out.println("Mảng sinh viên đã đầy!");
        }
    }

    // Phương thức xóa Student theo Id
    public void removeStudent(String id) {
        for (int i = 0; i < studentCount; i++) {
            // Nếu tìm được Id Student
            if (students[i].getId().equals(id)) {
                // Xóa phần tử bằng cách dịch vị trí của từng phần tử trong mảng
                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }
                // Sau khi dịch thì chỉ cần đặt null cho phần tử cuối cùng của mảng
                students[studentCount - 1] = null;
                // Giảm count xuống 1
                studentCount--;
                System.out.println("Đã xóa sinh viên có mã số: " + id);
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên với mã số: " + id);
    }

    // Phương thức kiểm tra hai sinh viên có cùng lớp không
    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    // Phương thức trả về danh sách sinh viên theo lớp
    public String studentsByGroup() {
        StringBuilder result = new StringBuilder();
        // Sử dụng Hash Map để nhóm
        Map<String, StringBuilder> groupMap = new LinkedHashMap<>();

        // Nhóm sinh viên theo lớp học
        for (int i = 0; i < studentCount; i++) {
            String group = students[i].getGroup();
            if (!groupMap.containsKey(group)) {
                groupMap.put(group, new StringBuilder());
            }
            groupMap.get(group).append(students[i].getInfo()).append("\n");
        }

        // Append vào result
        for (Map.Entry<String, StringBuilder> entry : groupMap.entrySet()) {
            result.append(entry.getKey()).append("\n");
            result.append(entry.getValue());
        }
        // chuyển về String
        return result.toString();
    }

    // Phương thức main để kiểm tra
    public static void main(String[] args) {
        StudentManagement manager = new StudentManagement();

        // Tạo đối tượng sinh viên
        Student student1 = new Student("Nguyen Van An", "17020001", "17020001@vnu.edu.vn");
        manager.addStudent(student1);

        // Thêm sinh viên khác
        Student student2 = new Student("Tran Thi B", "17020002", "17020002@vnu.edu.vn");
        manager.addStudent(student2);

        // In danh sách sinh viên trước khi xóa
        System.out.println("Danh sách sinh viên:");
        System.out.println(manager.studentsByGroup());

        // Xóa sinh viên
        manager.removeStudent("17020001");

        // In danh sách sinh viên sau khi xóa
        System.out.println("Danh sách sinh viên sau khi xóa:");
        System.out.println(manager.studentsByGroup());
    }
}
