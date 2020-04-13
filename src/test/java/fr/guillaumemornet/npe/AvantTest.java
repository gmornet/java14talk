package fr.guillaumemornet.npe;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

@QuarkusTest
public class AvantTest {

    class Vertex {
        int x, y;
    }

    class Linedef {
        Vertex a;
        Vertex b;

        Sidedef right;
        Sidedef left;
    }

    class Sidedef {
        Linedef linedef;
    }

    class Sector {
        Set<Sidedef> sidedefs;
    }

    @Test
    public void jeKif︎Npe() {

        Sector sector = buildSector();

        System.out.println(sector.sidedefs.iterator().next().linedef.a.x);

    }

    private Sector buildSector() {
        Sector s = new Sector();
        s.sidedefs = new HashSet<>();
        s.sidedefs.add(new Sidedef());
        return s;
    }

    private void solution() {
        // -XX:+ShowCodeDetailsInExceptionMessages
    }
}
