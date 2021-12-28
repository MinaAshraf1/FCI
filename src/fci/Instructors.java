
package fci;

public class Instructors extends Person implements Print {
    protected String Subject;
    protected String JobTitle;

    //CONSTRACTOR
    
    public Instructors() {
    }

    public Instructors(String Name, int Age, String Phone, String Address, String Nationality, Gender gender, String Subject, String JobTitle) {
        super(Name, Age, Phone, Address, Nationality, gender);
        this.Subject = Subject;
        this.JobTitle = JobTitle;
    }
    
    //SETTER
    
    public void setSubject(String Subject) {
        this.Subject = Subject;
    }
    public void setJobtitle(String JobTitle) {
        this.JobTitle = JobTitle;
    }
    
    //GETTER
    
    public String getSubject() {
        return Subject;
    }

    public String getJobTitle() {
        return JobTitle;
    }

    //Enter
    
    @Override
    public void EnterData() {
        try {
        super.EnterData();
        System.out.println("Enter Your Subject :");
        Subject = in.next();
        System.out.println("Enter Your Job Title :");
        JobTitle = in.next();
        } catch(Exception e) {
            System.out.println("Enter Valid Data");
        }
    }
    
    //Print
    
    @Override
    public void Print() {
        super.Print();
        System.out.println(Subject + "\t" + JobTitle);
    }
    @Override
    public String toString() {
        
        return super.toString() + Subject + "\t\t" +  JobTitle + "\t\t";
    }
    
}
