package com.google.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.bean.Patient;
import com.google.service.PatientService;

@RestController
public class PatientController {
	
	
	@Autowired
	private PatientService patientService;
	
	
	@PostMapping("/add")
	public Patient creatPatient(@RequestBody Patient patient) {
		
		return patientService.addPatient(patient);
	}
	
	
	

}
