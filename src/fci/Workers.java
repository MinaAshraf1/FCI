
package fci;

public class Workers extends Person implements Print{
    protected String Job;
    
    //CONSTRACTOR
    
    public Workers(){
    }
    
    public Workers(String Name, int Age, String Phone, String Address, String Nationality, Gender gender, String Job) {
        super(Name, Age, Phone, Address, Nationality, gender);
        this.Job = Job;
    }
    
    //SETTER
    
    public void setJob(String job) {
        this.Job = Job;
    }

    //GETTER
    
    public String getJob() {
        return Job;
    }

    //Enter
    
    @Override
    public void EnterData() {
        try {
        super.EnterData();
        System.out.println("Enter Your Job :");
        Job = in.next();
        } catch(Exception e) {
            System.out.println("Enter Valid Data");
        }
    }
    //PRINT
    
    @Override
    public void Print() {
        super.Print();
        System.out.println(Job);
    }
    
    @Override
    public String toString() {
        
        return super.toString() + Job ;
    }

}
