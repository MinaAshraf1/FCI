
package fci;

import java.util.ArrayList;
import java.util.Scanner;

public class FciAu {
    
    Scanner in = new Scanner(System.in);
    
    protected int TypeNo;
    protected String TypeName;
    ArrayList<Person> PersonDetalis;
    
    //Constractor
    
    public FciAu() {
        ArrayList<Person> PersonDetails = new ArrayList<Person>();
    }
    
    public FciAu(int TypeNo, String TypeName) {
        this.TypeNo = TypeNo;
        this.TypeName = TypeName;
        PersonDetalis = new ArrayList<Person>();
    }

    //Setter
    
    public void setTypeNo(int TypeNo) {
        this.TypeNo = TypeNo;
    }

    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    //Add
    
    public void AddPerson(Person p) {
        PersonDetalis.add(p);
    }
    
    //Remove
    
    public void RemovePerson(Person p) {
        PersonDetalis.remove(p);
    }
    
    //Search
    
    public void SearchPerson() {
        try {
        System.out.println("Enter no of person");
        int i = in.nextInt();
        i = i-1;
        if(PersonDetalis.get(i) instanceof Administrator)
            ((Administrator)PersonDetalis.get(i)).Print();
        else if(PersonDetalis.get(i) instanceof Instructors)
                ((Instructors)PersonDetalis.get(i)).Print();
        else if(PersonDetalis.get(i) instanceof StudentGenrator)
            ((StudentGenrator)PersonDetalis.get(i)).Print();
        else if(PersonDetalis.get(i) instanceof StudentUnGenerator)
            ((StudentUnGenerator)PersonDetalis.get(i)).Print();
        else if(PersonDetalis.get(i) instanceof Technicals)
            ((Technicals)PersonDetalis.get(i)).Print();
        else if(PersonDetalis.get(i) instanceof Workers)
            ((Workers)PersonDetalis.get(i)).Print();
        } catch(IndexOutOfBoundsException e) {
            System.out.println("No Person");
        }
    }
                
    public int PersonCount() {
        return PersonDetalis.size();
    }
    
    public void DisplayString() {
        for(int i = 0; i < PersonDetalis.size(); i++) {
            if(PersonDetalis.get(i) instanceof Administrator)
                ((Administrator)PersonDetalis.get(i)).toString();
            else if(PersonDetalis.get(i) instanceof Instructors)
                ((Instructors)PersonDetalis.get(i)).toString();
            else if(PersonDetalis.get(i) instanceof StudentGenrator)
                ((StudentGenrator)PersonDetalis.get(i)).toString();
            else if(PersonDetalis.get(i) instanceof StudentUnGenerator)
                ((StudentUnGenerator)PersonDetalis.get(i)).toString();
            else if(PersonDetalis.get(i) instanceof Technicals)
                ((Technicals)PersonDetalis.get(i)).toString();
            else if(PersonDetalis.get(i) instanceof Workers)
                ((Workers)PersonDetalis.get(i)).toString();
        }
    }
    
    public void Display() {
        for(int i = 0; i < PersonDetalis.size(); i++) {
            if(PersonDetalis.get(i) instanceof Administrator)
                ((Administrator)PersonDetalis.get(i)).Print();
            else if(PersonDetalis.get(i) instanceof Instructors)
                ((Instructors)PersonDetalis.get(i)).Print();
            else if(PersonDetalis.get(i) instanceof StudentGenrator)
                ((StudentGenrator)PersonDetalis.get(i)).Print();
            else if(PersonDetalis.get(i) instanceof StudentUnGenerator)
                ((StudentUnGenerator)PersonDetalis.get(i)).Print();
            else if(PersonDetalis.get(i) instanceof Technicals)
                ((Technicals)PersonDetalis.get(i)).Print();
            else if(PersonDetalis.get(i) instanceof Workers)
                ((Workers)PersonDetalis.get(i)).Print();
        }
        
    }

}
