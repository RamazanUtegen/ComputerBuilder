public interface ComputerBuilder {
    ComputerBuilder setCpu(String cpu);
    ComputerBuilder setGpu(String gpu);
    ComputerBuilder setRam(String ram);
    ComputerBuilder setStorage(String storage);
    ComputerBuilder setGlassPanel(boolean hasGlassPanel);
    Computer build();
}