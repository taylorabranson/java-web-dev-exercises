package exercises.technology;

public class SmartPhone extends Computer {

    private int size;
    private boolean isUpgradeable;

    public SmartPhone(String model, int memory, int storage, int size, boolean isUpgradeable) {
        super(model, memory, storage);
        this.size = size;
        this.isUpgradeable = isUpgradeable;
    }

    // Getters and Setters
    public int getSize() {
        return size;
    }

    private void setSize(int size) {
        this.size = size;
    }

    public boolean getIsUpgradeable() {
        return isUpgradeable;
    }

    private void setIsUpgradeable() {
        this.isUpgradeable = isUpgradeable;
    }


    // Override abstract methods
    @Override
    public void printInfo() {
        System.out.println("Model: " + getModel());
        System.out.println("RAM: " + getMemory());
        System.out.println("Storage " + getStorage());
        System.out.println("Size " + getSize());
        System.out.println("Upgradeable: " + getIsUpgradeable());
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
