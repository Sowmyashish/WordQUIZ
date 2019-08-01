package com.quiz.resources;

import com.quiz.model.WordList;
import com.quiz.model.beans.RestDataMessage;
import com.quiz.model.beans.RestMessage;
import com.quiz.service.WordListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashitosh on 10/05/18.
 */
@RestController
@RequestMapping("/api/lists")
public class ListResource {

    @Autowired
    WordListService wordListServiceImpl;

    @RequestMapping
    public RestMessage<List<WordList>> getWordLists(){
        List<WordList> list = new ArrayList<>();
        for(WordList wordList : wordListServiceImpl.getWordLists()){
            list.add(wordList);
        }
        return new RestDataMessage<>(list);
    }

    @RequestMapping(method = RequestMethod.POST)
    public RestMessage<WordList> saveWordList(@RequestBody WordList wordList){
        WordList response = wordListServiceImpl.saveWordList(wordList);
        return new RestDataMessage<>(response);
    }
}
