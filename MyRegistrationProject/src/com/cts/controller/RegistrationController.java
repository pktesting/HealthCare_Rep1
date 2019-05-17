package com.cts.controller;

//import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.bean.Registration;
import com.cts.service.CoustomerService;
import com.cts.service.InPatientRecordsServiceImpl;
import com.cts.service.RegistrationRecordsService;
import com.cts.service.RegistrationRecordsServiceImpl;

@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RegistrationRecordsService rrs;
    /**
     * @see HttpServlet#HttpServlet()
     */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		rrs = new RegistrationRecordsServiceImpl();
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException{
		Registration registration=new Registration();
		registration.setName(request.getParameter("name"));
		System.out.println(registration.getName());
		
		registration.setAge(Integer.valueOf(request.getParameter("age")));
		System.out.println(registration.getAge());
		
		registration.setSex(request.getParameter("sex"));
		System.out.println(registration.getSex());
		
		registration.setPhone(request.getParameter("number"));
		System.out.println(registration.getPhone());
		
		registration.setAddress(request.getParameter("address"));
		System.out.println(registration.getAddress());
		
		registration.setDept(request.getParameter("dept"));
		System.out.println(registration.getDept());
		
		registration.setPatient(request.getParameter("patient"));
		System.out.println(registration.getPatient());
		
		registration.setPass(request.getParameter("pass"));
		System.out.println(registration.getPass());
		
		System.out.println();
		
	}
	
	public void destroy(){
		
	}
	
	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String source=request.getParameter("source");
//		CoustomerService service=new CoustomerService();
//		if(source.equals("addCustomer")){
//			try{
//				String name=request.getParameter("name");
//				int age=Integer.valueOf(request.getParameter("age"));
//				String sex=request.getParameter("sex");
//				String email=request.getParameter("email");
//				int phone=Integer.valueOf(request.getParameter("number"));
//				String address=request.getParameter("address");
//				String dept=request.getParameter("dept");
//				String patient=request.getParameter("patient");
//				if(patient.equals(1)){
//					String beneficiarieName=request.getParameter("beneficiarieName");
//					String beneficiarieRelation=request.getParameter("beneficiarieRelation");
//				}
//				String password=request.getParameter("pass");
//				String repassword=request.getParameter("retype");
//				Object beneficiarieName=null;
//				Object beneficiarieRelation = null;
//				Registration registration=new Registration(name,age,sex,email,phone,address,dept,patient,beneficiarieName,beneficiarieRelation,password,repassword);
//				if(service.addCustomer(registration)) request.setAttribute("errorMsg", "Customer Added Successfully");
//				else request.setAttribute("errorMsg", "Invalid Input");
//			}catch(Exception ex) {
//				request.setAttribute("errorMsg", "Invalid Input");
//			}
//			request.getRequestDispatcher("register.jsp").forward(request, response);
//		}
//	}

}
