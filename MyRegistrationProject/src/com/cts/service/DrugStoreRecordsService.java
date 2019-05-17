package com.cts.service;

import java.sql.SQLException;

import com.cts.bean.DrugStore;

public interface DrugStoreRecordsService {
	public boolean addRecords(DrugStore ds);
	public DrugStore displayDrug(String drugname) throws SQLException;
}
