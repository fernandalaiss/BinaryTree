package br.com.fernanda;

public class DoubleVisitor implements NodeVisitor {

    @Override
    public void visit(Node node) {
        System.out.println(2*node.getValue() + " ");
    }
}
