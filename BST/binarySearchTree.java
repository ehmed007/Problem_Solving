
class node {
    public int data;
    public node left;
    public node right;
    
    public node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class tree {
    node root;

    public tree() {
        this.root = null;
    }

    public void insert(int data) {
        node newnode = new node(data);
        if (root == null) {
            root = newnode;
        }
        else {
            node pre = this.root;
            node currNode = this.root;
            while(currNode != null) {
                pre = currNode;
                if (newnode.data < currNode.data) {
                    currNode = currNode.left; 
                } 
                else {
                    currNode = currNode.right;
                }
            }
            if(pre.data > newnode.data) {
                pre.left = newnode;
            }
            else {
                pre.right = newnode;
            }
        }
    }

    public void traverse() {
        printInorder(this.root);
        System.out.println();
    }

    public void printInorder(node node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        printInorder(node.left);
        printInorder(node.right);
    }

    
    public void delete(int data) {
        node currNode = this.root;
        node pre = this.root;
        while(currNode.data != data) {
            pre = currNode;
            if (currNode.data < data) {
                currNode = currNode.right;
            }
            else {
                currNode = currNode.left;
            }
        }
        if (currNode.left == null && currNode.right == null) {
            handleLast(pre, currNode);
        } else {
            if (currNode.left != null && currNode.right != null) {
                if (pre == currNode) { // root node
                    if (currNode.right.left != null) {
                        node temp = currNode.right;
                        node prev = temp;
                        while (temp.left != null) {
                            prev = temp;
                            temp = temp.left;
                        }
                        int x = prev.left.data;
                        prev.left.data = pre.data;
                        pre.data = x;
                        prev.left = null;
                    }
                    else {
                        
                    }
                }
            }
        }
    }

    void handleLast(node pre, node currNode) {
        if(pre.left == currNode) {
            pre.left = null;
        }
        else {
            pre.right = null;
        }
    }

}


public class binarySearchTree {

    public static void main(String[] args) {
        tree t = new tree();
        t.insert(9);
        t.insert(5);
        t.insert(8);
        t.insert(24);
        t.insert(1);
        t.insert(7);
        t.insert(22);
        t.insert(30);
        t.insert(21);

        t.traverse();
        t.delete(21);
        t.delete(22);
        t.delete(30);
        // t.delete(9);
        t.traverse();

    }
    
}