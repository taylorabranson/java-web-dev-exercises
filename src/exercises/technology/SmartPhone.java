package exercises.technology;

public class SmartPhone extends Computer {

    private double size;
    private boolean isUpgradeable;
    private String network;

    public SmartPhone(String model, int memory, int storage, double size, boolean isUpgradeable, String network) {
        super(model, memory, storage);
        this.size = size;
        this.isUpgradeable = isUpgradeable;
        this.network = network;
    }

    // Getters and Setters
    public double getSize() {
        return size;
    }

    public boolean getIsUpgradeable() {
        return isUpgradeable;
    }

    public String getNetwork() {
        return network;
    }

    // Override abstract methods
    @Override
    public void printInfo() {
        System.out.println("Model: " + getModel());
        System.out.println("RAM: " + getMemory());
        System.out.println("Storage: " + getStorage());
        System.out.println("Screen Size: " + getSize());
        System.out.println("Upgradeable: " + getIsUpgradeable());
        System.out.println("Network: " + getNetwork());
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
