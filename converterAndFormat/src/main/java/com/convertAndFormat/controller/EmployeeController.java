package com.convertAndFormat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.convertAndFormat.bean.Employee;

@Controller
public class EmployeeController {

	@RequestMapping("employee_input")
	public String employeeInput(Model model){
		model.addAttribute("employee", new Employee());
		return "employeeInput";
	}
	@RequestMapping("employee_save")
	public String employeeSave(@ModelAttribute Employee employee,BindingResult bindingResult,Model model){
		if(bindingResult.hasErrors()){
			FieldError error  =  bindingResult.getFieldError();
			System.out.println(error.getCode()+"      "+error.getField());
			return "employeeInput";
		}
		model.addAttribute("employee", employee);
		return "employeeSave";
	}
}
