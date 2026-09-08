public class ComputerDirector {

    public Computer constructGamingLaptop(ComputerBuilder builder) {
        return builder.setCpu("AMD Ryzen 7")
                .setGpu("NVIDIA RTX 4050")
                .setRam("16GB DDR5")
                .setStorage("1TB NVMe SSD")
                .build();
    }

    public Computer constructHeavyDesktop(ComputerBuilder builder) {
        return builder.setCpu("Intel Core i9")
                .setGpu("RTX 4090 (Heavy GPU)")
                .setRam("32GB DDR5")
                .setStorage("2TB NVMe SSD")
                .setGlassPanel(true)
                .build();
    }
}