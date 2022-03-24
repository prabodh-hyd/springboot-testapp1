package com.example.demo.repo;


import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Master;

public interface MasterRepository extends CrudRepository<Master, Integer> {

}
