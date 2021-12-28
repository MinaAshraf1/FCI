
package fci;

public class StudentUnGenerator extends Student {
    protected double TotalGrades;

    //CONSTRAACTOR
    
    public StudentUnGenerator() {
    }

    public StudentUnGenerator(String Name, int Age, String Phone, String Address, String Nationality, Gender gender, int Level, String Spechialized, double TotalGrades) {
        super(Name, Age, Phone, Address, Nationality, gender, Level, Spechialized);
        GPA = TotalGrades;
    }

    //SETTER
    
    public void setTotalGrades(double TotalGrades) {
        this.TotalGrades = TotalGrades;
    }
    
    //GETTER
    
    public double getGPA() {
        GPA = TotalGrades;
        return GPA;
    }
    
    //Enter
    @Override
    public void EnterData() {
        try {
        super.EnterData();
        System.out.println("Enter Your Total Grades :");
        TotalGrades = in.nextDouble();
        } catch(Exception e) {
            System.out.println("Enter Valid Data");
        }
    }
    //PRINT
    
    @Override
    public void Print() {
        super.Print();
        System.out.println(this.getGPA());
    }
    
    @Override
    public String toString() {
        return super.toString() + "\t\t" + GPA;
    }

}
