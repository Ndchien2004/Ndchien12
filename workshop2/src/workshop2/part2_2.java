/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop2;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class part2_2 {
    public String inputString() throws Exception
    {
        String pattern="SE\\d{3}";
        String s="";
        Scanner sc=new Scanner(System.in);
        System.out.println("input the string: ");
        s=sc.nextLine();
        if( !s.matches(pattern)){
            throw new Exception();
        }
        return s;
    }
    public static void main(String[] args){
        part2_2 obj = new part2_2();
        boolean cont=false;
        do{
            try{
                String s=obj.inputString();
                System.out.println("The string is: " +s);
                cont=false;
            }catch(Exception e){
                System.out.println("The string is invalid");
                cont=true;
            }
        }while(cont);
    }
}
