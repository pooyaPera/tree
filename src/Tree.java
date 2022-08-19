public class Tree {
    Node root;


    public Node find(int key){
        Node current = root;

        while(current.value != key){
            if (key< current.value)
                current = current.right;
            else current = current.left;

            if (current == null){
                return null;

            }
        }return current;
    }

    public void insert (int num){
        Node newNode = new Node(num);//Make new Node

        if (root== null){//if no other node, assign as first node (root)
            root = newNode;
        }else{//otherwise set current to root
            Node current = root;
            Node parent;//new reference of the last non Null node to keep track
            while (true){
                parent = current;
                if (num<current.value){
                    current = current.left;
                    if (current == null){
                        parent.left = newNode;
                        return;
                    }
                }else{
                    current = current.right;
                    if (current== null){
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }

    }
}
