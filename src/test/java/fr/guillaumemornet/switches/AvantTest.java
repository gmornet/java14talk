package fr.guillaumemornet.switches;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class AvantTest {


    @Test
    public void testAvant() {

        var resto = new RestauGroupama();

        System.out.println(
                resto.calculePrixRepas(
                        RestauGroupama.TypeClient.PRESTATAIRE, 5, "Audren")
                        + "€");

    }

}

class RestauGroupama {
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
            case INTERNE:
                prix += 1;
                break;
            case VISITEUR:
                prix += 10;
            case PRESTATAIRE:
                if (prenom.equals("Audren")) {
                    prix += 1;
                } else {
                    prix += 10;
                }
                break;
            default:
                // Type de client inconnu, si il veut payer ça tant mieux
                prix += 999;
        }

        return prix;
    }
}