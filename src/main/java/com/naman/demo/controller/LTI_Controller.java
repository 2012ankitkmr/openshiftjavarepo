package com.naman.demo.controller;


import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naman.demo.model.LTI_Records;
import com.naman.demo.repo.Lti_Repo;

@RestController
public class LTI_Controller {
	
	private Lti_Repo lti_Repo;
	@RequestMapping("fetch")
	public List<LTI_Records> fetch(){
		List<LTI_Records> list=new LinkedList();
	 return list= (List<LTI_Records>) lti_Repo.findAll();		
	}
}
