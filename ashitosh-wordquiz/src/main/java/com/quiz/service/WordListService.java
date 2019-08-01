package com.quiz.service;

import com.quiz.model.WordList;


/**
 * Created by Sowmya on 10/05/18.
 */
public interface WordListService {
    public Iterable<WordList> getWordLists();
    public WordList saveWordList(WordList wordList);
    public  Iterable<WordList> saveWordListAndGetAll(WordList wordList);
}
