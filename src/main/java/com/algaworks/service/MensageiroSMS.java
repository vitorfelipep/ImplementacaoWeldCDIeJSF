package com.algaworks.service;

@Urgente
public class MensageiroSMS implements Mensageiro{

	@Override
	public void enviarMensagem(String mensagem) {
		System.out.println("Enviando mensagem para o celular: " + mensagem);
	}

}
