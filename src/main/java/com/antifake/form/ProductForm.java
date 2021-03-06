package com.antifake.form;

import javax.validation.constraints.NotEmpty;

import org.springframework.web.bind.annotation.RequestParam;

import lombok.Data;


@Data
public class ProductForm {

	//@NotBlank(message="公司id不能为空")
		private Integer companyId;
		
		
		@NotEmpty(message="编号不能为空")
		private String template;
		
		
		private String productTitle;
	
	
	
}
