

import java.util.List;

public class Course {
    List<Student>  students;

    public Course(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student s){
        students.add(s);
    }
    public void removeStudent(Student s){
        students.remove(s);
    }
    public int NumOfStudents(){
        return students.size();
    }



}
