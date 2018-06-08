package com.antifake.form;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class UserLoginForm {
	
	@NotEmpty(message="用户名不能为空")
	private String username;
	
	@NotEmpty(message="密码不能为空")
	private String password;
	
}
