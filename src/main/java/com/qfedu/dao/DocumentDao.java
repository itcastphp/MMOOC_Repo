package com.qfedu.dao;

import com.qfedu.domain.Document;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DocumentDao {
    @Select("select d.id,d.name,u.nickname,u.username,u.userType,d.uploadDate,c.bigname,c.smallname  from document d, userInfo u,classify c where d.uploadUser = u.username and d.kind = c.id")
    @ResultMap("myDocument")
    public List<Document> getAllDocument() throws  Exception;

    @Delete("delete from document where id=#{id}")
    public void deleteDocumentById(Integer id) throws  Exception;

    @Select("select d.id,d.name,u.nickname,u.username,u.userType,d.uploadDate,c.bigname,c.smallname  from document d, userInfo u,classify c where d.uploadUser = u.username and d.kind = c.id and d.name=#{name}")
    @ResultMap("myDocument")
    public List<Document> getDocumentByName(String name) throws  Exception;

    @Select("select d.id,d.name,c.bigName,c.smallName,d.uploadDate from document d,classify c where c.id=d.kind and d.uploadUser=#{uploadUser}")
    @ResultMap("myDocument")
    public List<Document> selectDocumentsByUsername(String username) throws  Exception;

    public void insertDocument(int kind, String name, String uploadUser) throws  Exception;
}
