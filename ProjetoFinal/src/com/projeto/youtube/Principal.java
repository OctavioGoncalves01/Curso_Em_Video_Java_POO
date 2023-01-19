package com.projeto.youtube;

public class Principal {

	public static void main(String[] args) {

		Video v[] = new Video[3];
		
		v[0] = new Video("Aula 01 POO");
		v[1] = new Video("Aula 12 PHP");
		v[2] = new Video("Aula 13 JAVA");

		
		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("Octavio", 20, "M", "octavio@gmail");
		g[1] = new Gafanhoto("Jubileu", 15, "M", "juby@gmail");
		
		/*
		v[0].like();
		v[0].isReproduzindo();
		//v[0].
		v[0].play();
		System.out.println(g[0].toString());*/
		
		Visializacao vis[] = new Visializacao[5];
		
		vis[0] = new Visializacao(g[0], v[2]);
		System.out.println(vis[0].toString());
		
		vis[1] = new Visializacao(g[1], v[1]);
		System.out.println(vis[1].toString());
		vis[1].avaliar();
	}
	

}
