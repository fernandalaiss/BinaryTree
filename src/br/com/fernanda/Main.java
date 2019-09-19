package br.com.fernanda;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    /*Node root = new Node(10);

	    root.setLeft(new Node(5));
	    root.setRight(new Node(15));
	    root.setValue(8);

	    PrintVisitor p = new PrintVisitor();
	    DoubleVisitor d = new DoubleVisitor();
	    SumVisitor s = new SumVisitor();

		root.accessInOrder(s);
		System.out.println("A soma dos nós é " + s.getSum());

		root.accessPreOrder(d);

        root.accessPreOrder(p); // 8 5 15
        root.accessInOrder(p); // 5 8 15
        root.accessPostOrder(p); // 5 15 8
		*/

		ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();
		arvore.insert(10);
		arvore.insert(4);
		arvore.insert(7);
		arvore.insert(1);
		arvore.insert(12);
		arvore.insert(11);

		/*
		Random random = new Random();
		for (int i = 0; i < 10 ; i++) {
			arvore.insert(random.nextInt(10) % 100);
		}
		*/
        arvore.search(7);
		arvore.delete(7);
		arvore.search(7);
    /*
		JFrame window = new JFrame(); //é uma estrutura organizada em árvore
		window.setSize(400,300);
		window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //qnd fechar janela mata o processo

		//JLabel label = new JLabel("Hello, world!!!!"); // cada filho também é uma árvore
		//window.add(label); // comentado pois não vamos nos aprofundar

		ArvoreBinariaBuscaView view = new ArvoreBinariaBuscaView(arvore);
		window.add(view);
		window.setVisible(true);
    */
    }
}
