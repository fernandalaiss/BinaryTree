package br.com.fernanda;

public class Node {
    private int value;
    private Node left = null;
    private Node right = null;



    Node(int value){
        this.value = value;
    }

    public int getValue() { return value; }
    public void setValue(int value) { this.value = value; }
    public Node getLeft() { return left; }
    public void setLeft(Node left) { this.left = left; }
    public Node getRight() { return right; }
    public void setRight(Node right) { this.right = right; }

    public void insert(Node node){
        if(node.value < this.value){
            if(this.left == null){
                this.left = node;
            }else{
                this.left.insert(node);
            }
        }else if(node.value > this.value){
            if(this.right == null){
                this.right = node;
            }else{
                this.right.insert(node);
            }
        }
    }

    private int getSons() {
        if(right == null && left != null || right != null && left == null) {
            return 1;
        }
        if(left != null && right != null){
            return 2;
        }
        return 0;
    }

    public Node findSmaller(){
        return this.left == null ? this.left : this.right.findSmaller();
    }

    public Node delete(int key){
        if(key == this.value){
            System.out.println("Apagado o nó "+key);
            //testa se é folha
            if(this.getSons() == 0){
                return null;

            //testa se tem 1 filho
            }else if(this.getSons() == 1){
                Node son = this.left != null ? this.left : this.right;
                this.delete(son.value);
                return son;
            //testa se tem 2 filhos
            }else if(this.getSons() == 2){
                Node smaller = this.findSmaller();
                this.delete(smaller.value);
                return smaller;
            }
        }else if(key < this.value) {
            return this.left.delete(key);
        }else{
            return this.right.delete(key);
        }
        return null;
    }

    public Node search(int key){
        if (key == this.value){
            System.out.println("Encontrou!!");
            return this;
        }
        if(this.left != null){
            if(key < this.value){
                return this.left.search(key);
            }
        }
        if (this.right != null){
            if (key > this.value){
                return this.right.search(key);
            }
        }
        System.out.println("Não encontrou.");
        return null;
    }

    public void accessPreOrder(NodeVisitor v){
        v.visit(this);
        if(left != null){
            left.accessPreOrder(v);
        }
        if(right != null){
            right.accessPreOrder(v);
        }
    }

    public void accessInOrder(NodeVisitor v){
        if(left != null){
            left.accessInOrder(v);
        }
        v.visit(this);
        if(right != null){
            right.accessInOrder(v);
        }
    }

    public void accessPostOrder(NodeVisitor v){
        if(left != null){
            left.accessInOrder(v);
        }
        if(right != null){
            right.accessInOrder(v);
        }
        v.visit(this);
    }
}
