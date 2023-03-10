package Wort;
public class WordMapper {
    public static WordEntity toWordEntity(Word word) {
        WordEntity wordEntity = new WordEntity();
        wordEntity.setdWord(word.getdWord());
        wordEntity.setfWord(word.getfWord());
        wordEntity.setCat(word.getCat());
        wordEntity.setCorrect(word.getCorrect());
        return wordEntity;
    }
    public static Word toWord(WordEntity wordEntity) {
        Word word = new Word();
        word.setdWord(wordEntity.getdWord());
        word.setfWord(wordEntity.getfWord());
        word.setCat(wordEntity.getCat());
        word.setCorrect(wordEntity.getCorrect());
        return word;
    }
}
