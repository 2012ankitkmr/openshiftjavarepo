package com.naman.demo.model;

import javax.persistence.Entity;

@Entity
public class LTI_Records {
	
	
	private String name;
	private String cloudgroups;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCloudgroups() {
		return cloudgroups;
	}
	public void setCloudgroups(String cloudgroups) {
		this.cloudgroups = cloudgroups;
	}

	
	
}
