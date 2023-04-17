package queue_stack;

import java.util.Stack;

public class TwoStacksQueue {
    public static void main(String[] args) {
        TwoStacksQueue twoStacksQueue=new TwoStacksQueue();
        twoStacksQueue.add(1);
        twoStacksQueue.add(2);
        twoStacksQueue.add(3);
        System.out.println(twoStacksQueue.poll());
        System.out.println(twoStacksQueue.poll());
        twoStacksQueue.add(4);
        twoStacksQueue.add(5);
        System.out.println(twoStacksQueue.poll());
        System.out.println(twoStacksQueue.poll());
    }
    Stack<Integer> data=new Stack<>();
    Stack<Integer> help=new Stack<>();
    public TwoStacksQueue(){
         data=new Stack<>();
         help=new Stack<>();
    }
    public void add(Integer i){
        data.push(i);
    }
    public int poll(){
        while(data.size()>1){
          help.add(data.pop());
        }
        int cur=data.pop();
        dao(data,help);
        return cur;
    }
    private void dao(Stack data,Stack help){
         while(!help.isEmpty()){
             data.push(help.pop());
         }
    }
}

