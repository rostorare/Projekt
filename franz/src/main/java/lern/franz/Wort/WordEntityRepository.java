package Wort;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WordEntityRepository extends JpaRepository<WordEntity,Long> {
    WordEntity findByDword(String dWord);
    WordEntity findByFword(String fWord);
    List<WordEntity> findAllByCategorie(categorie cat);
    WordEntity updateByfWord(String fWord);
    WordEntity updateBydWord(String dWord);

}
