package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Master;
import com.example.demo.repo.MasterRepository;

@Service
public class Masterservice {
	@Autowired  
	MasterRepository masterRepository;  
	
	public List<Master> getAllMaster()   
	{  
	List<Master> master = new ArrayList<Master>();  
	masterRepository.findAll().forEach(Master1 -> master.add(Master1));  
	return master;  
	}  
	public Master getmasterById(int id)   
	{  
	return masterRepository.findById(id).get();  
	}  
	public void saveOrUpdate(Master master)   
	{  
	masterRepository.save(master);  
	}  
	
	public void delete(int id)   
	{  
	masterRepository.deleteById(id);  
	}  
	 
	public void update(Master master, int bookid)   
	{  
	masterRepository.save(master);  
	} 

}
