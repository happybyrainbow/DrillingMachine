public class MainProgram {
    public static void main(String[] args) {

        DrillingMachine d1 = new DrillingMachine();
        System.out.println("Name: " + d1.getName() + "\nWatt: " + d1.getWatt() + "\nAge: " + d1.getAge() + "\nPrice: " + d1.getPrice() + "\nBroken: " + d1.isBroken());
        DrillingMachine d2 = new DrillingMachine();
        System.out.println("\nName: " + d2.getName() + "\nWatt: " + d2.getWatt() + "\nAge: " + d2.getAge() + "\nPrice: " + d2.getPrice() + "\nBroken: " + d2.isBroken());
        DrillingMachine d3 = new DrillingMachine();
        System.out.println("\nName: " + d3.getName() + "\nWatt: " + d3.getWatt() + "\nAge: " + d3.getAge() + "\nPrice: " + d3.getPrice() + "\nBroken: " + d3.isBroken());

    }
}
