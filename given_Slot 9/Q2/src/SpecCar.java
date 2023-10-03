public class SpecCar extends Car {
    int type;

    public SpecCar() {
    }

    public SpecCar(String maker, int price, int type) {
        super(maker, price);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString()+type;
    }

    public void setData(String maker, int price){
        this.maker="XZ"+maker;
        this.price=price+20;
    }

    public int getValue(int type, int price) {
        int inc;
        if(type<7)  inc=10;
        else inc= 15;
        return price+inc;
    }
    
    
}