package br.com.fernanda;

public class ArvoreBinariaBusca {
    private Node raiz = null;

    public Node getRaiz(){
        return raiz;
    }

    public void insert(Node node){
        if(raiz == null){
            raiz = node;
            return;
        }
        raiz.insert(node);
    }
    //sobrecarga do insert sem precisar ter um node criado
    public void insert(int value){
        Node n = new Node(value);
        insert(n);
    }

    public void delete(int key){
        if(raiz == null){
            System.out.println("Não há nós na árvore.");
        }else{
            raiz = raiz.delete(key);
        }
    }

    public Node search(int key){
        if(raiz == null){
            System.out.println("Não há nós na árvore.");
            return null;
        }else{
            return raiz.search(key);
        }
    }
}
// AAA testes unitarios