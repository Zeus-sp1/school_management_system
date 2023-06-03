package Teacher_class;

import School_class.School;

/*
 * This class is responsible for keeping teachers id,
 * name, and salary
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    public Teacher(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary= salary;
        this.salaryEarned = 0;
    }

    //get name of different teachers
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }


    //Teachers recieves salary
    //remove from the total money earned by the school
    public void recieveSalary(int salary) {
        salaryEarned+= salary;
        School.updateTotalMoneySpent(salary);
    }
}
