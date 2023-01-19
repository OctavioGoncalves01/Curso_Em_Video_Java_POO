package aula09;

public class Livro implements Publicacao{

	private String titulo;
	private String autor;
	private int totPag;
	private int pagAtual;
	private boolean aberto;
	private Pessoas leitor;
	
	
	public Livro(String titulo, String autor, int totPag, Pessoas leitor) {
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setTotPag(totPag);
		this.setLeitor(leitor);
		this.setPagAtual(0);
		this.setAberto(false);
		
	}
	
	public void detalhes() {
		System.out.println("Titulo :" + this.getTitulo());
		System.out.println("Autor :" + this.getAutor());
		System.out.println("Total de paginas :" + this.getTotPag());
		System.out.println("Pagina atual :" + this.getPagAtual());
		System.out.println("Aberto :" + this.isAberto());
		System.out.println("Leitor :" + this.getLeitor());
	}


	
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public int getTotPag() {
		return totPag;
	}


	public void setTotPag(int totPag) {
		this.totPag = totPag;
	}


	public int getPagAtual() {
		return pagAtual;
	}


	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}


	public boolean isAberto() {
		return aberto;
	}


	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}


	public Pessoas getLeitor() {
		return leitor;
	}


	public void setLeitor(Pessoas leitor) {
		this.leitor = leitor;
	}



	@Override
	public void abrir() {
		this.setAberto(true);
		
	}



	@Override
	public void fechar() {
		this.setAberto(false);
		
	}



	@Override
	public void folhear(int novaPag) {
		if (novaPag > this.getPagAtual())
			this.setPagAtual(0);
		else
			this.setPagAtual(novaPag);
		
	}



	@Override
	public void avancarPag() {
		this.setPagAtual(getPagAtual() + 1);
		
	}



	@Override
	public void voltarPag() {
		this.setPagAtual(getPagAtual() - 1);
		
	}
}
