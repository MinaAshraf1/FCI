
package fci;

import java.util.ArrayList;
import java.util.Scanner;

enum Gender{Male, Female};

public class Person implements PersonInterface{
    
    Scanner in = new Scanner(System.in);
    
    protected String Name;
    protected int Age;
    protected String Phone;
    protected String Address;
    protected String Nationality;
    protected Gender gender;
    
    //CONSTRACTOR
    
    public Person(){}

    public Person(String Name, int Age, String Phone, String Address, String Nationality, Gender gender) {
        this.Name = Name;
        this.Age = Age;
        this.Phone = Phone;
        this.Address = Address;
        this.Nationality = Nationality;
        this.gender = gender;
    }

    //SETTER
    
    @Override
    public void setName(String Name) {
        this.Name = Name;
    }

    @Override
    public void setAge(int Age) {
        this.Age = Age;
    }
    
    @Override
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    @Override
    public void setAddress(String Address) {
        this.Address = Address;
    }

    @Override
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }  

    @Override
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    
    //GETTER

    @Override    
    public String getName() {
        return Name;
    }
    
    @Override
    public int getAge() {
        return Age;
    }

    @Override
    public String getPhone() {
        return Phone;
    }

    @Override
    public String getAddress() {
        return Address;
    }

    @Override
    public String getNationality() {
        return Nationality;
    }

    @Override
    public Gender getGender() {
        return gender;
    }
    
    //Enter
    
    @Override
    public void EnterData() {
        try {
            System.out.println("Enter Your Name : ");
            Name = in.next();
            System.out.println("Enter Your Age : ");
            Age = in.nextInt();
            System.out.println("Enter Your Phone : ");
            Phone = in.next();
            System.out.println("Enter Your Address : ");
            Address = in.next();
            System.out.println("Enter Your Nationality : ");
            Nationality = in.next();
            System.out.println("Press 1 to Male,\nPress 2 to Female");
            int n = in.nextInt();
            if(n == 1)
                gender = Gender.Male;
            else
                gender = Gender.Female;
        } catch(Exception e) {
            System.out.println("Enter Valid Data");
        }
    }
    
    //PRINT
    
    @Override
    public void Print(){
        System.out.print(this.getName() + "\t\t" +
                this.getAge() + "\t\t" +
                this.getPhone() + "\t\t" +
                this.getAddress() + "\t\t" +
                this.getNationality() + "\t\t" +
                this.getGender() + "\t\t"
        );
    }

    @Override
    public String toString() {
        return   Name + "\t\t" + Age + "\t\t"+ Phone + "\t\t" + Address + "\t\t" + Nationality + "\t\t" + gender + "\t\t";
    }
    
}
