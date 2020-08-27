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

    // Abstract functions
    public abstract void printInfo();

    public abstract void upgradeMemory(int newMemory);

    public abstract void upgradeStorage(int newStorage);


    // Getters and Setters
    public String getModel() {
        return model;
    }

    private void setModel(String model) {
        this.model = model;
    }

    public int getMemory() {
        return memory;
    }

    protected void setMemory(int memory) {
        this.memory = memory;
    }

    public int getStorage() {
        return storage;
    }

    protected void setStorage(int storage) {
        this.storage = storage;
    }
}
