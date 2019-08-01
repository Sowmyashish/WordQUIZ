package com.quiz.controller;

import com.quiz.model.WordList;
import com.quiz.service.WordListService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Sowmya on 10/05/18.
 */
@Controller
public class WordListController {
    @Autowired
    WordListService wordListServiceImpl;

  //  @RequestMapping("/")
//    public ModelAndView getWodList(HttpServletRequest request){
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("wordList", wordListServiceImpl.getWordLists());
//        modelAndView.setViewName("index");
//        return modelAndView;
//    }

    @RequestMapping(value = "/addnewlist", method = RequestMethod.POST)
    public ModelAndView saveWordList(HttpServletRequest request, @RequestParam String listName, @RequestParam String listDescription){
        WordList wordList = new WordList();
        wordList.setListName(listName);
        wordList.setListDescription(listDescription);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("wordList", wordListServiceImpl.saveWordListAndGetAll(wordList));
        modelAndView.setViewName("index");
        return modelAndView;
    }
    
    
    @RequestMapping(value ="/", method = RequestMethod.GET)
    public ModelAndView getList(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("wordList", wordListServiceImpl.getWordLists());
        modelAndView.setViewName("index");
        return modelAndView;
}
}
