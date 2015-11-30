package com.algaworks.service;


import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class CalculadoraPreco {
	
	
	

	@PostConstruct
	public void init(){
		System.out.println("Init CalculadorPreco");
	}
	
	public double calcularPreco(int quantidade, double precoUnitario) {
		 return quantidade * precoUnitario;
	}
}
