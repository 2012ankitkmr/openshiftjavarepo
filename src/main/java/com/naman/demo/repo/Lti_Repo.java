package com.naman.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.naman.demo.model.LTI_Records;

public interface Lti_Repo extends CrudRepository<LTI_Records, String> {

}
