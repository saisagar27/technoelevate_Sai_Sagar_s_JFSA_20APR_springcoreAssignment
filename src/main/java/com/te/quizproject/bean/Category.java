package com.te.quizproject.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


import lombok.Data;

@Data
@Entity
public class Category implements Serializable{
	@Id
	@Column
	private int id;
	
	@Column
	private String name;
	
@OneToMany(mappedBy = "cat",cascade = {CascadeType.DETACH , CascadeType.MERGE,CascadeType.PERSIST})
private List<Quiz> quiz;
	


}
