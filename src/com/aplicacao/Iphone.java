package com.aplicacao;

import com.aplicacao.service.Service;

public class Iphone extends Service{
	public static void main(String[] args) {	
	Service guga = new Service();
	//Navegador Internet
	guga.adicionarNovaAba();
	guga.atualizarPagina();
	guga.exibirPagina();
	System.out.println();
	//Aparelho Telefonico
	guga.iniciarCorreioVoz();
	guga.ligar();	
	guga.atender();
	System.out.println();
	//Reprodutor Musical
	guga.tocar();
	guga.pausar();
	guga.selecionarMusica();
	}
	 
}
