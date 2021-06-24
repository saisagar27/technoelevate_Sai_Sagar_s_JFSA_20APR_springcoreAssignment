package com.te.quizproject.bean;

import javax.persistence.CascadeType;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity

public class Quiz implements Serializable{
	@Id
	@Column
	private int qid;
	@Column
	private String question;
	@Column
	private String optiona;
	@Column
	private String optionb;
	@Column
	private String optionc;
	
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.DETACH,CascadeType.PERSIST})
	@JoinColumn(name="id")
	
	private Category cat;
}
