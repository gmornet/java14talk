package fr.guillaumemornet.record.level1;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class Level1Test {

    @Test
    public void testRecordLevel1() {

        var guillaume = new NomComplet("Guillaume", "Mornet");

        System.out.println(guillaume.nom());
        System.out.println(guillaume.hashCode());
        System.out.println(guillaume);
    }
}
