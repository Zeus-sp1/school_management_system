package School_class;
import java.util.List;

import Student_class.Student;
import Teacher_class.Teacher;

/**
 * School will take multiple teachers and student
 */
public class School{

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    //Constructor
    // a new school object is created for list of teachers and student
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    //return List of teachers
    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    // To retrun the list of student to the school
    public List<Student> getStudents() {
        return students;
    }
    //Add student to the student list
    public void addStudent(Student student) {
        students.add(student);
    }

    //To return the total money earned by the school
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }


    //To return the total money spent
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    //To update the money spent by the school
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }

   
    

    

    

    

}