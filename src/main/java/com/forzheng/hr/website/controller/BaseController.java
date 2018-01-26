package com.forzheng.hr.website.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.ModelAttribute;

public class BaseController {

	protected HttpSession session;
    protected HttpServletRequest request;
    protected HttpServletResponse response;

    @ModelAttribute
    public void init(HttpSession session,HttpServletRequest request,HttpServletResponse response){
        this.session = session;
        this.request = request;
        this.response = response;
    }
}
