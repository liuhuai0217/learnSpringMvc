package app02a.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import app02a.form.ProductForm;

public class SaveProductController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		// TODO Auto-generated method stub
		ProductForm p = new ProductForm();
		p.setName(req.getParameter("name"));
		p.setPrice(req.getParameter("price"));
		p.setDescription(req.getParameter("description"));
		return new ModelAndView("ProductDetail","product",p);
	}

}
