package application;

import java.util.Date;

import db.DB;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Department obj= new Department(1,"Books");
		//Seller seller = new Seller(1, "Bob","bob@gmail.com",new Date(),3000.0, obj);
		System.out.println("==== teste find by id =======");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		SellerDao sellerDaoJDBC = new SellerDaoJDBC(DB.getConnection());
		
		System.out.println(sellerDaoJDBC.findById(3));
	}

}
