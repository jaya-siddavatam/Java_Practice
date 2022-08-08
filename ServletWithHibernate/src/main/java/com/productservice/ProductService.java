package com.productservice;


import com.bean.Products;
import com.dao.ProductsDao;

public class ProductService {

	ProductsDao pd = new ProductsDao();
	
	public String storeProduct(Products product) {
		if(product.getPrice()<100) {
			return "Product price must be > 100";
		}else if(pd.storeProduct(product)>0) {
			return "Product stored successfully";
		}else {
			return "Product didn't store id must be unique";
		}
	}
	
	public String deleteProduct(int pid) {
		if(pd.deleteProduct(pid)>0) {
			return "Product details deleted successfully";
		}else {
			return "Product not present";
		}
	}
	
	public String updateProduct(Products product) {			// 1, 1000
		Products pp = pd.findProduct(product.getPid());		// 1,PenDrive, 1500		in this method we are calling 
															// two dao method with condition. 	
		if(pp==null) {
			return "Product not present";
		}else if(product.getPrice()<pp.getPrice()) {
			return "New price must be > than old price";
		}else if(pd.updateProduct(product)>0) {
			return "Product details updated successfully";
		}else {
			return "Product didn't update";
		}
	}
	
	public String findProduct(int pid) {
		Products pp = pd.findProduct(pid);
		if(pp==null) {
			return "Product not present";
		}else {
			return pp.toString();			// return the object in string format. 
		}
	}
}
