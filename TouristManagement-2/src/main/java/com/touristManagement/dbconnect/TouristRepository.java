package com.touristManagement.dbconnect;

import org.springframework.data.jpa.repository.JpaRepository;

import com.touristManagementSystem.model.TouristMaster;

public interface TouristRepository extends JpaRepository<TouristMaster, Integer>{

}
