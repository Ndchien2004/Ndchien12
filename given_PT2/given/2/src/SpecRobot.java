
public class SpecRobot extends Robot{
    private int step;

    public SpecRobot() {
    }

    public SpecRobot(String label, int type,int step) {
        super(label, type);
        this.step = step;
    }

    @Override
    public String toString() {
        return super.toString()+ "," +step;
    }
    
    public void setData() {
       String temp = super.getLabel();
       String result = "";
       result = temp.substring(0,1) + step + temp.substring(1);
       super.setLabel(result);
    }
    public int getValue(){
       if(this.type < 3 && this.getLabel().contains("A")){
           return +step;
       }
       else 
           return step +2;
      
       
       
    }
}
