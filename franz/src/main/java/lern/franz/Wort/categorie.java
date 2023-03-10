package Wort;

public enum categorie {
    VERB("VERB"),
    NOMEN("NOMEN"),
    ADJEKTIV("ADJEKTIV"),
    OTHER("OTHER");

    private final String categorie;

    categorie(String categorie) {
        this.categorie = categorie;
    }

    public String getCategorie() {
        return categorie;
    }
}
