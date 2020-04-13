package fr.guillaumemornet.instance;

import fr.guillaumemornet.record.level1.NomComplet;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class AvantTest {

    class Rectangle {
        public int getSurface() {
            return 20;
        }
    }

    @Test
    public void testAvant() {
        Object object = new Rectangle();

        if (object instanceof Rectangle rectangle) {
            System.out.println(rectangle.getSurface());
        }
    }
}
