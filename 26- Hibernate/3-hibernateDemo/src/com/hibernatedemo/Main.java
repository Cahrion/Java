package com.hibernatedemo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(City.class)
				.buildSessionFactory();
		
		//Unit of Work
		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();
			// HQL --> Hibernate Query Language
			// from City c where c.countryCOde='TUR' AND c.district='Ankara'
			// from City c where c.name LIKE '%kar%'
			// from City c ORDER BY c.name DESC
			// select c.countryCode from City c GROUP BY c.countryCode
			
			/*	// INSERT 
				City city = new City();
				city.setName("Kirklareli");
				city.setCountryCode("TUR");
				city.setDistrict("Marmara");
				city.setPopulation(150000);
				session.save(city);
				System.out.println("�ehir eklendi.");
			*/ 
			/*	// UPDATE
				City city 	= session.get(City.class, 4080);
				city.setPopulation(110000); // G�ncelleme i�lemi yapt�k.
				
				session.save(city);
				System.out.println("�ehir G�ncellendi.");
			*/
			/* DELETE */
			City city = session.get(City.class, 4080);
			session.delete(city);
			
			session.getTransaction().commit();
			System.out.println("�ehir Silindi.");
		}finally {
			factory.close();
		}
	}
}
