/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical_in_class2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Practical_in_class2 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter label: ");
        String label = sc.nextLine();
        System.out.print("Enter type: ");
        int type = sc.nextInt();
        System.out.print("Enter step: ");
        int step = sc.nextInt();
        System.out.println("1. Test toString()");
        System.out.println("2. Test setData()");
        System.out.println("3. Test getValue()");
        System.out.print("Enter TC(1,2,3): ");
        
        int choice = sc.nextInt(); sc.nextLine();
        
        
        System.out.println("OUTPUT:");
        switch(choice){
            case 1:{
                Robot robot = new Robot(label, type);
                System.out.println(robot);
                SpecRobot specRobot = new SpecRobot(label, type, step);
                System.out.println(specRobot);
                break;
            }
            case 2:{
                SpecRobot b2 = new SpecRobot(label, type, step);
                b2.setData();
                String v2 = b2.getLabel();
                int k2 = b2.getType();
                System.out.printf("%s, %d\n",v2,k2);
                break;
            }
            case 3:{
                SpecRobot b3 = new SpecRobot(label, type, step);
                int v3 = b3.getValue();
                System.out.printf("%d\n",v3);
                break;
            }
            default:{
                break;
            }
        }
        System.out.println();
    }
}
