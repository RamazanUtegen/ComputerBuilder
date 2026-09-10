// Client: A main method that exercises the builders and shows the products
public class Main {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();

        // Testing ConcreteBuilder 1
        ComputerBuilder laptopBuilder = new LaptopBuilder();
        Computer laptop = director.constructGamingLaptop(laptopBuilder);
        System.out.println("Result 1: " + laptop);

        // Testing ConcreteBuilder 2
        ComputerBuilder desktopBuilder = new DesktopBuilder();
        Computer desktop = director.constructHeavyDesktop(desktopBuilder);
        System.out.println("Result 2: " + desktop);
    }
}