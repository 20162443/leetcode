package sort;

public class quickSort {

    public static void main(String[] args) {
        int a[]={1,45,7,12,45,7,4};
        quicksort(a,0,a.length-1);
        print(a);
    }
    public static void quicksort(int a[],int low,int high){
        if(low>=high){
            return;
        }
        int part=port(a,low,high);
        quicksort(a,low,part-1);
        quicksort(a,part+1,high);

    }
    public static int port(int a[],int low,int high){
        int l=low;
        int h=high;
        int val=a[low];
        while(l<h){
            while(a[h]>=val&&l<h){
                h--;
            }
            int temp=a[l];
            a[l]=a[h];
            a[h]=temp;
            while(a[l]<=val&&l<h){
                l++;
            }
            temp=a[l];
            a[l]=a[h];
            a[h]=temp;
        }
        return l;
    }
    public static  void print(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
