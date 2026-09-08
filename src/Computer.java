public class Computer {
    private String cpu;
    private String gpu;
    private String ram;
    private String storage;

    public void setCpu(String cpu) { this.cpu = cpu; }
    public void setGpu(String gpu) { this.gpu = gpu; }
    public void setRam(String ram) { this.ram = ram; }
    public void setStorage(String storage) { this.storage = storage; }

    @Override
    public String toString() {
        return "Computer Spec: CPU=" + cpu + ", GPU=" + gpu +
                ", RAM=" + ram + ", Storage=" + storage;
    }
}