package com.te.quizproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.quizproject.bean.Category;
import com.te.quizproject.bean.Quiz;
import com.te.quizproject.config.CategoryConfig;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter you name!!!!!!");
    	String s=sc.nextLine();
        ApplicationContext context=new AnnotationConfigApplicationContext(CategoryConfig.class);
        Category c1=context.getBean(Category.class);
        
        Quiz q4=new Quiz();
        q4.setQid(50);
        q4.setQuestion("The concept of gravity was discovered by which famous physicist???");
        q4.setOptiona("Newton");
        q4.setOptionb("einstein");
        q4.setOptionc("Tesla");
        
        Quiz q5=new Quiz();
        q5.setQid(60);
        q5.setQuestion("What is the biggest planet in our solar system??");
        q5.setOptiona("Mars");
        q5.setOptionb("Jupiter");
        q5.setOptionc("Mercury");
        
        Quiz q6=new Quiz();
        q6.setQid(70);
        q6.setQuestion("How many teeth does an adult human have??");
        q6.setOptiona("30");
        q6.setOptionb("25");
        q6.setOptionc("32");
        
        Quiz q7=new Quiz();
        q7.setQid(80);
        q7.setQuestion("What is the study of mushrooms called??");
        q7.setOptiona("Mycology");
        q7.setOptionb("Zoology");
        q7.setOptionc("Botany");
        
        
        
        List<Quiz> l1=new ArrayList<Quiz>();
        l1.add(q4);
        l1.add(q5);
        l1.add(q6);
        l1.add(q7);
        
        c1.setQuiz(l1);
        q4.setCat(c1);
        q5.setCat(c1);
        q6.setCat(c1);
        q7.setCat(c1);
        
        
      
        
        try {
        	  System.out.println("Enter the no in category");
              int value=sc.nextInt();
        	EntityManagerFactory emf=Persistence.createEntityManagerFactory("QuizData");
        	EntityManager em=emf.createEntityManager();
//        	EntityTransaction et=em.getTransaction();
//        	et.begin();
        	String str="select question,optiona,optionb,optionc from Quiz where id=:eid";
        	Query q=em.createQuery(str);
        	q.setParameter("eid", value);
        	List<Quiz> l=q.getResultList();
        	for(Quiz qz:l) {
        		System.out.println(qz.getQuestion());
        		System.out.println(qz.getOptiona());
        		System.out.println(qz.getOptionb());
        		System.out.println(qz.getOptionc());
        	}
        	
//        	et.commit();
        	
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
 
    }
}
