package com.qfedu.action;

import com.qfedu.domain.UserInfo;
import com.qfedu.serviceimp.UserInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
@SessionAttributes("username")
public class DetailAction{
   /* @Autowired
    private UserInfoServiceImpl userInfoServiceImpl;

    @RequestMapping(value = "detailAction",method = RequestMethod.POST)
    @ResponseBody
    public UserInfo detailAction(@RequestParam("username") String username){
        UserInfo user = userInfoServiceImpl.findUserByUsername(username);
        return user;
    }*/

    @Autowired
    private UserInfoServiceImpl userInfoServiceImpl;

    @RequestMapping(value = "userDetailAction",method = RequestMethod.GET)
   public ModelAndView userDetailAction(String username,Integer userType){
       ModelAndView modelAndView = new ModelAndView();
       modelAndView.addObject("username",username);
       if(userType==1){
           modelAndView.setViewName("/studentdetail.html");
       }else if(userType==2){
           modelAndView.setViewName("/teacherdetail.html");
       }
       return modelAndView;
   }

    @RequestMapping(value = "getUserInfo",method = RequestMethod.GET)
    @ResponseBody
    public UserInfo getUserInfo(HttpServletRequest request){
        String username = (String) request.getSession().getAttribute("username");
        UserInfo user = userInfoServiceImpl.findUserByUsername(username);
        return user;
    }

}
