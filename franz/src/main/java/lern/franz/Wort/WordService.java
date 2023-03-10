package Wort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WordService {

    @Autowired
    private final WordEntityRepository wordEntityRepository;

    public WordService(WordEntityRepository wordEntityRepository) {
        this.wordEntityRepository = wordEntityRepository;
    }
    public List<Word> getAllWords() {
        List<WordEntity> wordEntities = wordEntityRepository.findAll();
        return wordEntities.stream().map(WordMapper::toWord).collect(Collectors.toList());
    }


    public Word getWord(Long id) {
        WordEntity wordEntity = wordEntityRepository.findById(id).orElse(null);
        return wordEntity != null ? WordMapper.toWord(wordEntity) : null;
    }
    public Word getdWord(String dWord) {
        WordEntity wordEntity = wordEntityRepository.findByDword(dWord);
        return wordEntity != null ? WordMapper.toWord(wordEntity) : null;
    }
    public Word getfWord(String fWord){
        WordEntity wordEntity = wordEntityRepository.findByFword(fWord);
        return wordEntity != null ? WordMapper.toWord(wordEntity):null;
    }

    public List<Word> getAllByCategorie(categorie cat){
        List<WordEntity> wordEntities = wordEntityRepository.findAllByCategorie(cat);
        return wordEntities.stream().map(WordMapper::toWord).collect(Collectors.toList());
    }

    public Word createWord(Word word) {
        WordEntity wordEntity = WordMapper.toWordEntity(word);
        wordEntity = wordEntityRepository.save(wordEntity);
        return WordMapper.toWord(wordEntity);
    }

    public Word updateWord(Long id, Word word) {
        WordEntity wordEntity = wordEntityRepository.findById(id).orElse(null);
        if (wordEntity == null) {
            return null;
        }
        wordEntity = WordMapper.toWordEntity(word);
        wordEntity = wordEntityRepository.save(wordEntity);
        return WordMapper.toWord(wordEntity);
    }




    public void deleteWord(Long id) {
        wordEntityRepository.deleteById(id);
    }
}
