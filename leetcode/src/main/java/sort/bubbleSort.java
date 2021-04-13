package sort;

public class bubbleSort {
    public static void main(String[] args) {
        int a[]=new int[]{5,6,5,4,78,9,1,26,45};
        bubble(a);
        print(a);
    }
    public static  void bubble(int a[]){
        for(int i=a.length-1;i>0;i--){
            boolean falg=true;
            for(int j=0;j<i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    falg=false;
                }
            }
            if(falg){
                break;
            }
        }
    }
    public static  void print(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
