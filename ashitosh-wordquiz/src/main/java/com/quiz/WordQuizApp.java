package com.quiz;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Created by Sowmya on 10/05/18.
 */

@SpringBootApplication
public class WordQuizApp
{
    private static Logger logger = Logger.getLogger(WordQuizApp.class.getName());

    public static void main( String[] args )
    {
        try {
            ApplicationContext context = SpringApplication.run(WordQuizApp.class, args);
            String[] beans = context.getBeanDefinitionNames();
            for(String str: beans){
                System.out.println(str);
            }
        }
        catch (Exception ex){
            logger.fatal(ex.getMessage());
            throw ex;
        }
    }
}
