package com.algaworks.service;

import javax.enterprise.inject.Default;

@Default
public class MensageiroCorreio implements Mensageiro{

	@Override
	public void enviarMensagem(String mensagem) {
		System.out.println("Enviando a mensagem para o correios: " + mensagem);
	}

}
