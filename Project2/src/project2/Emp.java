
package project2;


public class Emp implements Comparablet<Emp> {
    String name; int age; double income;
    Emp() {
    }
    Emp(String xName, int xAge, double xIncome) {
        name=xName; age=xAge; income=xIncome;
    }

    @Override
    public String toString() {
        return "Emp{" + "name=" + name + ", age=" + age + ", income=" + income + '}';
    }
    public int compareTo(Emp x) {
        if(age<x.age)
            return(-1);
        else if(age==x.age)
            return(name.compareTo(x.name));
                return(1);
    }
}
