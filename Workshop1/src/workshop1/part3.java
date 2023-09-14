/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop1;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class part3 {
    public static void main(String[] arrgs) {
        String[] list=new String[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 student names: ");
        for(int i=0;i<10;i++){
             System.out.print("Enter name " + (i + 1) + ": ");
            list[i] = scanner.nextLine().trim().toUpperCase();
        }
         System.out.println("List of student names in uppercase:");
        for (String name : list) {
            System.out.println(name);
        }
    }
}
