package com.example.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Deals;

@Repository
public interface DealsRepo extends CrudRepository<Deals, Long>{

}
