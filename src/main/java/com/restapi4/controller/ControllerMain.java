package com.restapi4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi4.entity.OfficeEntity;
import com.restapi4.service.OfficeService;

@RestController
public class ControllerMain {
	@Autowired
	private OfficeService service;
	@GetMapping("/getall")
	public ResponseEntity<List<OfficeEntity>> getAllData(){
		List<OfficeEntity> allData = service.getAllData();
		if (allData.size()<=0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(allData);
	}
    @GetMapping("/get/{id}")
	public ResponseEntity<OfficeEntity>getById(@PathVariable int id){
		OfficeEntity byId = service.getById(id);
		ResponseEntity<OfficeEntity>responseEntity = new ResponseEntity<>(byId,HttpStatus.OK);
		return responseEntity;
	}
    @PutMapping("/put")
    public ResponseEntity<OfficeEntity> 
    updateById(@RequestBody OfficeEntity officeEntity){
    	OfficeEntity updateOffice = service.updateOffice(officeEntity);  
    	ResponseEntity<OfficeEntity>responseEntity = new ResponseEntity<>(updateOffice,HttpStatus.CREATED);
		return responseEntity;
		
    	
    }
    @PostMapping("/post")
    public ResponseEntity<String> addOfficeStaff(@RequestBody OfficeEntity officeEntity){
    	int i = service.resister(officeEntity);
    	if (i==1) {
			ResponseEntity<String>responseEntity = new ResponseEntity<>("Save Success",HttpStatus.CREATED);
			return responseEntity;
		}else {
			ResponseEntity<String>responseEntity = new ResponseEntity<>("Not Success",HttpStatus.BAD_REQUEST);
			return responseEntity;
		}	
    }
	@DeleteMapping("/delete/{id}")
    public String OfficeDeleteById(@PathVariable int id) {
    	service.deleteEntityById(id);
    	return "Delete Data";
    }
}
