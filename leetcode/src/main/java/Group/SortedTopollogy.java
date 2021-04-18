package Group;

import java.security.acl.Group;
import java.util.*;

public class SortedTopollogy {
    public static void main(String[] args) {
        group g =new group(5,4);
        g.nodes[0]=new Node(1);
        g.nodes[1]=new Node(2);
        g.nodes[2]=new Node(3);
        g.nodes[3]=new Node(4);
        g.nodes[4]=new Node(5);
        g.nodes[0].in=0;
        g.nodes[0].out=2;
        g.nodes[1].in=1;
        g.nodes[1].out=1;
        g.nodes[2].in=0;
        g.nodes[2].out=0;
        g.nodes[3].in=1;
        g.nodes[3].out=1;
        g.nodes[4].in=2;
        g.nodes[4].out=0;
        g.nodes[0].nexts.add(g.nodes[1]);
        g.nodes[1].nexts.add(g.nodes[3]);
        g.nodes[3].nexts.add(g.nodes[4]);
        g.nodes[0].nexts.add(g.nodes[4]);
        Edge edge1=new Edge(1,g.nodes[0], g.nodes[1]);
        Edge edge2=new Edge(5,g.nodes[0], g.nodes[4]);
        Edge edge3=new Edge(2,g.nodes[2], g.nodes[3]);
        Edge edge4=new Edge(3,g.nodes[3], g.nodes[4]);
        g.nodes[0].edges.add(edge1);
        g.nodes[0].edges.add(edge2);
        g.nodes[2].edges.add(edge3);
        g.nodes[3].edges.add(edge4);
        g.edges[0]=edge1;
        g.edges[1]=edge2;
        g.edges[2]=edge3;
        g.edges[3]=edge4;
        List<Node> list=Sorted(g);
        for(Node node:list){
            System.out.println(node.value);
        }
    }
    public  static List<Node> Sorted(group group){

        HashMap<Node,Integer> map=new HashMap();
        Queue<Node> q=new LinkedList<>();
        for(int i=0;i<group.nodes.length;i++){
            map.put(group.nodes[i],group.nodes[i].in);
            if(group.nodes[i].in==0){
                q.add(group.nodes[i]);
            }
        }
        List<Node> list=new ArrayList<>();
        while(!q.isEmpty()){
            Node cur=q.poll();
            list.add(cur);
             for(Node node:cur.nexts){
             map.put(node,map.get(node)-1);
             if(map.get(node)==0){
                 q.add(node);
             }
            }
        }
        return list;
    }
}
