package com.jorgma.applications.users_community.model.document;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class DocumentId {
	
	@Column(name= "id", nullable = false)
	private String id;

	public DocumentId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
