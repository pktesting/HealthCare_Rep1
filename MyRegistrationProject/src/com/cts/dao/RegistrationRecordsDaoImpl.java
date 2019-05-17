package com.cts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cts.bean.Registration;

public class RegistrationRecordsDaoImpl implements RegistrationRecordsDao {

	Connection con;
	PreparedStatement s;

	public RegistrationRecordsDaoImpl() {
		con = DBUtil.getConnection();
		s = null;
	}

	@Override
	public boolean addRecords(Registration r) {
		int result = 0;
		try {

			s = con.prepareStatement("insert into TBL_REGISTRATION values(?,?,?,?,?,?,?,?,?)");
			s.setString(1, r.getName());
			s.setLong(2, r.getAge());
			s.setString(3, r.getSex());
			s.setString(4, r.getPhone());
			s.setString(5, r.getAddress());
			s.setString(6, r.getDept());
			s.setString(7, r.getPatient());
			s.setString(8, r.getPass());

			result = s.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (result == 0)
			return false;
		else
			return true;
	}
}
