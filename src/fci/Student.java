
package fci;

public abstract class Student extends Person implements Print{
    protected int Level;
    protected String Spechialized;
    protected double GPA;
    
    //CONSTRACTOR
    
    public Student() {}
    
    public Student(String Name, int Age, String Phone, String Address, String Nationality, Gender gender, int Level, String Spechialized) {
        super(Name, Age, Phone, Address, Nationality, gender);
        this.Level = Level;
        this.Spechialized = Spechialized;
    }
    
    //SETTER
    
    public void setLevel(int Level) {
        this.Level = Level;
    }
    
    public void setSpechialized(String Spechialized) {
       this.Spechialized = Spechialized;
    }
    
    /*
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    */
    
    //GETTER
    
    public int getLevel() {
        return Level;
    }
    
    public String getSpechialized() {
        return Spechialized;
    }
    
    public abstract double getGPA();
    
    //Enter
    
    @Override
    public void EnterData() {
        try {
        super.EnterData();
        System.out.println("Enter Your Level :");
        Level = in.nextInt();
        System.out.println("Enter Your Spechialized :");
        Spechialized = in.next();
        } catch(Exception e) {
            System.out.println("Enter Valid Data");
        }
    }
    //PRINT
    
    @Override
    public void Print() {
        super.Print();
        System.out.print(this.getLevel() + "\t" + this.getSpechialized() + "\t\t");
    }

    @Override
    public String toString() {
       
        return super.toString() + Level + "\t\t" + Spechialized + "\t" ;
    }
    
}
