
package DTO;

import java.util.Scanner;

public class Statue extends Item{
    private int weight;
    private String colour;

    public Statue() {
        super();
    }

    public Statue(int weight, String colour, int value, String creator) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void outputStatue(){
        output();
        System.out.println("weight:"+weight);
        System.out.println("colour:"+colour);
    }
    public void inputStatue(){
        input();
        Scanner sc = new Scanner(System.in);
        boolean cont = true;
        do {            
            try {
                System.out.print("Enter weight:");
                weight = Integer.parseInt(sc.nextLine());
                if(weight<0) throw new Exception();
                cont = false;
            } catch (Exception e) {
                System.out.println("Enter weight again!");
                cont=true;
            }
        } while (cont);
        do {            
            try {
                System.out.print("Enter colour:");
                colour = sc.nextLine();
                if(colour.isEmpty()) throw new Exception();
                cont = false;
            } catch (Exception e) {
                System.out.println("Enter colour again!");
                cont =true;
            }
        } while (cont);
    }
}
