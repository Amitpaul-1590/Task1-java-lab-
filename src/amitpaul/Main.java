/*
Name:Amit Paul
Id:2012020164
Section:D
Email:cse_2012020164@lus.ac.bd
Date:15-07-2021             
*/
package amitpaul;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        String section;
        System.out.print("Enter your section name:");
        section = input.nextLine();
        System.out.println("Section: "+section);
        
        Info info = new Info();
        System.out.println("Name: "+info.name);
        System.out.println("Id: "+info.id);
        
        Hobby hobby = new Hobby();
        System.out.println("Hobby: "+hobby.hobbyName);
        
    }
    
}
