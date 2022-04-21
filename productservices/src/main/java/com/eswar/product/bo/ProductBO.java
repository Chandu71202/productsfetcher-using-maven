package com.eswar.product.bo;

import com.eswar.product.dto.Product;

public interface ProductBO {
	void create(Product product);
	Product findProduct(int id);

}
