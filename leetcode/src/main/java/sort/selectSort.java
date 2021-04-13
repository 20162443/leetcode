package sort;

public class selectSort {
    public static void main(String[] args) {
        int a[]=new int[]{5,6,5,4,78,9,1,26,45};
        selectSort(a);
        print(a);

    }
    public static void selectSort(int a[]){
           for(int i=0;i<a.length-1;i++) {
               int min = i;
               for (int j = i+1; j < a.length; j++) {
                   if (a[min] > a[j]) {
                       min = j;
                   }
               }
               int temp = a[min];
               a[min] = a[i];
               a[i] = temp;
           }
    }
    public static  void print(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
