
import java.util.List;


import java.util.List;
import java.util.Comparator;
import java.util.Collections;
public class MyCar implements ICar {

    @Override
    public int f1(List<Car> t) {
        int sum=0;
        for(int i=0;i<t.size();i++){
            sum+=t.get(i).getRate();
        }
        return sum/t.size();
        
    }

    @Override
    public void f2(List<Car> t) {
       if (t.size() < 2) {
            return; 
        }

        int maxRateIndex = 0;
        int minRateIndex = 0;

        for (int i = 1; i < t.size(); i++) {
            if (t.get(i).getRate() > t.get(maxRateIndex).getRate()) {
                maxRateIndex = i;
            }
            if (t.get(i).getRate() < t.get(minRateIndex).getRate()) {
                minRateIndex = i;
            }
        }

        Collections.swap(t, maxRateIndex, minRateIndex);    }

    @Override
    public void f3(List<Car> t) {
         t.sort(Comparator.comparing(Car::getMaker).thenComparing(Car::getRate, Comparator.reverseOrder()));
    }

    
}
