package sort;

public class mergeSort {
    public static void main(String[] args) {
        int a[]=new int[]{5,6,5,4,78,9,1,26,45};
        mergesort(a,0,a.length-1);
        print(a);
    }
    public static  void mergesort(int a[],int low,int high){
        if(low>=high){
            return;
        }else {
            int mid=(low+high)/2;
            mergesort(a,low, mid);
            mergesort(a,mid+1,high);
            merge(a,low,mid,high);
        }

    }
    public static void  merge(int a[],int low,int mid,int high){
        int b[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        int cur=low;
        int i=low;
        int j=mid+1;
        while(i<=mid&&j<=high){
            if(b[i]<b[j]){
                a[cur++]=b[i++];
            }else{
                a[cur++]=b[j++];
            }
        }
        while(i<=mid){
            a[cur++]=b[i++];
        }
        while(j<=high){
            a[cur++]=b[j++];
        }

    }
    public static  void print(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }

}
