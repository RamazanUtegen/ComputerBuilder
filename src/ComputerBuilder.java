public interface ComputerBuilder {
    ComputerBuilder setCpu(String cpu);
    ComputerBuilder setGpu(String gpu);
    ComputerBuilder setRam(String ram);
    ComputerBuilder setStorage(String storage);

    Computer build();
}