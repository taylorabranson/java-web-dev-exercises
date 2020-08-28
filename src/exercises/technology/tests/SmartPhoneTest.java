package exercises.technology.tests;

import exercises.technology.SmartPhone;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SmartPhoneTest {
    SmartPhone test_phone1 = new SmartPhone("iPhone 8", 4, 64, 4.7, false, "4G");

    SmartPhone test_phone2 = new SmartPhone("Google Pixel", 4, 64, 4.7, true, "5G");

    @Test
    public void aTestInheritedIdNumber() {
        assertEquals(1, test_phone1.getId());
        assertEquals(2, test_phone2.getId());
    }

    @Test
    public void bCanUpgradeWhenUpgradeable() {
        test_phone2.upgradeMemory(6);
        assertTrue(test_phone2.getMemory() == 6);
    }

    @Test
    public void cUpgradeFailsIfNotUpgradeable() {
        test_phone1.upgradeMemory(6);
        assertFalse(test_phone1.getMemory() == 6);
    }
}
