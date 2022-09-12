package br.senai.sp.jandira;

import java.awt.Color;
import java.awt.Font;

import br.senai.sp.jandira.gui.FrameTabuada;
import br.senai.sp.jandira.model.Tabuada;

public class AppTabuada {

	public static void main(String[] args) {
		
		FrameTabuada tela = new FrameTabuada();
		tela.titulo = "Tabuada";
		tela.largura = 405;
		tela.altura = 555;
		tela.corDeFundo = new Color(250,250,250);
		tela.fonteDosLabels = new Font("BankGothic Md BT" , Font.BOLD, 14);
		tela.corDoButton = new Color(0, 0 , 255);
		
		tela.criarTela();
	}

	{

	}
}