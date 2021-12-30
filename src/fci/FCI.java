
package fci; 

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FCI {
    public static void main(String[] args) throws IOException {
        
//      Administrator

        FciAu admin = new FciAu(1, "Admin");
        System.out.println("\n\t\t\t\tAdministrator\n");
        Person a = new Administrator("Ali", 59, "01234", "Assuit", "Egyption", Gender.Male, "Master");
        Person a1 = new Administrator("Mona", 59, "01235", "Assuit", "Egyption", Gender.Female, "Master");
        Person a2 = new Administrator();
        a2.EnterData();
        admin.AddPerson(a);
        admin.AddPerson(a1);
        admin.AddPerson(a2);
        admin.RemovePerson(a);
        admin.Display();
        try {
            FileWriter wa = new FileWriter("Administrators.txt");
            wa.write("\n\t\t\t\tAdministrator\n");
            wa.write("Name\t\tAge\t\tPhone\t\tAddress\t\tNationality\t\tGender\t\tJobTitle\n");
            wa.write(a.toString() + "\n");
            wa.write(a1.toString() + "\n");
            wa.write(a2.toString() + "\n");
            wa.close();
        } catch(IOException e) {
            System.out.println("Can't Create File");
        }
        
//      Students
        
        FciAu student = new FciAu(2, "Student");
        System.out.println("\n\t\t\t\tStudents\n");
        Student s = new StudentGenrator("Mina", 19, "01222", "Assuit", "Egyption", Gender.Male, 2, "General", 500, 144);
        Student s1 = new StudentUnGenerator("Nour", 20, "01000", "Assuit", "Egyption", Gender.Male, 5, "IS", 500);
        student.AddPerson(s);
        student.AddPerson(s1);
        student.SearchPerson();
        student.Display();
        try {
            FileWriter ws = new FileWriter("Students.txt");
            ws.write("\n\t\t\t\tStudents\n");
            ws.write("Name\t\tAge\t\tPhone\t\tAddress\t\tNationality\t\tGender\t\tLevel\t\tSpechialized\t\tGPA\n");
            ws.write(s.toString() + "\n");
            ws.write(s1.toString() + "\n");
            ws.close();
        } catch(IOException e) {
            System.out.println("Can't Create File");
        }
        
//      Instructors
        
        FciAu inst = new FciAu(3, "Instructors");
        System.out.println("\n\t\t\t\tInstructors\n");
        Instructors i = new Instructors("Ahmed", 40, "01229", "Assuit", "Egyption", Gender.Male, "Math", "Doctor");
        Instructors i1 = new Instructors("Ahmed", 40, "01223", "Assuit", "Egyption", Gender.Male, "Math", "Doctor");
        inst.AddPerson(i);
        inst.AddPerson(i1);
        inst.Display();
        try {
            FileWriter wi = new FileWriter("Instructors.txt");
            wi.write("\n\t\t\t\tInstructors\n");
            wi.write("Name\t\tAge\t\tPhone\t\tAddress\t\tNationality\t\tGender\t\tSubject\t\tJobTitle\n");
            wi.write(i.toString() + "\n");
            wi.write(i1.toString() + "\n");
            wi.close();
        } catch(IOException e) {
            System.out.println("Can't Create File");
        }
        
//      Technicals
        
        FciAu tec = new FciAu(4, "Technicals");
        System.out.println("\n\t\t\t\tTechnicals\n");
        Person t = new Technicals("Ali", 30, "01111", "Cairo", "Egyption", Gender.Male, "A");
        Person t1 = new Technicals();
        t1.EnterData();
        tec.AddPerson(t);
        tec.AddPerson(t1);
        tec.Display();
        try {
            FileWriter wt = new FileWriter("Tecnicals.txt");
            wt.write("\n\t\t\t\tTechnicals\n");
            wt.write("Name\t\tAge\t\tPhone\t\tAddress\t\tNationality\t\tGender\t\tJobTitle\n");
            wt.write(t.toString() + "\n");
            wt.write(t1.toString() + "\n");
            wt.close();
        } catch(IOException e) {
            System.out.println("Can't Create File");
        }
//      Workers
        
        FciAu work = new FciAu(5, "Workers");
        System.out.println("\n\t\t\t\tWorkers\n");
        Workers w = new Workers("Khaled", 26, "00000", "Assuit", "Egyption", Gender.Male, "Security");
        work.AddPerson(w);
        work.Display();
        try {
            FileWriter ww = new FileWriter("Workers.txt");
            ww.write("\n\t\t\t\tWorkers\n");
            ww.write("Name\t\tAge\t\tPhone\t\tAddress\t\tNationality\t\tGender\t\tJobTitle\n");
            ww.write(t.toString() + "\n");
            ww.close();
        } catch(IOException e) {
            System.out.println("Can't Create File");
        }
        
//      Labs
        
        Lab la = new Lab();
        System.out.println("\n\t\tLabs\n");
        Labs l = new Labs("A", 20);
        Labs l1 = new Labs("B", 20);
        la.AddLab(l);
        la.AddLab(l1);
        la.print();
        try {
            FileWriter wl = new FileWriter("Labs.txt");
            wl.write("\n\t\tLabs\n");
            wl.write("LabName\t\tNumberOfDevices\n");
            wl.write(l.toString() + "\n");
            wl.write(l1.toString() + "\n");
            wl.close();
        } catch(IOException e) {
            System.out.println("Can't Create File");
        }
             
//      Read
        
//      Students
        
        try {
            FileReader rs = new FileReader("Students.txt");
            int ch;
            while((ch = rs.read()) != -1) 
                System.out.print((char) ch);
        } catch (IOException e) {
            System.out.println("Can't Find File");
        }
        
//      Administrator
        
        try {
            FileReader ra = new FileReader("Administrators.txt");
            int ch;
            while ((ch = ra.read()) != -1)
                System.out.print((char)ch);
        } catch(IOException e) {
            System.out.println("Can't Find File");
        }
        
//      Instractors
        
        try {
            FileReader ri = new FileReader("Instructors.txt");
            int ch;
            while((ch = ri.read()) != -1)
                System.out.print((char)ch);
        } catch (IOException e) {
            System.out.println("Can't Find File");
        }
        
//      Technicals
        
        try {
            FileReader rt = new FileReader("Tecnicals.txt");
            int ch;
            while((ch = rt.read()) != -1) 
                System.out.print((char)ch);
        } catch(Exception e) {
            System.out.println("Can't Find File");
        }
        
//      Workers
        
        try {
            FileReader rw = new FileReader("Workers.txt");
            int ch;
            while((ch = rw.read()) != -1) 
                System.out.print((char)ch);
        } catch(IOException e) {
            System.out.println("Can't Find File");
        }
        
//      Labs
        
        try {
            FileReader rl = new FileReader("Labs.txt");
            int ch;
            while((ch = rl.read()) != -1)
                System.out.print((char)ch);
        } catch (IOException e) {
            System.out.println("Can't Find File");
        }
    }   
}