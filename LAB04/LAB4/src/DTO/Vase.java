
package DTO;

import java.util.Scanner;

public class Vase extends Item{
    private int height;
    private String material;

    public Vase() {
        super();
    }

    public Vase(int height, String material, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void inputVase(){
        input();
        Scanner sc = new Scanner(System.in);
        boolean cont = true;
        do{
            try{
                System.out.print("Enter height: ");
                int hei = Integer.parseInt(sc.nextLine());
                if(hei<=0) throw new Exception();
                setHeight(hei);
                cont = false;
            }catch (Exception e){
                System.out.println("Enter height again!");
                cont=true;
            }
        }while(cont);
        do{
            try{
                System.out.print("Enter material: ");
                String mat = sc.nextLine();
                if(mat.isEmpty()) throw new Exception();
                setMaterial(mat);
                cont = false;
            }catch (Exception e){
                System.out.print("Enter material again!");
                cont=true;
            }
        }while(cont);
    }
    public void outputVase(){
        output();
        System.out.println("Height:"+height);
        System.out.println("Material:"+material);
    }
}
