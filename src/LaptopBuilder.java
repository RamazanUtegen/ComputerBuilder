// ConcreteBuilder 1: Produces the first representation of the product
public class LaptopBuilder implements ComputerBuilder {
    private Computer computer;

    public LaptopBuilder() {
        this.computer = new Computer();
        this.computer.setFormFactor("Laptop");
        this.computer.setGlassPanel(false); // Laptops do not have glass panels
    }

    // Small methods, each doing exactly one thing (Clean Code principle)
    @Override public ComputerBuilder setCpu(String cpu) { computer.setCpu(cpu); return this; }
    @Override public ComputerBuilder setGpu(String gpu) { computer.setGpu(gpu); return this; }
    @Override public ComputerBuilder setRam(String ram) { computer.setRam(ram); return this; }
    @Override public ComputerBuilder setStorage(String storage) { computer.setStorage(storage); return this; }

    @Override public ComputerBuilder setGlassPanel(boolean hasGlassPanel) { return this; }

    @Override public Computer build() { return this.computer; }
}