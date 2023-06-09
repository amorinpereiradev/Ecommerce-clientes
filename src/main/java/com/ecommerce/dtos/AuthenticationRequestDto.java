package com.ecommerce.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class AuthenticationRequestDto {

	@Email(message = "email é Obrigatorio")
	@NotBlank(message = "campo Obrigatorio")
	private String email;
	
	@Size(min = 8, max = 20, message = "Senha do cliente é obrigatória")
	@NotBlank(message = "Senha do cliente é obrigatória")
	private String senha;
	
}
