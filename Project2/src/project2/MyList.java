

package project2;


public class MyList {
    ArrayList<Emp> t;
    MyList(){
        t =new ArrayList<Emp>();
    }
  void clear() {
        t.clear();
    }
    boolean isEmpty() {
        return(t.isEmpty());
    }
    void add(Emp x) {
        t.add(x);
    }
    void addMany(String [] a, int [] b, double [] c) {
        int n,i; n=a.length;
        for(i=0;i<n;i++)
            add(new Emp(a[i],b[i],c[i]));
    }
    void display() {
        int n,i;
        n=t.size();
            Emp x;
        for(i=0;i<n;i++) {
            x = t.get(i);
            System.out.println(x);
        }
    }
    void loadFile(String fname) throws IOException {
        FileReader fr = new FileReader(fname);
        BufferedReader br = new BufferedReader(fr);
        String s, xName; int xAge; double xIncome;
        String [] a;
        while(true {
            s = br.readLine();
            s = s.trim();
            if(a.length()<3) break;
            n = s.aplit("[i]");
            xName = a[0];
            xAge = Integer.paraeInt(a[i], trim());
            xIncome(new Emp(xName,xAge,xIncome));
        }
        fr.close();
        br.close();
    }
    void saveToFile(String fname) throws IOException {
        FileWriter fv = new FileWriter(fname);
        PrintWriter pw = new PrintWriter(fv);
        Emp x; int n, i;
        n = t.size();
        for(i=0;i<n;i++) {
            x=t.get(i);
        pw.printf("%10s | %5d | %5.;f\r\n", x.name, x.age, x.income);
    }
    pw.close();
    }
    void removePos(int k) {
        int n=t.size();
        if(k<0 || k>n-1) return;
        t.remove(k);
    }
    int search(String xName) {
        int n,i; Emp x;
        n=t.size();
        for(i=0;i<n;i++) {
            x = t.get(i);
            if(x.name.equalsIgnoreCase(xName)) return(i);
        }
        return(-1);
    }
    void remove(String xName) {
        int k = serach(xName);
        removePos(k);
    }
    void sortByAgeName() {
        Collections.sort(t);
    }
}

