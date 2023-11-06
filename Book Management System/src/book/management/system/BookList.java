package book.management.system;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BookList {
     protected ArrayList<Book> t = new ArrayList<>();
    
    public void input(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of books: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Enter code: ");
            String code = sc.nextLine();
            System.out.println("Enter the title: ");
            String title = sc.nextLine();
            System.out.println("Enter quantity: ");
            int quantity = sc.nextInt();
            System.out.println("Enter price: ");
            double price = sc.nextDouble();
            sc.nextLine();
            
            Book book = new Book(code, title, quantity, price);
            t.add(book);
        }       
    }
    
    public void display(){
        for (Book book : t) {
            System.out.println(book);
        }
    }
    public int search(String  code){
        for(int i=0;i<t.size();i++){
            if(t.get(i).getCode().equals(code)){
                return i;
            }
        }
        return -1;
    }
    
    public void update(String code, double newPrice){
        for (Book book : t) {
            if(book.getCode().equals(code)){
                book.setPrice(newPrice);
            }
        }
    }
    
    public int max(){
        if(t.isEmpty()){
            return -1;
        }
        
        double maxPrice = t.get(0).getPrice();
        int maxIndex = 0;
        
        for(int i=1;i<t.size();i++){
            if(t.get(i).getPrice()>maxPrice){
                maxPrice = t.get(i).getPrice();
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    
    public void sortByCode(){
        Collections.sort(t, (b1,b2)-> b1.getCode().compareTo(b2.getCode()));
    }
    
    public void remove(String code){
        int index = search(code);
        if(index!=-1){
            t.remove(index);
        }
    }
    
    public void loadFile(String filename){
        try{
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            t.clear();
            
            while((line = br.readLine())!=null){
                String[] parts = line.split(",");
                if(parts.length==4){
                    String code = parts[0].trim();
                    String title = parts[1].trim();
                    int quantity = Integer.parseInt(parts[2].trim());
                    double price = Double.parseDouble(parts[3].trim());
                    Book book = new Book(code, title, quantity, price);
                    t.add(book);
                }
            }
            br.close();
        } catch (IOException e){
            System.out.println("Error reading from the file: "+e.getMessage());
        }
    }

    public boolean isEmpty() {
        return t.isEmpty();
    }
}
