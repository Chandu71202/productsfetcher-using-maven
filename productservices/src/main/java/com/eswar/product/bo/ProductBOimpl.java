package com.eswar.product.bo;

import com.eswar.product.dao.ProductDAO;
import com.eswar.product.dao.ProductDAOimpl;
import com.eswar.product.dto.Product;

public class ProductBOimpl implements ProductBO {
	
	private static ProductDAO dao = new ProductDAOimpl();
	

	@Override
	public void create(Product product) {
		dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
