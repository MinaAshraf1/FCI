
package fci;

public class Technicals extends Person implements Print{
    protected String ResponsabelForLab;

    //CONSTRACTOR
    
    public Technicals() {
    }
    
    public Technicals(String Name, int Age, String Phone, String Address, String Nationality, Gender gender, String ResponsabelForLab) {
        super(Name, Age, Phone, Address, Nationality, gender);
        this.ResponsabelForLab = ResponsabelForLab;
    }
    
    //SETTER
    
    public void setResponsabelForLab(String ResponsabelForLab) {
        this.ResponsabelForLab = ResponsabelForLab;
    }
    
    //GETTER
    
    public String getResponsabelForLab() {
        return ResponsabelForLab;
    }

    //Enter
    
    @Override
    public void EnterData() {
        try {
        super.EnterData();
        System.out.println("Enter Responsabel For Lab :");
        ResponsabelForLab = in.next();
        } catch(Exception e) {
            System.out.println("Enter Valid Data");
        }
    }
    //PRINT
    
    @Override
    public void Print() {
        super.Print();
        System.out.println(this.getResponsabelForLab());
    }
    
    @Override
    public String toString() {
        return super.toString() + ResponsabelForLab;
    }
     
}
