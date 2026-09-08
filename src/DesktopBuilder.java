public class DesktopBuilder implements ComputerBuilder {
    private Computer computer;

    public DesktopBuilder() {
        this.computer = new Computer();
        this.computer.setFormFactor("Desktop PC");
    }

    @Override public ComputerBuilder setCpu(String cpu) { computer.setCpu(cpu); return this; }
    @Override public ComputerBuilder setGpu(String gpu) { computer.setGpu(gpu); return this; }
    @Override public ComputerBuilder setRam(String ram) { computer.setRam(ram); return this; }
    @Override public ComputerBuilder setStorage(String storage) { computer.setStorage(storage); return this; }
    @Override public ComputerBuilder setGlassPanel(boolean hasGlassPanel) { computer.setGlassPanel(hasGlassPanel); return this; }

    @Override public Computer build() { return this.computer; }
}