package com.cts.service;

import com.cts.dao.InPatientRecordsDaoImpl;

public class RegistrationRecordsServiceImpl implements RegistrationRecordsService{
	
	public RegistrationRecordsServiceImpl(){
		rdao = new RegistrationRecordsDaoImpl();
	}

}
