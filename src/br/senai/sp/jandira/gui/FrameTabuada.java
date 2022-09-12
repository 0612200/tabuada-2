package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Tabuada;

public class FrameTabuada {
	
	  public String titulo;
	  public int largura;
	  public int altura;
	  public Color corDeFundo;
	  public Font fonteDosLabels;
	  public Color corDoButton;
	  public Font fonteTextField;


	  
	public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura,altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		//conteiner da janela
		Container painel = tela.getContentPane();
		painel.setBackground(corDeFundo);
		
		//Titulo
		JLabel labelTitulo = new JLabel();
		labelTitulo.setText("Tabuada");
		labelTitulo.setBounds(80,1,250,90);
		labelTitulo.setFont(new Font("Bahnschrift", Font.BOLD,20));
		labelTitulo.setForeground( new Color(0,0,255));
		painel.add(labelTitulo);
		
		//sub titulo
		JLabel labelSubtitulo = new JLabel();
		labelSubtitulo.setText("Com essa Tabuada os seus problemas acabaram!");
		labelSubtitulo.setBounds(80,50,600,30);
		labelSubtitulo.setForeground(new Color(64, 0, 128));
		labelSubtitulo.setFont(new Font("Bahnschrift", Font.BOLD,10));
		painel.add(labelSubtitulo);
		
		JLabel labelSub = new JLabel();
		labelSub.setText("Calcule a tabuada que desejar em segundos!!!");
		labelSub.setBounds(80, 60, 600, 30);
		labelSub.setForeground( new Color(64, 0, 128));
		labelSub.setFont( new Font("Bahnschrift", Font.BOLD,10));
		painel.add(labelSub);
		
		//Multiplicando
		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Mulplicando:");
		labelMultiplicando.setBounds(50, 100, 300, 30);
		labelMultiplicando.setFont( new Font("Bahnschrift", Font.BOLD,15));
		painel.add(labelMultiplicando);
		
		JTextField textMultiplicando = new JTextField();
		textMultiplicando.setBounds(200, 100, 150, 30);
		painel.add(textMultiplicando);
		
		
		//MininoMultiplicando
		JLabel miniMultiplicando = new JLabel();
		miniMultiplicando.setText("Minimo Multiplicador:");
		miniMultiplicando.setBounds(30, 150, 600, 40);
		miniMultiplicando.setFont( new Font("Bahnschrift", Font.BOLD,15));
		painel.add(miniMultiplicando);
		
		JTextField textMiniMultiplicando = new JTextField();
		textMiniMultiplicando.setBounds(200, 150, 150, 30);
		painel.add(textMiniMultiplicando);
		
		//MaxMultiplicando
		JLabel maxMultiplicando = new JLabel();
		maxMultiplicando.setText("Maximo Multiplicador:");
		maxMultiplicando.setBounds(30, 200, 150, 40);
		maxMultiplicando.setFont( new Font("Bahnschrift", Font.BOLD,15));
		painel.add(maxMultiplicando);
		
		JTextField textMaxMultiplicando = new JTextField();
		textMaxMultiplicando.setBounds(200, 200, 150, 30);
		painel.add(textMaxMultiplicando);
		
		JList<String> listResultados = new JList<String>();
		JScrollPane scroll = new JScrollPane(listResultados);
		scroll.setBounds(30, 350, 300, 150);
		painel.add(scroll);
		
		//botao
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(25, 280, 150, 30);
		painel.add(buttonCalcular);
		
		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(200, 280, 150, 30);
		painel.add(buttonLimpar);
		
		
		buttonCalcular.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			  Tabuada tabuada = new Tabuada();
			  
			  
			  
			  
			  
			  
			  
			}
		
				
			
		
		});
		
		
			
		
		
		
		
		
		
		
		tela.setVisible(true);
				
		
			}
		}
