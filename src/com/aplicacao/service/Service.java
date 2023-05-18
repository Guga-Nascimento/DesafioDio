package com.aplicacao.service;

import com.entities.AparelhoTelefonico;
import com.entities.NavegadorInternet;
import com.entities.ReprodutorMusical;

public class Service implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	
	String usuario;

	public void tocar() {
		System.out.println("Tocando");
	}

	public void pausar() {
		System.out.println("Pausando");
	}

	public void selecionarMusica() {
		System.out.println("Selecionando");
	}

	public void ligar() {
		System.out.println("Ligando");
	}

	public void atender() {
		System.out.println("Atendendo");
	}

	public void iniciarCorreioVoz() {
		System.out.println("Iniciando Correio de Voz");
	}

	public void exibirPagina() {
		System.out.println("Exibindo Página");
	}

	public void adicionarNovaAba() {
		System.out.println("Adicionando Nova Aba");
	}

	public void atualizarPagina() {
		System.out.println("Atualizando Página");
	}

}
