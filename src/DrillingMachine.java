public class DrillingMachine {

    private int watt;
    private String name;
    private int age;
    private double price;
    private boolean broken;

    public DrillingMachine(){

        name = "Arschbohrer 3000";
        watt = (int) Math.floor(Math.random() * 1200 + 800);
        age = (int) Math.floor(Math.random() * 9 + 1);
        price = Math.floor(Math.random() * 450 + 50);
        broken = false;

    }

    public void becomeBroken(){
        broken = true;
    }

    public void repair(){
        if(broken == true){
            broken = false;
            price = price / 2;
        }
    }

    public void aging(){
        age = age + 1;
        if(age > 9){
            becomeBroken();
        }
    }

    public void reactOnHighDemand(){
        price = price + price * 0.25;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isBroken() {
        return broken;
    }

    public int getWatt(){
        return watt;
    }

}
