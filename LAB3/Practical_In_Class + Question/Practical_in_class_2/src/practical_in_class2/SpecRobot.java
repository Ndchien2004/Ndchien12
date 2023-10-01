/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical_in_class2;

/**
 *
 * @author PC
 */
public class SpecRobot extends Robot {
   protected int step;

    public SpecRobot() {
        super();
    }

    public SpecRobot( String label, int type,int step) {
        super(label, type);
        this.step = step;
    }
    

    @Override
    public String toString() {
        return getLabel()+", "+getType()+", "+step;
    }
    

    public void setData(){
        setLabel(getLabel().substring(0, 1)+step+getLabel().substring(1));
    }
    
    public int getValue(){
        if (getLabel().contains("A") && getType()<3) return step;
        else return step + 2;
    }
}
