// Builder: An interface declaring the construction steps
public interface ComputerBuilder {
    // Method chaining (fluent API) - each setter returns the builder itself
    ComputerBuilder setCpu(String cpu);
    ComputerBuilder setGpu(String gpu);
    ComputerBuilder setRam(String ram);
    ComputerBuilder setStorage(String storage);
    ComputerBuilder setGlassPanel(boolean hasGlassPanel);

    Computer build();
}