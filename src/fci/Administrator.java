
package fci;

public class Administrator extends Person implements Print{
    protected String JobTitle;
    
    //Constractors

    public Administrator() {
    }

    public Administrator(String Name, int Age, String Phone, String Address, String Nationality, Gender gender, String JobTitle) {
        super(Name, Age, Phone, Address, Nationality, gender);
        this.JobTitle = JobTitle;
    }

    //Setter

    public void setJobTitle(String JobTitle) {
        this.JobTitle = JobTitle;
    }
    
    //Getter

    public String getJobTitle() {
        return JobTitle;
    }
    
    //Enter
    
    @Override
    public void EnterData() {
        try {
        super.EnterData();
        System.out.println("Enter Your JobTitle");
        JobTitle = in.next();
        } catch(Exception e) {
            System.out.println("Enter Valid Data");
        }
    }
    
    //Print
    
    @Override
    public void Print() {
        super.Print();
        System.out.println(this.getJobTitle());
    }
    
    @Override
    public String toString() {
        
        return super.toString() + JobTitle;
    }

}
