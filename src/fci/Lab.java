package fci;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab {
    
    Scanner in = new Scanner(System.in);
    
    ArrayList<Labs> labs = new ArrayList<Labs>();

    public Lab() {
    }
                
    //Add
    
    public void AddLab(Labs lab) {
       labs.add(lab);
    }
    
    //Remove
    
    public void RemoveLab(Labs lab) {
        labs.remove(lab);
    }
    
    //Search
    
    public void SearchLab() {
        System.out.println("Enter no of Lab");
        int x = in.nextInt();
        labs.get(x-1).Print();
    }
    
    //Print
    
    public void print() {
        for(int i = 0; i < labs.size(); i++) {
            labs.get(i).Print();
        }
    }
    
}
