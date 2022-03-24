package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Master;

import com.example.demo.service.Masterservice;

@RestController

	public class Restcontroller {
	    @Autowired
	    Masterservice masterservice ; 
	  
	  @GetMapping("/master")  
	  private List<Master> getAllMaster()   
	  {  
	  return masterservice.getAllMaster();  
	  }  
	  
	  @GetMapping("/master/{id}")  
	  private Master getMaster(@PathVariable("id") int id)   
	  {  
	  return masterservice.getmasterById(id);  
	  }  
	  
	  @DeleteMapping("/master/{id}")  
	  private void deleteMaster(@PathVariable("id") int id)   
	  {  
	  masterservice.delete(id);  
	  }  
	  
	  @PostMapping("/master")  
	  private int saveMaster(@RequestBody Master master)   
	  {  
	  masterservice.saveOrUpdate(master);  
	  return  master.getId();  
	  }  
	    
	  @PutMapping("/master")  
	  private Master update(@RequestBody Master master)   
	  {  
	  masterservice.saveOrUpdate(master);  
	  return master;  
	  }  



}
