package se1.hu3.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Node {

    private static int idCounter = 1000;
    private final int id;
    private final String name;
    private List<Node> childNodes = null;
    //private Node childNodes = null;

    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public Node getSubNode(int id){
        Node c_node = null;
        for(Node c_node2 : childNodes){
            if(c_node2.getId() == id){
                c_node = c_node2;
                break;
            }
        }
        return c_node;
    }

    static protected int getUniqueID(){
        idCounter++;
        return idCounter;
    }

    public Node(String name){
        this.id = getUniqueID();
        this.name = name;
    }

    public abstract void startup();

    public abstract void shutdown();

    public void startupAll(){
        this.startup();
        if(childNodes == null){
            return;
        }
        for(Node c_node : childNodes){
            c_node.startupAll();
        }
    }

    public void shutdownAll(){
        if(childNodes == null){
            this.shutdown();
            return;
        }

        for (int i = this.childNodes.size() - 1; i >= 0; i--){
            this.childNodes.get(i).shutdownAll();
        }
        this.shutdown();
    }

    public String toString(){
        return "This node is named " + this.getName() + " with id " + this.id;
    }



    public void addNode(Node node){
        if(this.childNodes == null){
            childNodes = new ArrayList<>();
        }
        this.childNodes.add(node);
       //System.out.println("Das ist ein" + node);
    }

    private void printNodes(int depth) {
        System.out.println("Tiefe " + depth + " " + this);

        if (childNodes == null) {
            return;
        }

        for (Node c_node : childNodes) {
            c_node.printNodes(depth + 1);
        }
    }
    public void removeNodes(Node node){
        node.shutdown();
        this.childNodes.remove(node);
    }

    public void removeAllNodes(){
        for (int i = this.childNodes.size() - 1; i >= 0; i--){
            this.removeNodes(this.childNodes.get(i));
        }
    }

}
