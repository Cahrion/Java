package com.springdemo;

public class CustomerManager implements ICustomerService{

	private ICustomerDal customerDal;
		public CustomerManager(ICustomerDal customerDal) {
			this.customerDal = (customerDal);
		}
	public void add() {
		// I� Kurallar�
		 customerDal.add();
	}
	
}
