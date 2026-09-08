public class Main {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();

        ComputerBuilder laptopBuilder = new LaptopBuilder();
        Computer laptop = director.constructGamingLaptop(laptopBuilder);
        System.out.println("Result 1: " + laptop);

        ComputerBuilder desktopBuilder = new DesktopBuilder();
        Computer desktop = director.constructHeavyDesktop(desktopBuilder);
        System.out.println("Result 2: " + desktop);
    }
}