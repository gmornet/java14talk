package fr.guillaumemornet.record.level4;

import io.quarkus.test.junit.QuarkusTest;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
public class Level4Test {

    @Test
    public void testRecordLevel4() {

        var cliente = new SignaletiqueCliente(
                new NomComplet("Catherine", "Hamon"),
                -42);

        assertThat(cliente.age())
                .describedAs("Pas d'âges pourris dans le référentiel !")
                .isPositive();
    }
}
