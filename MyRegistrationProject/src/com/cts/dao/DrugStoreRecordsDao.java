package com.cts.dao;

import java.sql.SQLException;

import com.cts.bean.DrugStore;

public interface DrugStoreRecordsDao {
	public boolean addRecords(DrugStore ds);
	public DrugStore displayDrug(String drugname) throws SQLException ;
}
