
package DTO;
import java.util.Scanner;


public class Painting extends Item{
    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;

    public Painting() {
        super();
    }

    public Painting(int height, int width, boolean isWatercolour, boolean isFramed, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }
   
    public void inputPainting(){
        input();
        Scanner sc = new Scanner(System.in);
        boolean cont = true;
        do {            
            try {
                System.out.print("Enter height:");
                height = Integer.parseInt(sc.nextLine());
                if(height<0) throw new Exception();
                cont = false;
            } catch (Exception e) {
                System.out.println("Enter height again!");
                cont = true;
            }
        } while (cont);
        do {            
            try {
                System.out.print("Enter width:");
                height = Integer.parseInt(sc.nextLine());
                if(height<0) throw new Exception();
                cont = false;
            } catch (Exception e) {
                System.out.println("Enter width again!");
                cont = true;
            }
        } while (cont);
        do {            
            try {
                System.out.print("Enter isWatercolour:");
                isWatercolour = sc.nextBoolean();
                if(isWatercolour!=true||isWatercolour!=false) throw new Exception();
                cont = false;
            } catch (Exception e) {
                System.out.println("Enter isWatercolour again!");
                cont = true;
            }
        } while (cont);
        do {            
            try {
                System.out.print("Enter isFramed:");
                isFramed = sc.nextBoolean();
                if(isFramed!=true||isFramed!=false) throw new Exception();
                cont = false;
            } catch (Exception e) {
                System.out.println("Enter isFramed again!");
                cont=true;
            }
        } while (cont);
    }
    public void outputPainting(){
        output();
        System.out.println("Height:"+height);
        System.out.println("width:"+width);
        System.out.println("isWatercolour:"+isWatercolour);
        System.out.println("isFramed:"+isFramed);
    }
}
