package br.com.fernanda;

public class SumVisitor implements NodeVisitor{
    private int sum = 0;

    @Override
    public void visit(Node node) {
        sum += node.getValue();
    }

    public int getSum() {
        return sum;
    }

}
