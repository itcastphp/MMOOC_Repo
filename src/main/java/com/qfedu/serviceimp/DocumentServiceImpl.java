package com.qfedu.serviceimp;

import com.qfedu.dao.ClassIfyDao;
import com.qfedu.dao.DocumentDao;
import com.qfedu.domain.Classify;
import com.qfedu.domain.Document;
import com.qfedu.domain.UserInfo;
import com.qfedu.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class DocumentServiceImpl implements DocumentService {
    @Autowired
    private DocumentDao documentDao;

    @Override
    public List<Document> getAllDocument() {
        List<Document> allDocument=null;
        try {
            allDocument = documentDao.getAllDocument();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return allDocument;
    }

    @Override
    public List<Document> getDocumentsByName(String name) {
        List<Document> documents=null;
        try {
            documents= documentDao.getDocumentByName(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return documents;
    }


    @Override
    public void removeDocumentById(Integer id) {
        try {
            documentDao.deleteDocumentById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Document> getDocumentsByUsername(String username) {
        List<Document> documents = null;
        try {
            documents = documentDao.selectDocumentsByUsername(username);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return documents;
    }

    @Override
    public void  insertDocument(int kind, String name, String uploadUser) {
        try {
            documentDao.insertDocument(kind,name,uploadUser);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
