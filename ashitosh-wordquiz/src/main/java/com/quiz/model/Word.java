package com.quiz.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


	@Entity
	@Table(name = "WORDS")
	public class Word {
		public Word() {
	    }
		
	    public Integer getId() {
			return id;
		}


		public void setId(Integer id) {
			this.id = id;
		}


		public Integer getListId() {
			return listId;
		}


		public void setListId(Integer list_id) {
			listId = list_id;
		}


		public String getWord() {
			return word;
		}


		public void setWord(String wordName) {
			word = wordName;
		}


		public String getPos() {
			return pos;
		}


		public void setPos(String wordPos) {
			pos = wordPos;
		}


		public String getMeaning() {
			return meaning;
		}


		public void setMeaning(String wordMeaning) {
			meaning = wordMeaning;
		}


		public String getExample() {
			return example;
		}


		public void setExample(String wordExample) {
			example = wordExample;
		}


		public String getCorrectWord() {
			return correctWord;
		}


		public void setCorrectWord(String correct_word) {
			correctWord = correct_word;
		}


		public String getCategory() {
			return category;
		}


		public void setCategory(String wordCategory) {
			category = wordCategory;
		}


		public Integer getRemaining() {
			return remaining;
		}


		public void setRemaining(Integer wordRemaining) {
			remaining = wordRemaining;
		}


		public Integer getWrongCount() {
			return wrongCount;
		}


		public void setWrong_count(Integer wrong_count) {
			wrongCount = wrong_count;
		}


		public Integer getIsDone() {
			return isDone;
		}


		public void setIs_done(Integer is_done) {
			isDone = is_done;
		}


		@Id
	    @GeneratedValue
	    @Column(name = "word_id")
	    private Integer id;

	    
	    @Column(name = "list_id")
	    @NotNull
	    private Integer listId;
	    
	    
	    @Column(name = "word")
	    @NotNull
	    private String word;
	    
	    
	    @Column(name = "pos")
	    @NotNull
	    private String pos;
	  
	    
	    @Column(name = "meaning")
	    @NotNull
	    private String meaning;

	    
	    @Column(name = "example")
	    @NotNull
	    private String example;
	    
	    
	    @Column(name = "correct_word")
	    @NotNull
	    private String correctWord;
	    
	    
	    @Column(name = "category")
	    @NotNull
	    private String category;
	    
	    
	    @Column(name = "remaining")
	    @NotNull
	    private Integer remaining;
	    
	
	    @Column(name = "wrong_count")
	    @NotNull
	    private Integer wrongCount;
	    
	    
	    @Column(name = "is_done")
	    @NotNull
	    private Integer isDone;
	    
	    @Override
	    public String toString() {
	        return "Word{" +
	                "word_id=" + id +
	                ", list='" + listId + '\'' +
	                ", word='" + word + '\'' +
	                ", pos=" + pos + '\'' +
	                ", meaning=" + meaning + '\'' +
	                ", example=" + example + '\'' +
	                ", correct_word=" + correctWord +'\'' +
	                ", category=" + category + '\'' +
	                ", remaining" + remaining + '\'' +
	                ", wrong_count" +wrongCount + '\'' +
	                ", is_done" + isDone+ '\'' +
	                '}';
	    }       
	    

}
