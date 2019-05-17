package com.cts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.xml.ws.Response;

import com.cts.bean.DrugStore;

public class DrugRecordsDaoImpl implements DrugStoreRecordsDao{
    
	
   DrugStore dr=new DrugStore();
	Connection con;
	PreparedStatement ps;
	
	public DrugRecordsDaoImpl()
	{
		con = DBUtil.getConnection();
		ps = null;
	}
	@Override
	public boolean addRecords(DrugStore ds)
	{
		Date date = Calendar.getInstance().getTime();
		SimpleDateFormat df=new SimpleDateFormat("dd-MM-yyyy");
				
		df.setLenient(false);
      int result = 0;
		
		try {
			
			ps = con.prepareStatement("insert into table_Mainstore values(?,?,?,?)");
			
			 String drug_name=ds.getDrugname();
			 int in_stock=ds.getIn_stock();
			 String ex_date1= df.format(ds.getExp_date1());
			 String ex_date2= df.format(ds.getExp_date2());
			 
			 ps.setString(1, drug_name);
			 ps.setInt(2, in_stock);
			 ps.setString(3,  ex_date1);
			 ps.setString(4,  ex_date2);
			
			 result = ps.executeUpdate();			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(result == 0)
			return false;
		else
			return true;
	}
	
	@Override
	public DrugStore displayDrug(String drugname) throws SQLException
	{
		  
		try {
			
			ps=con.prepareStatement("select *from table_Mainstore where drug_name=?");
			ps.setString(1, drugname);
			ResultSet res=ps.executeQuery();
			while(res.next())
			{
				String dname=res.getString("drug_name");
				int stock=res.getInt("in_stock");
				Date exd1=res.getDate("ex_date1");
				Date exd2=res.getDate("ex_date2");
				
			   dr.setDrugname(dname);
			   dr.setIn_stock(stock);
			   dr.setExp_date1(exd1);
			   dr.setExp_date2(exd2);
				
			}
			
			
			
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		return dr;
	}
	
	}


