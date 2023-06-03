package Student_class;

import School_class.School;

// This class is resonsible for keeping the track of student
// fees, name, grade and fees paid

public class Student{
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * To create a new student object by initializing
     * fees for every student is $30,000
     * fees paid initially is 0.
     * @param id id for the student: unique.
     * @param name name of the student.
     * @param grade grade of the student
     */

     public Student(
        int id, 
        String name, 
        int grade) {
            this.feesPaid = 0;
            this.feesTotal = 30000;
          this.id = id;
          this.name = name;
          this.grade = grade;   
     }

     /*
      * use to update student grade.
      @param grade new grade of the student.
      */
     public void setGrade(int grade){
        this.grade=grade;
     }

     /*
      *keep adding the fees to feesPaid Field.
      *Add the fees to the feesPaid 
      *The school is going to recieve the fund.
      *@param fees that the student pays
      */
     public void payFees(int fees){
        //feesPaid+=fess
        feesPaid=feesPaid + fees;
        School.updateTotalMoneyEarned(feesPaid);
     }

   

     /**
      * return all getter of parameter
      * @return
      */
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    //retrun the remaining fees
    public int getRemainingFees(){
        return feesTotal-= feesPaid;
    }

    //displays proper details of student
    @Override
    public String toString() {
        return "Student's name "+ name + " " + "Total fees paid so far $" + feesPaid;
    }

}
