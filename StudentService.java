import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void updateStudent(int index, Student student) {
        if (index >= 0 && index < students.size()) {
            students.set(index, student);
        }
    }

    public void deleteStudent(int index) {
        if (index >= 0 && index < students.size()) {
            students.remove(index);
        }
    }
    public List<Student> searchStudents(String ism, String familiya, String hobby) {
        List<Student> results = new ArrayList<>(students);
        if (ism != null) {
            results.removeIf(s -> !s.getIsm().equals(ism));
        }
        if (familiya != null) {
            results.removeIf(s -> !s.getFamiliya().equals(familiya));
        }
        if (hobby != null) {
            results.removeIf(s -> !s.getHobbilar().contains(hobby));
        }
        return results;
    }
}


