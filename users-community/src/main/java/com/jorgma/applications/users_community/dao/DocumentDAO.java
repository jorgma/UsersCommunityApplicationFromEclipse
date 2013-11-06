package com.jorgma.applications.users_community.dao;

import com.jorgma.applications.users_community.model.document.Document;
import com.jorgma.applications.users_community.model.document.DocumentId;

public interface DocumentDAO {
	void save(Document document);
	Document get(DocumentId id);
	void delete(Document document);
}
