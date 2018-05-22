package com.validator.validator;

import java.util.Date;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.validator.bean.Product;

public class ProductValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Product.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		Product product  = (Product) target;
		ValidationUtils.rejectIfEmpty(errors, "name", "productName.required");
		ValidationUtils.rejectIfEmpty(errors, "price", "productPrice.required");
		ValidationUtils.rejectIfEmpty(errors, "productionDate", "productionDate.required");
		Float price = product.getPrice();
		if(price!=null&&price<0){
			errors.rejectValue("price", "price.negative");
		}
		Date date = product.getProductionDate();
		if(null!=date){
			if(date.after(new Date())){
				System.out.println("salah  lagi");
				errors.rejectValue("productionDate", "productionDate.invalid");
			}
		}
		
	}

}
