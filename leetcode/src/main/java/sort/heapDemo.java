package sort;

public class heapDemo {
    public static void main(String[] args) {
        int a[]={1,5,6,7,2,5,66,14};
        heapSort(a);
        print(a);
    }
    public static void heapSort(int a[]){
        int len=a.length-1;
        for(int i=(len-1)/2;i>=0;i--){
            heapify(a,i,a.length);
        }
        int size=a.length;
        while (size>0){
            int temp=a[size-1];
            a[size-1]=a[0];
            a[0]=temp;
            size--;
            heapify(a,0,size);
        }
    }
    public  static  void heapify(int a[],int index,int size){
            int left=index*2+1;
           while(left<size){
               int largest= left+1<size&&a[left+1]>a[left]?left+1:left;
               largest= a[index]>a[largest]?index:largest;
               if(largest==index){
                   break;
               }else{
                   int temp=a[largest];
                   a[largest]=a[index];
                   a[index]=temp;
                   index=largest;
                   left=index*2+1;
               }
           }
    }
    public static  void print(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }

}
