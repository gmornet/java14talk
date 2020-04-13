package fr.guillaumemornet.switches;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class Level2Test {

    @Test
    public void testLevel2() {

        var resto = new NouveauRestoGroupamaFonctionnel();

        System.out.println(
                resto.calculePrixRepas(
                        NouveauRestoGroupamaFonctionnel.TypeClient.PRESTATAIRE,
                        5,
                        "Audren")
                        + "€");
    }

}

class NouveauRestoGroupamaFonctionnel {
    enum TypeClient {
        INTERNE, VISITEUR, PRESTATAIRE
    }

    /**
     * Ajoute les frais de couvert selon le type de client.
     *
     * @return prix complet à payer
     */
    public int calculePrixRepas(TypeClient typeClient, int prixArticles, String prenom) {
        int prix = prixArticles;

        prix += switch (typeClient) {
            case INTERNE -> 1;
            case VISITEUR -> 10;
            case PRESTATAIRE -> {
                if (prenom.equals("Audren")) {
                    yield 1;
                } else {
                    yield 10;
                }
            }
            default -> 999;
        };

        return prix;
    }
}