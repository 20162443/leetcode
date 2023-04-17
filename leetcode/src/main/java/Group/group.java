package Group;

import java.util.ArrayList;

public class group {
    Node[] nodes;
    Edge[] edges;
    public group(int n1,int n2){
        nodes=new Node[n1];
        edges=new Edge[n2];
    }
}
class Node{
    public  int value;
    public  int in;
    public  int out;
    public  ArrayList<Node> nexts;
    public  ArrayList<Edge> edges;

    public Node(int value) {
        this.value = value;
        in=0;
        out=0;
        nexts=new ArrayList<>();
        edges=new ArrayList<>();
    }
}
class Edge{
    public  int weight;
    public  Node from;
    public  Node to;

    public Edge(int weight, Node from, Node to) {
        this.weight = weight;
        this.from = from;
        this.to = to;
    }
}
