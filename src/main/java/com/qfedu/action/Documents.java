package com.qfedu.action;
import com.qfedu.domain.Document;
import com.qfedu.serviceimp.DocumentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Documents{

    @Autowired
    private DocumentServiceImpl documentService;

    @RequestMapping(value = "showAllDocuments",method = RequestMethod.POST)
    @ResponseBody
    public List<Document> showAllDocuments(){
        List<Document> documents = documentService.getAllDocument();
        return documents;
    }

    @RequestMapping(value = "showDocumentByName",method = RequestMethod.GET)
    @ResponseBody
    public List<Document> showDocumentByName(@RequestParam(value="name")  String name){
        List<Document> documents = documentService.getDocumentsByName(name);
        return documents;
    }

    @RequestMapping(value = "showDocumentsByUsername",method = RequestMethod.GET)
    @ResponseBody
    public List<Document> showDocumentsByUsername(@RequestParam("name") String name){
        List<Document> documents = documentService.getDocumentsByUsername(name);
        return documents;
    }

    @RequestMapping(value = "removeDocumentByIdAction",method = RequestMethod.GET)
    public  void RemoveDocumentByIdAction(String id){
        int did = Integer.parseInt(id.split("-")[1]);
        documentService.removeDocumentById(did);
    }
}
