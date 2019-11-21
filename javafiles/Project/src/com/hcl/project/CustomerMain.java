package com.hcl.project;

import java.util.List;
import java.util.Scanner;

public class CustomerMain {
	public static void main(String[] args) {
		int choice;
		Scanner sc=new Scanner(System.in);
		do{
			System.out.println("option");
			System.out.println("-----------");
			System.out.println("1. Add Customer");
			System.out.println("2. Show Customer");
			System.out.println("3. Search Customer");
			System.out.println("4.  Update Customer");
			System.out.println("5.  Delete Customer");
			System.out.println("6.  Write Customer");
			System.out.println("7.  Read Customer");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice){
			case 1  :
				addCustomer();
				break;
			case 2  :
				showCustomer();
				break;
			case 3  :
				searchCustomer();
				break;
			case 4  :
				updateCustomer();
				break;
			case 5  :
				deleteCustomer();
				break;
			case 6 : 
				writeCustomerFile();
				break;
			case 7 : 
				readCustomerFile();
				break;	
			case 8 :
				return;
				default:
					System.out.println("INVALID CHOICE");
			}
		}while(choice!=8);
			
		}
	public static void writeCustomerFile() {
		new CustomerBAL().writeCustomerFileBal();
	}
	
	public static void readCustomerFile() {
		new CustomerBAL().readCustomerFileBal();
	}
	public static void updateCustomer(){
		Customer objCustomer=new Customer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter customerId");
		objCustomer.setCustId(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Customer Name");
        objCustomer.setCustName(sc.nextLine());
        System.out.println("Enter Customer annualPremium ");
        objCustomer.setAnnualPremium(Double.parseDouble(sc.nextLine()));
        System.out.println("Enter Customer modalPremium");
        objCustomer.setModalPremium(Double.parseDouble(sc.nextLine()));
        System.out.println("Enter customer Paymentmode");
		objCustomer.setPaymentMode(Integer.parseInt(sc.nextLine()));
        CustomerBAL obj=new CustomerBAL();
        System.out.println(obj.updateCustomerBal(objCustomer));	
	}
	public static void deleteCustomer(){
		int custId;
		System.out.println("Enter customer Id");
		Scanner sc=new Scanner(System.in);
		custId=sc.nextInt();
		CustomerBAL obj=new CustomerBAL();
		System.out.println(obj.deleteCustomerBal(custId));
	}
	public static void searchCustomer(){
		int custId;
		System.out.println("Enter  customer Id ");
		Scanner sc=new Scanner(System.in);
		custId=sc.nextInt();
		CustomerBAL obj=new CustomerBAL();
		Customer customer=obj.searchCustomerBal(custId);
		if(customer==null){
			System.out.println("Customer record not found....");
		}
		else{
			System.out.println(customer);
		}
	}
	public static void showCustomer(){
		CustomerBAL obj=new CustomerBAL();
		List<Customer> customers=obj.ShowCustomerBal();
		for (Customer customer : customers) {
			System.out.println(customer);
			
		}
	}
	public static void addCustomer(){
		Customer objCustomer=new Customer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Id");
		objCustomer.setCustId(Integer.parseInt(sc.nextLine()));
         System.out.println("Enter Customer Name");
         objCustomer.setCustName(sc.nextLine());
         System.out.println("Enter Customer annualPremium  ");
         objCustomer.setAnnualPremium(Double.parseDouble(sc.nextLine()));
         System.out.println("Enter modalPremium");
         objCustomer.setModalPremium(Double.parseDouble(sc.nextLine()));
         System.out.println("Enter Customer Paymentmode");
         objCustomer.setPaymentMode(Integer.parseInt(sc.nextLine()));
         CustomerBAL obj=new CustomerBAL();
         try {
			boolean res=obj.addCustomerBal(objCustomer);
			if(res==true){
				System.out.println("Customer added Successfully");
			}
		} catch (CustomerException e) {
			System.out.println(e.getMessage());
	}

}
}