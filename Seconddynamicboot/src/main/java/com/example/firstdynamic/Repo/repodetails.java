package com.example.firstdynamic.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.firstdynamic.Entity.details;

public interface repodetails extends JpaRepository<details, Integer> {

	details findById(int id);
}
