package progetto;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DiskTest {

    @Test
    void constructorSetsWeight() {
        Disk disk = new Disk(10);
        assertEquals(10, disk.getWeight());
    }

    @Test
    void setWeightChangesWeight() {
        Disk disk = new Disk(5);
        disk.setWeight(20);
        assertEquals(20, disk.getWeight());
    }
}

