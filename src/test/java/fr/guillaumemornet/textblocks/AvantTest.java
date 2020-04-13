package fr.guillaumemornet.textblocks;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class AvantTest {


    @Test
    public void testAvant() {

        String errorDescriptions =
                "200 : requête traitée\n"
                + "202 : requête acceptée, en cours de traitement\n"
                + "400 : ta faute\n"
                + "500 : ma faute "
                + "ou celle de la base de données";

    }
}
