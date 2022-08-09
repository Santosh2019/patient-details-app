package com.google.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.google.bean.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer>{

}
