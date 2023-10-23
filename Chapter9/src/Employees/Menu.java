package Employees;

import java.util.Vector;
import java.util.Scanner;
 
public class Menu {
public static int getChoice(Arraylist options) {
    for(int i=0; i <options.size();i++) {
        System.out.println((i + 1) + "_" + options.get(i));
    }
    System.out.println("Choose1...." + options.size() + " :");
    Scanner sc = new Scanner(System.in);
    return Integer.parseInt(sc.nextLine());
}    
public static int getChoice(option[] options){
    for (int i=0)
}
}
