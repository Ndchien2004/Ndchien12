package practical_in_class;
import java.util.Scanner;
public class Engine {
    private int pow=0;
    private String des="";
    public Engine()
    { }
    public Engine (String des, int pow)
    {   this.des=des;
        this.pow=pow;
    }
    public String getDesigner ()
    { 
        char c1=Character.toLowerCase(des.charAt(0));
        String name=String.valueOf(c1);
        name=name+des.charAt(1)+des.charAt(2);
        return name; 
    }
    public int getPower(){ return pow; }
    public void setPower(int pow){
        this.pow=pow;
    }
    public static void main(String[] args) {
        boolean c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter designer: ");
        String des=sc.next();
        System.out.print("Enter power: ");
        int pow=sc.nextInt();
        Engine a=new Engine(des,pow);
        do {
            System.out.println("1. Test getDesigner()");
            System.out.println("2. Test setPower()");
            System.out.print("Enter TC(1 or 2): ");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("OUTPUT: ");
                    System.out.println(a.getDesigner());
                    c=false;
                    break;
                case 2:
                    System.out.print("Enter new power: ");
                    int p=sc.nextInt();
                    a.setPower(p);
                    System.out.println("OUTPUT: ");
                    System.out.println(a.getPower());
                    c=false;
                    break;
                default: 
                    System.out.println("Invalid value!");
                    c=true;
            }
        }while (c);
    }
}