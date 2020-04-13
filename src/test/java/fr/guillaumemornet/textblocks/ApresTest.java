package fr.guillaumemornet.textblocks;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class ApresTest {


    @Test
    public void testAvant() {

        String errorDescriptions =
                        """
                        200 : requête traitée
                        202 : requête acceptée, en cours de traitement
                        400 : ta faute
                        500 : ma faute \
                        ou celle de la base de données
                        """;

        System.out.println(errorDescriptions);
    }
}
