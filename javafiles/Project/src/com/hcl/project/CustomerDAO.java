package com.hcl.project;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;



public class CustomerDAO {
	static List<Customer> lstCustomer=null;
	static{
		lstCustomer=new ArrayList<Customer>();	
	}
	public void readCustomerFileDao() {
		try {
			FileInputStream fin=new FileInputStream("c:/files/customer.txt");
			ObjectInputStream objin=new ObjectInputStream(fin);
			lstCustomer =(List<Customer>)objin.readObject();
			objin.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void writeCustomerFileDao() {
		try {
			FileOutputStream fout=new FileOutputStream("c:/files/customer.txt");
			ObjectOutputStream objout=new ObjectOutputStream(fout);
			objout.writeObject(lstCustomer);
			objout.close();
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String addCustomerDao(Customer customer){
		lstCustomer.add(customer);
		return "customer created Successfully....";
	}
	public List<Customer> showCustomerDao(){
		return lstCustomer;
	}
	public  Customer searchCustomerDao(int custId){
		Customer objCustomer=null;
		for (Customer customer : lstCustomer) {
			if(customer.getCustId()==custId){
				objCustomer=customer;
			}
			
		}
		return objCustomer;

}
	public String deleteCustomerDao(int custId){
		String result="";
		Customer customer=searchCustomerDao(custId);
		if(customer!=null){
			lstCustomer.remove(customer);
			result="Customer Record Deleted Successfull.....";
			
		}else{
			result="Customer Record Not Found...";
		}
		return result;
}
	public String updateCustomerDao(Customer objCustomer){
		Customer customer=searchCustomerDao(objCustomer.getCustId());
		String result="";
		if(customer!=null){
			for (Customer s : lstCustomer) {
				if(s.getCustId()==objCustomer.getCustId()){
					s.setCustName(objCustomer.getCustName());
					s.setAnnualPremium(objCustomer.getAnnualPremium());
					s.setModalPremium(objCustomer.getModalPremium());
					
					
					}
			}
		
		result="Customer RECORD IS UPDATED";
	} else
	{
		result="Customer RECORD IS NOTUPDATED";
	}
		return result;
	

}
}
