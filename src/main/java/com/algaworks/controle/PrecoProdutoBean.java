package com.algaworks.controle;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.algaworks.service.CalculadoraPreco;

@Named("meuBean")
@SessionScoped
public class PrecoProdutoBean implements Serializable{
	

	private static final long serialVersionUID = 1L;
	
	@Inject
	private CalculadoraPreco calculadora;
	
	@PostConstruct
	public void init(){
		System.out.println("Init precoProdutoBean");
	}
	
	public double getPreco(){
		return calculadora.calcularPreco(12, 34.55);
	}
}
