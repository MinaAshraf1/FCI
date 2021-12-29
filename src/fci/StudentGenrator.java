
package fci;

public class StudentGenrator extends Student {
    
    protected double TotalGrades;
    protected double RateHours;
    
    //Constractor
    
    public StudentGenrator() {}
    
    public StudentGenrator(String Name, int Age, String Phone, String Address, String Nationality, Gender gender, int Level, String Spechialized, double TotalGrades, double RateHours) {
        super(Name, Age, Phone, Address, Nationality, gender, Level, Spechialized);
        this.TotalGrades = TotalGrades;
        this.RateHours = RateHours;
        GPA = TotalGrades / RateHours;
    }

    //Setter
    
    public void setTotalGrades(double TotalGrades) {
        this.TotalGrades = TotalGrades;
    }

    public void setRateHours(double RateHours) {
        this.RateHours = RateHours;
    }
    
    //Getter
    
    @Override
    public double getGPA() {
        try {
        return TotalGrades / RateHours;
        } catch(ArithmeticException e) {
            System.out.print("Enter valid hour");
            return 0;
        }
    }
    
    //Enter
    
    @Override
    public void EnterData() {
        try {
        super.EnterData();
        System.out.println("Enter Your Total Grades :");
        TotalGrades = in.nextInt();
        System.out.println("Enter Your Rate Hours :");
        RateHours = in.nextInt();
        } catch(Exception e) {
            System.out.println("Enter Valid Data");
        }
    }
    
    //PRINT
    
    @Override
    public void Print() {
        super.Print();
        System.out.printf("%.2f", this.getGPA());
        System.out.println("\n");
    }

    @Override
    public String toString() {
        
        return super.toString() + "\t\t" + this.getGPA();
    }
    
}
    
