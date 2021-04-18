package Group;

import java.util.HashSet;

public class dfs {

    public static void main(String[] args) {
        group g =new group(5,10);
        g.nodes[0]=new Node(1);
        g.nodes[1]=new Node(2);
        g.nodes[2]=new Node(3);
        g.nodes[3]=new Node(4);
        g.nodes[4]=new Node(5);
        g.nodes[0].nexts.add(g.nodes[1]);
        g.nodes[1].nexts.add(g.nodes[3]);
        g.nodes[3].nexts.add(g.nodes[4]);
        g.nodes[0].edges.add(new Edge(1,g.nodes[0], g.nodes[1]));
        g.nodes[2].edges.add(new Edge(2,g.nodes[2], g.nodes[3]));
        g.nodes[3].edges.add(new Edge(3,g.nodes[3], g.nodes[4]));
        HashSet<Node> visit=new HashSet<>();
        for(int i=0;i<g.nodes.length;i++)
        {
            if(!visit.contains(g.nodes[i])){
                dfs(g.nodes[i],visit);
            }
        }
    }
    public static void dfs(Node node, HashSet<Node> visit){
        if(node!=null){
            System.out.println(node.value);
            visit.add(node);
        }
        for(int i=0;i<node.nexts.size();i++){
             Node t=node.nexts.get(i);
            if(!visit.contains(t)){
                dfs(t,visit);
            }
        }
    }


}
