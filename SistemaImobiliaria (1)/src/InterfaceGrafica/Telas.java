package InterfaceGrafica;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import Entidades.Corretor;
import Entidades.Gerente;
import Entidades.Pessoa;
import Interface.Limpavel;

import java.awt.Insets;
import java.awt.Frame;
import java.awt.Dimension;
import javax.swing.ImageIcon;

public class Telas extends JFrame {

	private static final long serialVersionUID = 159L;
	private JPanel contentPane;	
	private static Pessoa user;
	private JButton bVoltar5;
	private JButton logo5;
	private Login login;
	public Telas() {
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setSize(new Dimension(3272, 3272));
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setMinimumSize(new Dimension(32767, 32767));
		contentPane.setAutoscrolls(true);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		//Adicionamos  o login ao card
		CardLayout aux = (CardLayout) (contentPane.getLayout());
		login=new Login(aux,contentPane,this);
		contentPane.add(login, "login");
		aux.show(contentPane, "login");
		
		//Home do corretor
		Panel home = new Panel();
		home.setName("home");
		home.setPreferredSize(new Dimension(32767, 32767));
		home.setBackground(new Color(255, 255, 224));
		contentPane.add(home, "home");
		home.setLayout(null);
		
		JButton logo = new JButton("");
		logo.setPreferredSize(new Dimension(2, 2));
		logo.setMinimumSize(new Dimension(0, 0));
		logo.setMargin(new Insets(0, 0, 0, 0));
		logo.setIgnoreRepaint(true);
		logo.setInheritsPopupMenu(true);
		logo.setIconTextGap(0);
		logo.setHideActionText(true);
		logo.setBorder(null);
		logo.setBackground(new Color(240, 240, 240));
		logo.setBounds(159, 9, 89, 72);
		/*ImageIcon aux=new ImageIcon(Telas.class.getResource("/Entidades/logotipo-dourado-linear-da-casa-81770978.gif"));
		Image image=aux.getImage();
		Image newimg = image.getScaledInstance(230, 310, java.awt.Image.SCALE_SMOOTH);*/
		logo.setIcon(new ImageIcon(Telas.class.getResource("/InterfaceGrafica/logotipo-da-casa-limpa-para-empresa-imobiliaria_1017-6878.gif")));
		logo.addActionListener( new TrocaPainel ("home"));
		home.add(logo);
		
		JButton botao_adicionar = new JButton("Adicionar");
		botao_adicionar.setBounds(139, 84, 132, 27);
		botao_adicionar.setBackground(Color.WHITE);
		botao_adicionar.setFont(new Font("Cambria", Font.BOLD, 15));
		botao_adicionar.addActionListener( new TrocaPainel ("adicionar"));
		home.add(botao_adicionar);
		
		JButton botao_buscar = new JButton("Buscar");
		botao_buscar.setBackground(Color.WHITE);
		botao_buscar.setBounds(139, 122, 132, 27);
		botao_buscar.setFont(new Font("Cambria", Font.BOLD, 15));
		botao_buscar.addActionListener( new TrocaPainel ("buscar"));
		home.add(botao_buscar);
		
		JButton btnLogOut = new JButton("Log out");
		btnLogOut.addActionListener(new TrocaPainelLimpavel("login",(Limpavel)login));
		btnLogOut.setBounds(10, 217, 89, 23);
		home.add(btnLogOut);
		
		
	
		//Home gerente
		Panel home2 = new Panel();
		home2.setName("home2");
		home2.setPreferredSize(new Dimension(32767, 32767));
		home2.setBackground(new Color(255, 255, 224));
		contentPane.add(home2, "home2");
		home2.setLayout(null);
		
		JButton logo6 = new JButton("");
		logo6.setPreferredSize(new Dimension(2, 2));
		logo6.setMinimumSize(new Dimension(0, 0));
		logo6.setMargin(new Insets(0, 0, 0, 0));
		logo6.setIgnoreRepaint(true);
		logo6.setInheritsPopupMenu(true);
		logo6.setIconTextGap(0);
		logo6.setHideActionText(true);
		logo6.setBorder(null);
		logo6.setBackground(new Color(240, 240, 240));
		logo6.setBounds(161, 8, 89, 72);
		/*ImageIcon aux=new ImageIcon(Telas.class.getResource("/Entidades/logotipo-dourado-linear-da-casa-81770978.gif"));
		Image image=aux.getImage();
		Image newimg = image.getScaledInstance(230, 310, java.awt.Image.SCALE_SMOOTH);*/
		logo6.setIcon(new ImageIcon(Telas.class.getResource("/InterfaceGrafica/logotipo-da-casa-limpa-para-empresa-imobiliaria_1017-6878.gif")));
		logo6.addActionListener( new TrocaPainel ("home2"));
		home2.add(logo6);
		
		JButton botao_adicionar6 = new JButton("Adicionar");
		botao_adicionar6.setBounds(139, 84, 132, 27);
		botao_adicionar6.setBackground(Color.WHITE);
		botao_adicionar6.setFont(new Font("Cambria", Font.BOLD, 15));
		botao_adicionar6.addActionListener( new TrocaPainel ("adicionar2"));
		home2.add(botao_adicionar6);
		
		JButton botao_buscar6 = new JButton("Buscar");
		botao_buscar6.setBackground(Color.WHITE);
		botao_buscar6.setBounds(139, 122, 132, 27);
		botao_buscar6.setFont(new Font("Cambria", Font.BOLD, 15));
		botao_buscar6.addActionListener( new TrocaPainel ("buscar2"));
		home2.add(botao_buscar6);
		
		JButton btnLogOut_1 = new JButton("Log out");
		btnLogOut_1.addActionListener(new TrocaPainelLimpavel("login",(Limpavel)login));
		btnLogOut_1.setBounds(10, 217, 89, 23);
		home2.add(btnLogOut_1);
			
		
		
		//Adicionamos  os forms ao card
		FormCliente formCliente = new FormCliente(aux,contentPane);
		contentPane.add(formCliente,"formCliente");
		
		FormCorretor formCorretor = new FormCorretor(aux,contentPane);
		contentPane.add(formCorretor,"formCorretor");
		
		FormImovel formImovel = new FormImovel(aux,contentPane);
		contentPane.add(formImovel,"formImovel");
		
		FormProprietario formProprietario = new FormProprietario(aux,contentPane);
		contentPane.add(formProprietario,"formProprietario");
		
		FormProposta formProposta = new FormProposta(aux,contentPane);
		contentPane.add(formProposta,"formProposta");
		
		TabelaCliente tabelaCliente = new TabelaCliente(aux,contentPane);
		contentPane.add(tabelaCliente,"tabelaCliente");
		
		TabelaImovel tabelaImovel= new TabelaImovel(aux,contentPane);
		contentPane.add(tabelaImovel,"tabelaImovel");
		
		TabelaProprietario tabelaProprietario= new TabelaProprietario(aux,contentPane);
		contentPane.add(tabelaProprietario,"tabelaProprietario");
	
		TabelaProposta tabelaProposta = new TabelaProposta(aux,contentPane);
		contentPane.add(tabelaProposta,"tabelaProposta");
		
		//corretor
		FormCorretorAtualizar formCorretorAtualizar = new FormCorretorAtualizar(aux,contentPane);
		contentPane.add(formCorretorAtualizar,"formCorretorAtualizar");
		
		TabelaCorretor tabelaCorretor = new TabelaCorretor(aux,contentPane,formCorretorAtualizar);
		contentPane.add(tabelaCorretor,"tabelaCorretor");
		
		FormCorretorBuscar formCorretorBuscar = new FormCorretorBuscar(aux,contentPane,tabelaCorretor);
		contentPane.add(formCorretorBuscar,"formCorretorBuscar");
		
		
		//Painel adicionar corretor
		Panel adicionar = new Panel();
		adicionar.setBackground(new Color(255, 255, 204));
		contentPane.add(adicionar, "adicionar");
		adicionar.setLayout(null);
		
		JButton logo1 = new JButton("");
		logo1.setFocusPainted(false);
		logo1.setFocusTraversalKeysEnabled(false);
		logo1.setVisible(true);
		logo1.setPreferredSize(new Dimension(2, 2));
		logo1.setMinimumSize(new Dimension(0, 0));
		logo1.setMargin(new Insets(0, 0, 0, 0));
		logo1.setIgnoreRepaint(true);
		logo1.setInheritsPopupMenu(true);
		logo1.setIconTextGap(0);
		logo1.setHideActionText(true);
		logo1.setBorder(null);
		logo1.setBackground(new Color(240, 240, 240));
		/*ImageIcon aux=new ImageIcon(Telas.class.getResource("/Entidades/logotipo-dourado-linear-da-casa-81770978.gif"));
		Image image=aux.getImage();
		Image newimg = image.getScaledInstance(230, 310, java.awt.Image.SCALE_SMOOTH);*/
		logo1.setIcon(new ImageIcon(Telas.class.getResource("/InterfaceGrafica/logotipo-da-casa-limpa-para-empresa-imobiliaria_1017-6878.gif")));
		logo1.setBounds(144, 11, 89, 84);
		logo1.addActionListener( new TrocaPainel ("home"));
		adicionar.add(logo1);
		
		JButton botaoImovel = new JButton("Imovel");
		botaoImovel.setFont(new Font("Cambria", Font.BOLD, 15));
		botaoImovel.setBackground(Color.WHITE);
		botaoImovel.setBounds(119, 106, 144, 23);
		botaoImovel.addActionListener(new TrocaPainelLimpavel("formImovel",(Limpavel)formImovel));
		adicionar.add(botaoImovel);
		
		JButton botaoCliente = new JButton("Cliente");
		botaoCliente.setFont(new Font("Cambria", Font.BOLD, 15));
		botaoCliente.setBackground(Color.WHITE);
		botaoCliente.setBounds(119, 132, 144, 23);
		botaoCliente.addActionListener(new TrocaPainelLimpavel("formCliente",(Limpavel)formCliente));
		adicionar.add(botaoCliente);
		
		JButton botaoProprietario1 = new JButton("Proprietario");
		botaoProprietario1.setBackground(Color.WHITE);
		botaoProprietario1.setFont(new Font("Cambria", botaoProprietario1.getFont().getStyle() | Font.BOLD, botaoProprietario1.getFont().getSize() + 4));
		botaoProprietario1.addActionListener(new TrocaPainelLimpavel("formProprietario",(Limpavel)formProprietario));
		botaoProprietario1.setBounds(119, 160, 144, 23);
		adicionar.add(botaoProprietario1);
		
		JButton botaoProposta1 = new JButton("Proposta");
		botaoProposta1.setFont(new Font("Cambria", Font.BOLD, 15));
		botaoProposta1.setBackground(Color.WHITE);
		botaoProposta1.addActionListener(new TrocaPainelLimpavel("formProposta", (Limpavel)formProposta));
		botaoProposta1.setBounds(119, 187, 144, 23);
		adicionar.add(botaoProposta1);
		
		JButton botao_voltar = new JButton("Voltar");
		botao_voltar.setFont(new Font("Cambria", Font.BOLD, 15));
		botao_voltar.setBackground(Color.WHITE);
		botao_voltar.setBounds(144, 217, 89, 23);
		botao_voltar.addActionListener( new TrocaPainel ("home"));
		adicionar.add(botao_voltar);
		
		
		
		// Painel buscar do corretor
		JPanel Buscar = new JPanel();
		Buscar.setBackground(new Color(255, 255, 204));
		contentPane.add(Buscar, "buscar");
		Buscar.setLayout(null);
		
		JButton logo4 = new JButton("");
		logo4.setPreferredSize(new Dimension(2, 2));
		logo4.setMinimumSize(new Dimension(0, 0));
		logo4.setMargin(new Insets(0, 0, 0, 0));
		logo4.setIgnoreRepaint(true);
		logo4.setInheritsPopupMenu(true);
		logo4.setIconTextGap(0);
		logo4.setHideActionText(true);
		logo4.setBorder(null);
		logo4.setBackground(new Color(255, 255, 204));
		/*ImageIcon aux=new ImageIcon(Telas.class.getResource("/Entidades/logotipo-dourado-linear-da-casa-81770978.gif"));
		Image image=aux.getImage();
		Image newimg = image.getScaledInstance(230, 310, java.awt.Image.SCALE_SMOOTH);*/
		logo4.setIcon(new ImageIcon(Telas.class.getResource("/InterfaceGrafica/logotipo-da-casa-limpa-para-empresa-imobiliaria_1017-6878.gif")));
		logo4.setBounds(143, 7, 97, 65);
		logo4.addActionListener( new TrocaPainel ("home"));
		Buscar.add(logo4);
		
		JButton BImov4 = new JButton("Imovel");
		BImov4.setFont(new Font("Cambria", Font.BOLD, 15));
		BImov4.setBackground(Color.WHITE);
		BImov4.setBounds(98, 77, 185, 23);
		BImov4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tabelaImovel.setImovel(Main.imobiliaria.getImoveis());
				aux.show(contentPane, "tabelaImovel");
			}
		});
		Buscar.add(BImov4);
		
		JButton Bclie4 = new JButton("Cliente");
		Bclie4.setBackground(Color.WHITE);
		Bclie4.setFont(new Font("Cambria", Font.BOLD, 15));
		Bclie4.setBounds(98, 105, 185, 23);
		Bclie4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tabelaCliente.setClientes(Main.imobiliaria.getClientes());
				aux.show(contentPane, "tabelaCliente");
			}
		});
		Buscar.add(Bclie4);
		
		JButton bProprietario4 = new JButton("Proprietario");
		bProprietario4.setFont(new Font("Cambria", Font.BOLD, 15));
		bProprietario4.setBackground(Color.WHITE);
		bProprietario4.setBounds(98, 133, 185, 23);
		bProprietario4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tabelaProprietario.setProprietario(Main.imobiliaria.getProprietarios());
				aux.show(contentPane, "tabelaProprietario");
			}
		});
		Buscar.add(bProprietario4);
		
		JButton BProposta4 = new JButton("Proposta");
		BProposta4.setFont(new Font("Cambria", Font.BOLD, 15));
		BProposta4.setBackground(Color.WHITE);
		BProposta4.setBounds(98, 161, 185, 23);
		BProposta4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tabelaProposta.setPropostas(Main.imobiliaria.getPropostas((Corretor)user));
				aux.show(contentPane, "tabelaProposta");
			}
		});
		Buscar.add(BProposta4);
		
		JButton Bvolta4 = new JButton("Voltar");
		Bvolta4.setFont(new Font("Cambria", Font.BOLD, 15));
		Bvolta4.setBackground(Color.WHITE);
		Bvolta4.setBounds(98, 214, 185, 23);
		Bvolta4.addActionListener( new TrocaPainel ("home"));
		Buscar.add(Bvolta4);
		
		
		//painel minha página de ambos
		
		JPanel MinhaPagina = new JPanel();
		MinhaPagina.setBackground(new Color(255, 255, 204));
		contentPane.add(MinhaPagina, "minha_pagina");
		MinhaPagina.setLayout(null);
		
		logo5 = new JButton("");
		logo5.setPreferredSize(new Dimension(2, 2));
		logo5.setMinimumSize(new Dimension(0, 0));
		logo5.setMargin(new Insets(0, 0, 0, 0));
		logo5.setIgnoreRepaint(true);
		logo5.setInheritsPopupMenu(true);
		logo5.setIconTextGap(0);
		logo5.setHideActionText(true);
		logo5.setBorder(null);
		logo5.setBackground(new Color(255, 255, 204));
		/*ImageIcon aux=new ImageIcon(Telas.class.getResource("/Entidades/logotipo-dourado-linear-da-casa-81770978.gif"));
		Image image=aux.getImage();
		Image newimg = image.getScaledInstance(230, 310, java.awt.Image.SCALE_SMOOTH);*/
		logo5.setIcon(new ImageIcon(Telas.class.getResource("/InterfaceGrafica/logotipo-da-casa-limpa-para-empresa-imobiliaria_1017-6878.gif")));
		logo5.setBounds(139, 11, 116, 84);
		MinhaPagina.add(logo5);
		
		JButton BAlterarMeusDados = new JButton("Alterar Meus Dados");
		BAlterarMeusDados.setFont(new Font("Cambria", Font.BOLD, 15));
		BAlterarMeusDados.setBackground(Color.WHITE);
		BAlterarMeusDados.setBounds(84, 106, 237, 23);
		MinhaPagina.add(BAlterarMeusDados);
		
		bVoltar5 = new JButton("Voltar");
		bVoltar5.setFont(new Font("Cambria", Font.BOLD, 15));
		bVoltar5.setBackground(Color.WHITE);
		bVoltar5.setBounds(150, 148, 89, 23);
		MinhaPagina.add(bVoltar5);
		
		
		
		
		
	//Painel adicionar gerente
		
		Panel adicionar2 = new Panel();
		adicionar2.setBackground(new Color(255, 255, 204));
		contentPane.add(adicionar2, "adicionar2");
		adicionar2.setLayout(null);
		
		JButton logo7= new JButton("");
		logo7.setPreferredSize(new Dimension(2, 2));
		logo7.setMinimumSize(new Dimension(0, 0));
		logo7.setMargin(new Insets(0, 0, 0, 0));
		logo7.setIgnoreRepaint(true);
		logo7.setInheritsPopupMenu(true);
		logo7.setIconTextGap(0);
		logo7.setHideActionText(true);
		logo7.setBorder(null);
		logo7.setBackground(new Color(255, 255, 204));
		/*ImageIcon aux=new ImageIcon(Telas.class.getResource("/Entidades/logotipo-dourado-linear-da-casa-81770978.gif"));
		Image image=aux.getImage();
		Image newimg = image.getScaledInstance(230, 310, java.awt.Image.SCALE_SMOOTH);*/
		logo7.setIcon(new ImageIcon(Telas.class.getResource("/InterfaceGrafica/logotipo-da-casa-limpa-para-empresa-imobiliaria_1017-6878.gif")));
		logo7.setBounds(144, 8, 89, 69);
		logo7.addActionListener( new TrocaPainel ("home2"));
		adicionar2.add(logo7);
		
		JButton botao_voltar7 = new JButton("Voltar");
		botao_voltar7.setFont(new Font("Cambria", Font.BOLD, 15));
		botao_voltar7.setBackground(Color.WHITE);
		botao_voltar7.setBounds(144, 122, 89, 23);
		botao_voltar7.addActionListener( new TrocaPainel ("home2"));
		adicionar2.add(botao_voltar7);
		
		JButton BCorretor7 = new JButton("Corretor");
		BCorretor7.setFont(new Font("Cambria", Font.BOLD, 15));
		BCorretor7.setBackground(Color.WHITE);
		BCorretor7.setBounds(104, 88, 177, 23);
		BCorretor7.addActionListener(new TrocaPainelLimpavel("formCorretor",(Limpavel)formCorretor));
		adicionar2.add(BCorretor7);
		
		
		
		
	 //Buscar gerente
		
		
		JPanel buscar2 = new JPanel();
		buscar2.setBackground(new Color(255, 255, 204));
		contentPane.add(buscar2, "buscar2");
		buscar2.setLayout(null);
		
		JButton logo10 = new JButton("");
		logo10.setPreferredSize(new Dimension(2, 2));
		logo10.setMinimumSize(new Dimension(0, 0));
		logo10.setMargin(new Insets(0, 0, 0, 0));
		logo10.setIgnoreRepaint(true);
		logo10.setInheritsPopupMenu(true);
		logo10.setIconTextGap(0);
		logo10.setHideActionText(true);
		logo10.setBorder(null);
		logo10.setBackground(new Color(240, 240, 240));
		/*ImageIcon aux=new ImageIcon(Telas.class.getResource("/Entidades/logotipo-dourado-linear-da-casa-81770978.gif"));
		Image image=aux.getImage();
		Image newimg = image.getScaledInstance(230, 310, java.awt.Image.SCALE_SMOOTH);*/
		logo10.setIcon(new ImageIcon(Telas.class.getResource("/InterfaceGrafica/logotipo-da-casa-limpa-para-empresa-imobiliaria_1017-6878.gif")));
		logo10.setBounds(144, 6, 89, 67);
		logo10.addActionListener( new TrocaPainel ("home2"));
		buscar2.add(logo10);
		
		JButton Bcorretor10 = new JButton("Corretor");
		Bcorretor10.setBackground(Color.WHITE);
		Bcorretor10.setFont(new Font("Cambria", Font.BOLD, 15));
		Bcorretor10.setBounds(98, 84, 185, 23);
		Bcorretor10.addActionListener(new TrocaPainelLimpavel("formCorretorBuscar",(Limpavel)formCorretorBuscar));
		buscar2.add(Bcorretor10);
		
		JButton Bvolta10 = new JButton("Voltar");
		Bvolta10.setFont(new Font("Cambria", Font.BOLD, 15));
		Bvolta10.setBackground(Color.WHITE);
		Bvolta10.setBounds(98, 118, 185, 23);
		Bvolta10.addActionListener( new TrocaPainel ("home2"));
		buscar2.add(Bvolta10);
			
	}




	public static void setUser(Pessoa u) {
			user = u;
	}
	public static Pessoa getUser() {
		return user;
	}
	public void setUserCompleto(Pessoa user) {
		setUser(user);
		
		if(user instanceof Corretor)
		{
			logo5.addActionListener( new TrocaPainel ("home"));
			bVoltar5.addActionListener( new TrocaPainel ("home"));
		}
		else if(user instanceof Gerente)
		{
			logo5.addActionListener( new TrocaPainel ("home2"));
			bVoltar5.addActionListener( new TrocaPainel ("home2"));
		}
	}
	
	
	
	class TrocaPainel implements ActionListener
	{
		private String novo;
		
		public TrocaPainel(String novo)
		{
			this.novo=novo;
		}
		public void actionPerformed(ActionEvent arg0)
		{
			CardLayout cl = (CardLayout) (contentPane.getLayout());
			cl.show(contentPane, novo);
		}
	}
	
	class TrocaPainelLimpavel implements ActionListener
	{
		private String novo;
		private Limpavel limpador;
		public TrocaPainelLimpavel(String novo,Limpavel limpador)
		{
			this.novo=novo;
			this.limpador=limpador;
		}
		public void actionPerformed(ActionEvent arg0)
		{
			CardLayout cl = (CardLayout) (contentPane.getLayout());
			cl.show(contentPane, novo);
			limpador.LimparTodosOsCampos();
		}
	}
}