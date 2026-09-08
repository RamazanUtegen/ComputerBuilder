public class Computer {
    private String cpu;
    private String gpu;
    private String ram;
    private String storage;
    private String formFactor;
    private boolean hasGlassPanel;

    public void setCpu(String cpu) { this.cpu = cpu; }
    public void setGpu(String gpu) { this.gpu = gpu; }
    public void setRam(String ram) { this.ram = ram; }
    public void setStorage(String storage) { this.storage = storage; }
    public void setFormFactor(String formFactor) { this.formFactor = formFactor; }
    public void setGlassPanel(boolean hasGlassPanel) { this.hasGlassPanel = hasGlassPanel; }

    @Override
    public String toString() {
        return "Computer [" + formFactor + "] -> CPU: " + cpu + ", GPU: " + gpu +
                ", RAM: " + ram + ", Storage: " + storage +
                ", Glass Panel: " + (hasGlassPanel ? "Yes" : "No");
    }
}