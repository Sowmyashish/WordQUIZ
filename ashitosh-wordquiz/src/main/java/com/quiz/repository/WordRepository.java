package com.quiz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.quiz.model.Word;

public interface WordRepository extends CrudRepository<Word, Integer>{
	
	//public List<Word> findByWordId(Integer wordId);
	
	public List<Word> findByListId(Integer listId);
	
	@Query(value="SELECT * FROM WORDS ORDER BY RAND() LIMIT 5", nativeQuery = true)
    public List<Word> getQuizWords();
	
	
}