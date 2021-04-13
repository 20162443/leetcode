package sort;

public class insertSort {
    public static void main(String[] args) {
        int a[]=new int[]{5,6,5,4,78,9,1,26,45};
        insert(a);
        print(a);
    }
    public static  void insert(int a[]){
        for(int i=1;i<a.length;i++){
            for(int j=i-1;j>=0&&a[j]>a[j+1];j--){
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
    public static  void print(int a[]){

       for(int i=0;i<a.length;i++){
           System.out.print(a[i]+" ");
       }

    }
}
