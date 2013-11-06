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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Document other = (Document) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
