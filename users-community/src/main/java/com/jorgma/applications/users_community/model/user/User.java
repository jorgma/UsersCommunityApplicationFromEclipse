package com.jorgma.applications.users_community.model.user;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.jorgma.applications.users_community.model.document.Document;

@Entity
@Table(name="user")
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UserId id;

	@Column(name="name", nullable = false)
	private String name;
	
	private Set<Document> documents;
	
	public UserId getId() {
		return id;
	}

	public void setId(UserId id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(Set<Document> documents) {
		this.documents = documents;
	}
	
}
