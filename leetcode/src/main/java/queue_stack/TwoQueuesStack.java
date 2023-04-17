package queue_stack;

import java.util.LinkedList;
import java.util.Queue;

//两个队列实现栈
public class TwoQueuesStack {
      public static void main(String[] args) {
            TwoQueuesStack twoQueuesStack=new TwoQueuesStack();
            twoQueuesStack.push(2);
            twoQueuesStack.push(3);
            twoQueuesStack.push(1);
            System.out.println(twoQueuesStack.pop());
      }
      private Queue<Integer> data;
      private Queue<Integer> help;
      public TwoQueuesStack(){
            data=new LinkedList<>();
            help=new LinkedList<>();
      }
      public void push(Integer i){
            data.add(i);
      }
      public int pop(){
            if(data.isEmpty()){
                  throw new RuntimeException("stack is empty");
            }
            while(data.size()>1){
                  help.add(data.poll());
            }
            int cur=data.poll();
            swap(data,help);
            return cur;

      }
      public int peek(){
            if(data.isEmpty()){
                  throw new RuntimeException("stack is empty");
            }
            while(data.size()>1){
                  help.add(data.poll());
            }
            int cur=data.poll();
            help.add(cur);
            swap(data,help);
            return cur;

      }
      private void swap(Queue data,Queue help){
            Queue temp;
            temp=data;
            data=help;
            help=temp;
      }

}
