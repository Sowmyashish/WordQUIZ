package com.quiz.service;

import com.quiz.model.WordList;
import com.quiz.repository.WordListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by Sowmya on 10/05/18.
 */
@Service
public class WordListServiceImpl implements WordListService {

    @Autowired
    WordListRepository wordListRepository;

    @Override
    public Iterable<WordList> getWordLists() {
        return wordListRepository.findAll();
    }

    @Override
    public WordList saveWordList(WordList wordList) {
        return wordListRepository.save(wordList);
    }

    @Override
    public Iterable<WordList> saveWordListAndGetAll(WordList wordList) {
        wordListRepository.save(wordList);
        return wordListRepository.findAll();
    }
}
