package com.quiz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.model.Word;
import com.quiz.model.WordList;
import com.quiz.repository.WordListRepository;
import com.quiz.repository.WordRepository;


@Service
public class WordServiceImpl implements WordService {

	@Autowired
    WordRepository wordRepository;
	@Autowired
    WordListRepository wordListRepository;

    @Override
    public Iterable<Word> getWord() {
        return wordRepository.findAll();
    }

    @Override
    public Word saveWord(Word word) {
        return wordRepository.save(word);
    }

    @Override
    public Iterable<WordList> saveWordAndGetAll(Word word) {
        wordRepository.save(word);
        return wordListRepository.findAll();
    }
    
    @Override
    public Iterable<Word> findByListId(Integer listId) {
        return wordRepository.findByListId(listId);
    }
    
//    @Override
//    public Iterable<Word> findByWordId(Integer wordId) {
//        return wordRepository.findByWordId(wordId);
//    }
    
    @Override
    public Iterable<Word> getQuizWords() {
        return wordRepository.getQuizWords();
    }

}
