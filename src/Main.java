public class Main {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();

        ComputerBuilder laptopBuilder = new LaptopBuilder();

        Computer myLaptop = director.constructPerformanceLaptop(laptopBuilder);

        System.out.println("Building first PC:");
        System.out.println(myLaptop.toString());

        System.out.println("\n-------------------\n");

        ComputerBuilder officeBuilder = new LaptopBuilder();
        Computer officePc = director.constructOfficePc(officeBuilder);

        System.out.println("Building second PC:");
        System.out.println(officePc.toString());
    }
}