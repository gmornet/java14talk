package fr.guillaumemornet.switches;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class Level1Test {


    @Test
    public void testLevel1() {

        var resto = new NouveauRestoGroupama();

        System.out.println(
                resto.calculePrixRepas(
                        NouveauRestoGroupama.TypeClient.INTERNE, 5, "Audren")
                        + "€");

    }

}

class NouveauRestoGroupama {
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

        switch (typeClient) {
            case INTERNE -> {
                prix += 1;
            }
            case VISITEUR -> {
                prix += 10;
            }
            case PRESTATAIRE -> {
                if (prenom.equals("Audren")) {
                    prix += 1;
                } else {
                    prix += 10;
                }
            }
            default -> {
                // Type de client inconnu, si il veut payer ça tant mieux
                prix += 999;
            }
        }

        return prix;
    }

}