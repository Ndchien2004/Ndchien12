
package project1;


public class Demo1 {
    String name;
    int age;
    double income;
    
    Demo1() {
    }
    
    Demo1(String xName, int xAge, double xIncome){
        name=xName; age=xAge; income=xIncome;
    }

    @Override
    public String toString() {
        return "Demo1{" + "name=" + name + ", age=" + age + ", income=" + income + '}';
    }
}
