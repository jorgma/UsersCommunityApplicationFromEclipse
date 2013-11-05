package com.jorgma.applications.users_community.model.document;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="document")
public class Document {

	@EmbeddedId
	private DocumentId id;
	@Column(name="content", nullable = false)
	private byte[] content;
	
	public DocumentId getId() {
		return id;
	}

	public void setId(DocumentId id) {
		this.id = id;
	}

	public byte[] getContent() {
		return Arrays.copyOf(content, content.length);
	}

	public void setContent(byte[] content) {
		this.content = Arrays.copyOf(content, content.length);
	}
}
