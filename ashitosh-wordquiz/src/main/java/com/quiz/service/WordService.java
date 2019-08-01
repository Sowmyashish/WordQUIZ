package com.quiz.service;
import java.util.List;

import com.quiz.model.Word;
import com.quiz.model.WordList;


public interface WordService {
	 public Iterable<Word> getWord();
	    public Word saveWord(Word word);
	    public Iterable<WordList> saveWordAndGetAll(Word word);
	    public Iterable<Word> findByListId(Integer listId);
	    //public Iterable<Word> findByWordId(Integer wordId);
	    public Iterable<Word> getQuizWords();

}
