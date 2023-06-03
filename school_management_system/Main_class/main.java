package Main_class;

import java.util.ArrayList;
import java.util.List;

import School_class.School;
import Student_class.Student;
import Teacher_class.Teacher;

public class main {
    public static void main(String[] args){

        Teacher samuel = new Teacher(1,"samuel", 500);
        Teacher mellissa = new Teacher(1, "mellissa", 600);
        Teacher vonda = new Teacher(1, "vonda", 00);

        List<Teacher> teacherlList = new ArrayList<>();
        teacherlList.add(mellissa);
        teacherlList.add(samuel);
        teacherlList.add(vonda);

        Student assana = new Student(1, "assana", 500);
        Student angela = new Student(1, "angela", 500);
        Student joy = new Student(1, "joy", 500);

        List<Student> studentList = new ArrayList<>();
        studentList.add( joy);
        studentList.add( angela);
        studentList.add(assana);

        School ghs = new School(teacherlList, studentList);

        
        //student paying fees
        joy.payFees(20000);
        System.out.println("GHS has earned" + ghs.getTotalMoneyEarned());
        angela.payFees(30000);
       System.out.println("GHS has earned" + ghs.getTotalMoneyEarned());

        //shool pays teachers salary
        samuel.recieveSalary(samuel.getSalary());
        samuel.recieveSalary(samuel.getSalary());
        System.out.println(samuel);
        
        System.out.println("GHS has paid" + samuel.getName()+" " + "and spent " + ghs.getTotalMoneyEarned());
    }

   
}
