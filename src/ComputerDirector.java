public class ComputerDirector {

    public Computer constructPerformanceLaptop(ComputerBuilder builder) {
        return builder.setCpu("AMD Ryzen 7")
                .setGpu("NVIDIA RTX 4050")
                .setRam("16GB DDR5")
                .setStorage("1TB NVMe SSD")
                .build();
    }

    public Computer constructOfficePc(ComputerBuilder builder) {
        return builder.setCpu("Intel Core i3")
                .setGpu("Integrated Intel UHD")
                .setRam("8GB DDR4")
                .setStorage("256GB SSD")
                .build();
    }
}