package fr.guillaumemornet.record.level2;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

@Getter
public record NomComplet(String prenom, String nom) implements NomCompose {

    @Override
    public boolean isNomCompose() {
        return StringUtils.startsWithIgnoreCase(nom, "de ");
    }
}
