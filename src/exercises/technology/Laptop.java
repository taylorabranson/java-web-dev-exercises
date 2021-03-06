package exercises.technology;

public class Laptop extends Computer {

    private double size;
    private boolean isUpgradeable;

    public Laptop(String name, int memory, int storage, double size, boolean isUpgradeable) {
        super(name, memory, storage);
        this.size = size;
        this.isUpgradeable = isUpgradeable;
    }

    // Getters and Setters
    public double getSize() {
        return size;
    }

    public boolean getIsUpgradeable() {
        return isUpgradeable;
    }

    // Override Abstract Methods
    @Override
    public void printInfo() {
        System.out.println("Model: " + getModel());
        System.out.println("RAM: " + getMemory());
        System.out.println("Storage: " + getStorage());
        System.out.println("Screen Size: " + getSize());
        System.out.println("Upgradeable: " + getIsUpgradeable());
        System.out.println("ID: " + getId());

    }

    @Override
    public void upgradeMemory(int newMemory) {
        if (isUpgradeable) {
            setMemory(newMemory);
        } else {
            System.out.println("Not Upgradeable");
        }
    }

    @Override
    public void upgradeStorage(int newStorage) {
        if (isUpgradeable) {
            setStorage(newStorage);
        } else {
            System.out.println("Not Upgradeable");
        }
    }
}
