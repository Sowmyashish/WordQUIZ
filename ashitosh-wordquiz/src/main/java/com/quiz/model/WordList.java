package com.quiz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;



@Entity
@Table(name = "WORD_LIST")
public class WordList {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NAME")
    @NotNull
    private String listName;

    @Column(name = "DESCRIPTION")
    @NotNull
    private String listDescription;

    public WordList() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public String getListDescription() {
        return listDescription;
    }

    public void setListDescription(String listDescription) {
        this.listDescription = listDescription;
    }

    @Override
    public String toString() {
        return "WordList{" +
                "id=" + id +
                ", listName='" + listName + '\'' +
                ", listDescription='" + listDescription + '\'' +
                '}';
    }
}
