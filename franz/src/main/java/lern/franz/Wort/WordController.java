package Wort;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WordController {

    private final WordService wordService;
    private final String api = "/api/v1/word";

    public WordController(WordService wordService) {
        this.wordService = wordService;
    }

    @GetMapping(path= "/")
    public  String index(){
        return "Hello World";
    }

    @GetMapping(path=api)
    public ResponseEntity<List<Word>> getAllWords(){
        List<Word> allWords = wordService.getAllWords();
        return ResponseEntity.ok(allWords);
    }

    @GetMapping(path=api+"/categorie/{cat}")
    public ResponseEntity <List<Word>> getAllWordsByCategorie(categorie cat){
        List<Word> allCatWords = wordService.getAllByCategorie(cat);
            return ResponseEntity.ok(allCatWords);
    }

    @GetMapping(path=api+"/{id}")
    public ResponseEntity<Word> getWord(@PathVariable Long id){
        Word word = wordService.getWord(id);
            if (word == null){
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(word,HttpStatus.OK);
    }
    @GetMapping(path=api+"/{dWord}")
       public ResponseEntity<Word> getdWord(@PathVariable String dWord){
        Word word = wordService.getdWord(dWord);
            if (word == null){
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(word,HttpStatus.OK);
    }
    @GetMapping(path=api+"/{fWord}")
    public ResponseEntity<Word> getfWord(@PathVariable String fWord) {
        Word word = wordService.getfWord(fWord);
        if (word == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(word, HttpStatus.OK);
    }
    @PostMapping(path=api)
    public ResponseEntity<Word> createWord(@RequestBody Word word){
        Word newWord = wordService.createWord(word);
        return new ResponseEntity<>(newWord, HttpStatus.CREATED);
    }

    @PutMapping(path=api+"/{id}")
    public ResponseEntity<Word> updateWord(@PathVariable Long id, Word word){
        Word updateWord = wordService.updateWord(id,word);
        if(updateWord == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(updateWord, HttpStatus.OK);
    }

    @DeleteMapping(path=api+"/{id}")
    public ResponseEntity<Void> deleteWord(@PathVariable Long id){
        wordService.deleteWord(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    // add put by dword and fword
    //add delete by dword and fword


    }

}
