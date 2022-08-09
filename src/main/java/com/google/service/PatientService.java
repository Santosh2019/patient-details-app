package com.google.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.bean.Patient;
import com.google.repository.PatientRepository;

@Service
public class PatientService {

	@Autowired
	private PatientRepository patientRepository;
	
	public Patient addPatient(Patient patient) {
		return patientRepository.save(patient);
	}
	
	
}
