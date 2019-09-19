package br.com.fernanda;

public class PrintVisitor implements NodeVisitor {

    @Override
    public void visit(Node node) {
        System.out.print(node.getValue() + " ");
    }
}
