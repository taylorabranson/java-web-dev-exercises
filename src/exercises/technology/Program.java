package exercises.technology;

public class Program {

    public static void main(String[] args) {
        SmartPhone iphoneEight = new SmartPhone("iPhone 8", 4, 64, 4.7, false, "4G");
        iphoneEight.printInfo();

        Laptop asusG14 = new Laptop("Asus Zephyrus G14", 16, 1024, 14, true);
        asusG14.printInfo();
    }
}
