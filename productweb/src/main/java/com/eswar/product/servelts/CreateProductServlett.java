package com.eswar.product.servelts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eswar.product.bo.ProductBO;
import com.eswar.product.bo.ProductBOimpl;
import com.eswar.product.dto.Product;

public class CreateProductServlett extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Integer id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		Integer price = Integer.parseInt(request.getParameter("price"));

		Product product = new Product();
		product.setId(id);
		product.setName(name);
		product.setDescription(description);
		product.setPrice(price);

		ProductBO bo = new ProductBOimpl();
		bo.create(product);

		PrintWriter out = response.getWriter();
		out.print("Product Created!!");
	}

}
