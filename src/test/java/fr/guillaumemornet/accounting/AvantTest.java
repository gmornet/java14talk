package fr.guillaumemornet.accounting;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.util.Locale;

@QuarkusTest
public class AvantTest {

    @Test
    public void testAvant() {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("en-US-u-cf-account"));
        System.out.println(nf.format(-3.24));
    }
}
