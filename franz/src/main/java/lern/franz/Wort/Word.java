package Wort;

import Wort.categorie;

public class Word {
    private long id;
    private String dWord;
    private String fWord;
    private categorie cat;
    private boolean correct;

    public Word() {
    }

    public Word( String dWord, String fWord, categorie cat, boolean correct) {
        this.dWord = dWord;
        this.fWord = fWord;
        this.cat = cat;
        this.correct = correct;
    }

    public Word(long id, String dWord, String fWord, categorie cat, boolean correct) {
        this.id = id;
        this.dWord = dWord;
        this.fWord = fWord;
        this.cat = cat;
        this.correct = correct;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getdWord() {
        return dWord;
    }

    public void setdWord(String dWord) {
        this.dWord = dWord;
    }

    public String getfWord() {
        return fWord;
    }

    public void setfWord(String fWord) {
        this.fWord = fWord;
    }

    public categorie getCat() {
        return cat;
    }

    public void setCat(categorie cat) {
        this.cat = cat;
    }

    public boolean getCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }
}
