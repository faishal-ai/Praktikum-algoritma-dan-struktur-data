package JOBSHEET11;

public class BinaryTree09 {
    Node09 root;

    public BinaryTree09(){
        root = null;
    }

    boolean isEmpty(){
        return root == null; //mengembalikan true jika root adalah null
    }

    void add(int data){
        if(isEmpty()){ //if the tree is empty
            root = new Node09(data);
        }else{
            Node09 current = root;
            while(true){
                if(data < current.data){ // Data less than current node's data
                    if(current.left == null){
                        current.left = new Node09(data);
                        break;
                    }else{
                        current = current.left;
                    }
                }else if(data > current.data){ // Data greater than current node's data
                    if(current.right == null){
                        current.right = new Node09(data);
                        break;
                    }else{
                        current = current.right;
                    }
                }else{ // Data is equal to current node's data, do nothing
                    break;
                }
            }
        }
    }

    boolean find(int data){
        boolean result = false;
        Node09 current = root;
        while(current != null){
            if(current.data == data){
                result = true;
                break;
            }else if(data > current.data){
                current = current.right;
            }else{
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node09 node){
        if(node !=null) {
            System.out.print(" " + node.data);
            traversePreOrder( node.left);
            traversePreOrder(node.right);
        }
    }
    void traversePostOrder(Node09 node){
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }
    void traverseInOrder(Node09 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    //Method untuk menghapus 2 child
    Node09 getSuccessor(Node09 del){
        Node09 successor = del.right;
        Node09 successorParent = del;
        while(successor.left!= null){
            successorParent = successor;
            successor = successor.left;
        }
        if(successor!=del.right){
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
        } 

    void delete(int data){
        if(isEmpty()){
            System.out.println("Tree is empty!");
            return;
        }
        //find node (current) that will be deleted
        Node09 parent = root;
        Node09 current = root;
        boolean isLeftChild = false;
        while(current!=null){
            if(current.data==data){
                break;
            }else if(data<current.data){
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if(data>current.data){
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        //deletion
        if(current==null){
            System.out.println("Couldn't find data!");
            return;
        }else{
            //if there is no child, simply delete it
            if(current.left==null&&current.right==null){
                if(current==root){
                    root = null;
                }else{
                    if(isLeftChild){
                        parent.left = null;
                    }else{
                        parent.right = null;
                    }
                }
            }else if(current.left==null){//if there is 1 child (right)
                if(current==root){
                    root = current.right;
                }else{
                    if(isLeftChild){
                        parent.left = current.right;
                    }else{
                        parent.right = current.right;
                    }
                }
            }else if(current.right==null){ //if there is 1 child (left)
                if(current==root){
                    root = current.left;
                }else{
                    if(isLeftChild){
                        parent.left = current.left;
                    }else{
                        parent.right = current.left;
                    }
                }
            }else{ //if there is 2 child
                Node09 successor = getSuccessor(current);
                if(current==root){
                    root = successor;
                }else{
                    if(isLeftChild){
                        parent.left = successor;
                    }else{
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }
}