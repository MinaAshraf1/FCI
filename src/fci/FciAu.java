
package fci;

import java.util.ArrayList;

public class FciAu {
    protected int TypeNo;
    protected String TypeName;
    ArrayList<Person> PersonDetalis;
    
    public FciAu() {    
    }
    
    public FciAu(int TypeNo, String TypeName) {
        this.TypeNo = TypeNo;
        this.TypeName = TypeName;
        PersonDetalis = new ArrayList<Person>();
    }

    public void setTypeNo(int TypeNo) {
        this.TypeNo = TypeNo;
    }

    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    public void AddPerson(Person p) {
        PersonDetalis.add(p);
    }
    
    public void RemovePerson(Person p) {
        PersonDetalis.remove(p);
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
