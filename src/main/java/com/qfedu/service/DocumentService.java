package com.qfedu.service;

import com.qfedu.domain.Document;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface DocumentService {

    public List<Document> getAllDocument();

    public List<Document> getDocumentsByName(String name);

    public void removeDocumentById(Integer id);

    public List<Document> getDocumentsByUsername(String username);

    public void insertDocument(int kind,String name,String uploadUser);
}
