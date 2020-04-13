package fr.guillaumemornet.record.level4;

public record SignaletiqueCliente(NomComplet nomComplet, int age) {
    public SignaletiqueCliente {
        if (age < 0) {
            throw new IllegalArgumentException("age doit être positif");
        }
    }
}
