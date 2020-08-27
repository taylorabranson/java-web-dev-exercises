package exercises.technology;

public abstract class Computer {

    private String model;
    private int memory;
    private int storage;

    public Computer(String model, int memory, int storage) {
        this.model = model;
        this.memory = memory;
        this.storage = storage;
    }

    public abstract void printInfo();

    public abstract void upgradeMemory();

    public abstract void upgradeStorage();

    public String getModel() {
        return model;
    }

    private void setModel(String model) {
        this.model = model;
    }

    public int getMemory() {
        return memory;
    }

    private void setMemory(int memory) {
        this.memory = memory;
    }

    public int getStorage() {
        return storage;
    }

    private void setStorage(int storage) {
        this.storage = storage;
    }
}
