package fr.guillaumemornet.record.level3;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class Level3Test {

    @Test
    public void testRecordLevel3() {

        var cliente = new SignaletiqueCliente(
                new NomComplet("Catherine", "Hamon"),
                42);

        System.out.println(cliente);
    }
}
