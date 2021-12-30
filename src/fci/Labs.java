
package fci;

import java.util.Scanner;

public class Labs implements Print{
    
    Scanner in = new Scanner(System.in);
    
    protected String LabName;
    protected int NumOfDevice;
    
    //CONSTRACTOR
    
    public Labs() {
    }

    public Labs(String LabName, int NumOfDevice) {
        this.LabName = LabName;
        this.NumOfDevice = NumOfDevice;
    }
    
    //SETTER
    
    public void setLabname(String LabName) {
        this.LabName = LabName;
    }
    
    public void setNumofdevice(int NumOfDevice) {
        this.NumOfDevice = NumOfDevice;
    }

    //GETTER
    
    public String getLabname() {
        return LabName;
    }

    public int getNumOfDevice() {
        return NumOfDevice;
    }

    //Enter
    
    public void EnterData() {
        try {
            System.out.println("Enter Lab Name :");       
            LabName = in.next();
            System.out.println("Enter Number of Devices :");
            NumOfDevice = in.nextInt();
        } catch(Exception e) {
            System.out.println("Enter Valid Data");
        }
    }

    //PRINT
    
    public void Print() {
        System.out.println(LabName + "\t" + NumOfDevice);
    }
    
    @Override
    public String toString() {
        return  LabName + "\t\t" +  NumOfDevice ;
    }
    
    
  
}