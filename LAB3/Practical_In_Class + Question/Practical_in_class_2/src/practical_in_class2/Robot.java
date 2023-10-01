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
public class Robot {
   protected String label;
    private int type;

    public Robot() {
        super();
    }

    public Robot(String label, int type) {
        super();
        this.label = label;
        this.type = type;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    
    
    @Override
    public String toString() {
        return  label + ", " + type;
    }
}