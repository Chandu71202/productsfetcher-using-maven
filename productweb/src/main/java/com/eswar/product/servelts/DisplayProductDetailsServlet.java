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

public class DisplayProductDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ProductBO bo = new ProductBOimpl();
		Product product = bo.findProduct(Integer.parseInt(request.getParameter("id")));

		PrintWriter out = response.getWriter();
		out.println("Product Details");
		out.println("Product ID : " + product.getId());
		out.println("Product Name : " + product.getName());
		out.println("Product Description : " + product.getDescription());
		out.println("Product Price : " + product.getPrice());
	}

}
