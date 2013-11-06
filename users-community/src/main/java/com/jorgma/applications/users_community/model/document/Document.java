package com.jorgma.applications.users_community.model.document;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="document")
public class Document implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private DocumentId id;
	
	@Lob
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
