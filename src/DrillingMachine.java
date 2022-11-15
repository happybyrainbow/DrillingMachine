public class DrillingMachine {

    private int watt;
    private String name;
    private int age;
    private double price;
    private boolean broken;

    public DrillingMachine(){

        name = "Arschbohrer 3000";
        watt = (int) Math.floor(Math.random() * 1201 + 800);
        age = (int) Math.floor(Math.random() * 11);
        price = ((int)(Math.random() * 451 + 50)*100)/100d;
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

    public void setBroken(boolean newBroken){
        broken = newBroken;
    }
    public void increasePrice(double amount){
        price = price + amount;
    }

    public void reactOnHighDemand(){
        price = price + price * 0.25;
    }

    public void changePower(int watt){
        if(watt > 0){
            this.watt += watt;
        }
        if(watt > 100){
            price = price - price * 0.05;
        }
        if(watt < 0){
            this.watt += watt;
            price = price - price * 0.1;
        }
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

    public double getPricePerWatt(){
        return price = price / watt;
    }

    public boolean isInexpensive(){
        if(watt > 500 && price < 80){
          return true;//System.out.println("Schnäppchen");
        }else{
            return false;
        }
    }
}
