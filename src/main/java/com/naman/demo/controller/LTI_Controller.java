package com.naman.demo.controller;


import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naman.demo.model.LTI_Records;
import com.naman.demo.repo.Lti_Repo;

@RestController
public class LTI_Controller {
	
	@Autowired
	private Lti_Repo lti_Repo;
	@RequestMapping("/fetch")
	public Iterable<LTI_Records> fetch(){
	 return lti_Repo.findAll();		
	}
}
