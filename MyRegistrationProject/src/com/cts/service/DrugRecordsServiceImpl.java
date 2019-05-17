package com.cts.service;

import java.sql.SQLException;

import com.cts.bean.DrugStore;
import com.cts.dao.DrugRecordsDaoImpl;
import com.cts.dao.DrugStoreRecordsDao;

public class DrugRecordsServiceImpl implements DrugStoreRecordsService {

	
	DrugStoreRecordsDao drugdao;
	
	public DrugRecordsServiceImpl()
	{
		drugdao=new DrugRecordsDaoImpl();	
	}
	@Override
	public boolean addRecords(DrugStore ds)
	{
		if(drugdao.addRecords(ds))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	@Override
	public DrugStore displayDrug(String drugname) throws SQLException 
	{
			DrugStore d=drugdao.displayDrug(drugname);
			return d;
		
	}

}
