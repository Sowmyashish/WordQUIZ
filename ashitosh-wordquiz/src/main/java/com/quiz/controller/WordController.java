package com.quiz.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.quiz.model.Word;
import com.quiz.service.WordService;

@Controller
public class WordController {
	
	@Autowired
	WordService WordServiceImpl;
	List<Word> resultObjects = new ArrayList<>();
	List<Word> objects = new ArrayList<>();
	List<Integer> objectIds = new ArrayList<>();

	@RequestMapping(value = "/getWords", method = RequestMethod.GET)
    public ModelAndView getWord(HttpServletRequest request, @PathParam(value = "wordListId") Integer wordListId){
    	System.out.println(wordListId);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("allWords", WordServiceImpl.findByListId(wordListId));
        modelAndView.setViewName("words");
        return modelAndView;
    }

	@RequestMapping(value = "/addnewword", method = RequestMethod.POST)
	public ModelAndView saveWord(HttpServletRequest request, @RequestParam int listId, @RequestParam String word,
			@RequestParam String pos, @RequestParam String meaning, @RequestParam String example)

	{
		Word words = new Word();
		words.setListId(listId);
		words.setWord(word);
		words.setPos(pos);
		words.setMeaning(meaning);
		words.setExample(example);
		words.setCorrectWord(word);
		words.setCategory("none");
		words.setRemaining(0);
		words.setWrong_count(0);
		words.setIs_done(0);
//		System.out.println("***********WORD**************" + words.getWord());
//		System.out.println("***********POS**************" + words.getPos());
//		System.out.println("***********MEANING**************" + words.getMeaning());
//		System.out.println("***********EXAMPLE**************" + words.getExample());
//		System.out.println("***********List ID**************" + words.getListId());
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("wordList", WordServiceImpl.saveWordAndGetAll(words));
		modelAndView.setViewName("index");
		return modelAndView;
	}
	
	
	@RequestMapping(value = "/getQuizWords", method = RequestMethod.GET)
    public ModelAndView getQuizWords(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
//        resultObjects.clear();
//    	objects.clear();
//        resultObjects.addAll((Collection<? extends Word>) WordServiceImpl.getWord());
//        for (int i = 0; i < 5; i++) {
//        	Integer random = (int) (Math.floor(Math.random() * (100 - 1)) + 1);
//              for(Word wordObj:resultObjects) {
//            	  if(wordObj.getId()==random && !objects.contains(wordObj)) {
//            		  objects.add(wordObj);
//            	  }
//              }
//        }
        modelAndView.addObject("quizWords", WordServiceImpl.getQuizWords());
        //modelAndView.addObject("quizWords", objects);
        modelAndView.setViewName("quiz");
        return modelAndView;
    }
	
	
	@RequestMapping(value = "/validateQuiz", method = RequestMethod.POST)
	public ModelAndView validateQuiz(HttpServletRequest request, @RequestParam int id1, @RequestParam String answer1,
			@RequestParam int id2, @RequestParam String answer2, @RequestParam int id3, @RequestParam String answer3,
			@RequestParam int id4, @RequestParam String answer4, @RequestParam int id5, @RequestParam String answer5)

	{
		double count = 0;
		double percentage = 0.0;
		String returnString = "";
		ModelAndView modelAndView = new ModelAndView();
		List<Word> resultObjects1 = new ArrayList<>();
		resultObjects1.addAll((Collection<? extends Word>) WordServiceImpl.getWord());

		for (Word wordObj : resultObjects1) {
			if (wordObj.getId().intValue() == id1 && wordObj.getWord().equalsIgnoreCase(answer1.trim())) {
				count++;
			}
			if (wordObj.getId().intValue() == id2 && wordObj.getWord().equalsIgnoreCase(answer2.trim())) {
				count++;
			}
			if (wordObj.getId().intValue() == id3 && wordObj.getWord().equalsIgnoreCase(answer3.trim())) {
				count++;
			}
			if (wordObj.getId().intValue() == id4 && wordObj.getWord().equalsIgnoreCase(answer4.trim())) {
				count++;
			}
			if (wordObj.getId().intValue() == id5 && wordObj.getWord().equalsIgnoreCase(answer5.trim())) {
				count++;
			}
		}
		if(count>0) {
			percentage = ((count/5.0)*100);
		}
		returnString = "Percentage Scored : "+percentage+"%";
		modelAndView.addObject("response", returnString);
		modelAndView.setViewName("result");
		return modelAndView;
	}
    

}
