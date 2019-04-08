package com.pg.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WishMessageController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ModelAndView mav=null;
		mav=new ModelAndView();
		mav.setViewName("wishMsg");
		mav.addObject("msg","Good Morning Preetam Gagan");
		mav.addObject("date", new Date());
		return mav;
	}

}
