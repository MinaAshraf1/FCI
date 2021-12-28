
package fci;

public interface PersonInterface {
    //SETTER
    
    public void setName(String Name);
    public void setAge(int Age);
    public void setPhone(String Phone);
    public void setAddress(String Address);
    public void setNationality(String Nationality);
    public void setGender(Gender gender);
    
    //GETTER
    
    public String getName();
    public int getAge();
    public String getPhone();
    public String getAddress();
    public String getNationality();
    public Gender getGender();
    
    //Enter
    
    public void EnterData();
    
    //PRINT
    
    public void Print();
    public String toString();
}
