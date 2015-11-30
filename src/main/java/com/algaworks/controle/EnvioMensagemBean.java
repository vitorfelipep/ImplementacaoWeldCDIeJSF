package com.algaworks.controle;

import javax.enterprise.context.RequestScoped;

import javax.inject.Inject;
import javax.inject.Named;

import com.algaworks.service.Mensageiro;
import com.algaworks.service.Urgente;

@Named
@RequestScoped
public class EnvioMensagemBean {
	
	@Inject @Urgente //@Default
	private Mensageiro mensageiro;
	
	private String texto;
	
	public void enviarMensagem(){
		mensageiro.enviarMensagem(texto);
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
}
