package com.cts.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.bean.DrugStore;
import com.cts.service.DrugRecordsServiceImpl;
import com.cts.service.DrugStoreRecordsService;

@WebServlet("/DrugStoreDidplayController")
public class DrugStoreDisplayController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   

	DrugStoreRecordsService drugservice;
   
	
	public void init(ServletConfig config) throws ServletException {
		drugservice=new DrugRecordsServiceImpl();  
	}

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String drugname=request.getParameter("dname");	
		Date date = (Date) Calendar.getInstance().getTime();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			DrugStore d =drugservice.displayDrug(drugname);
			PrintWriter pw=response.getWriter();
			pw.write(d.getDrugname());
			pw.write(d.getIn_stock());
			String d1=sdf.format(d.getExp_date1());
			pw.write(d1);
			String d2=sdf.format(d.getExp_date2());
			pw.write(d2);
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
