package fr.guillaumemornet.record.level2;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

@QuarkusTest
public class Level2Test {

    @Test
    public void testRecordLevel2() {

        var guillaume = new NomComplet("Guillaume", "Mornet");
        var caroline = new NomComplet("Caroline", "De Saint-Roman");

        for (var personne : Arrays.asList(guillaume, caroline)) {
            System.out.println(personne.prenom() + " : " + personne.isNomCompose());
        }
    }
}
