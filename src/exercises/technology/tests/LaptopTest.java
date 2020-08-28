package exercises.technology.tests;

import exercises.technology.Laptop;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LaptopTest {
    Laptop test_laptop = new Laptop("MacBook Pro", 16, 2000, 16, true);;
    Laptop test_laptop2 = new Laptop("Dell Inpsiron", 32, 3500, 15, false);

    @Test
    public void atestInheritedIdNumber() {
        System.out.println(test_laptop.getId());
        assertEquals(1, test_laptop.getId());
    }

    @Test
    public void bCanUpgradeWhenUpgradeable() {
        test_laptop.upgradeMemory(4000);
        assertTrue(test_laptop.getMemory() == 4000);
    }

    @Test
    public void cUpgradeFailsIfNotUpgradeable() {
        test_laptop2.upgradeStorage(5000);
        assertFalse(test_laptop2.getStorage() == 5000);
    }

}
