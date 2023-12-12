package Application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("test 01 : Seller findById");
		Seller seller = sellerDao.findById(3);

		System.out.println("\n test 02 : Seller findByDepartment");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		for(Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println(seller);
	}

}
