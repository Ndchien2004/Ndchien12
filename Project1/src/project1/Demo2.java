
package project1;

import java.util.*;
public class Demo2 {
    ArrayList<Demo1> t;
    Demo2(){
        t=new ArrayList<Demo1>();
    }
    void clear() {
        t.clear();
    }
    boolean isEmpty() {
        return(t.isEmpty());
    }
    void add(Demo1 x) {
        t.add(x);
    }
    void addMany(String [] a, int [] b, double [] c) {
        int n,i; n=a.length;
        for(i=0;i<n;i++)
            add(new Demo1(a[i],b[i],c[i]));
    }
    void display() {
        int n,i;
        n=t.size();
        Demo1 x;
        for(i=0;i<n;i++) {
            x = t.get(i);
            System.out.println(x);
        }
    }
}
