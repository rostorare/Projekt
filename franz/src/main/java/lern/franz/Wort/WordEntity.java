package Wort;

import javax.persistence.*;

@Entity
@Table(name ="WORDENTITY")
public class WordEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private long id;

    @Column(nullable = false, name ="DWORD")
    private String dWord;

    @Column(nullable = false, name ="FWORD")
    private String fWord;

    @Enumerated(EnumType.STRING)
    @Column(name ="CAT")
    private categorie cat;

    @Column(nullable = false, name ="CORRECT")
    private boolean correct;

    public WordEntity(long id, String dWord, String fWord, categorie cat,boolean correct) {
        this.id = id;
        this.dWord = dWord;
        this.fWord = fWord;
        this.cat = cat;
        this.correct = correct;
    }

    public WordEntity() {
    }

    public boolean getCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
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
}
