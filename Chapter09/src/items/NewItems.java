package items;

import java.util.Vector;
import java.io.*;
import java.util.Scanner;

public class NewItems extends Vector<Item>{
    Scanner sc = new Scanner(System.in);
    Vector <String> storedCodes = new Vector <String>();
    public NewItems() { super(); }
    public void loadStoredCodes (String fName) {
        if(storedCodes.size()>0) storedCodes.clear();
        try{
            File f = new File(fName);
            if( !f.exist()) return;
            FileReader fr = new FileReader(f);
            BufferedReader bf = new BufferedReader(fr);
            String code, name, priceStr;
            while ((code= bf.readLine())!=null &&
                   ( name=bf.readLine())!null &&
                   (priceStr= bf.readLine())!=null)
            storedCodes.add(code);
            bf.close(); fr.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
    private boolean valid (String aCode) {
        int i;
        for(i=0;i<storedCodes.size();i++) 
            if(aCode.equals(storedCodes.get(i))) return false;
        for(i=0;i<this.size();i++) 
            if(aCode.equals(this.get(i).getCode())) return false;
        return true;
    }
    private int find(String aCode) {
        
    }
}
