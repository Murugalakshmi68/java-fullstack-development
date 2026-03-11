import java.util.Arrays;

public class Array {
     public static void main(String args[]){
        int[] a=new int[3];
        int[] arr={10,20,30,40,50};
        a[0]=10;a[2]=20;int total=0;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a);
        for(int i=0;i<a.length;i++)
           System.out.println(a[i]);
        for(int i : arr) total+=i;
        System.out.println("Total = "+total);
        System.out.println("Avg = "+total/arr.length);
        int[] b={70,30,20,40,2,100};
        int min=b[0];
        for(int i=1;i<b.length;i++){
            if(b[i]<min) min=b[i];
        }
        System.out.println("Min value = "+min);
        //Find given element index
        int[] c={2,3,4,5,7,2,5,8};
        int element = 7;
        for(int i=0;i<c.length;i++){
            if(c[i]==element){
                System.out.println(i);
                break;
            }
        }
        int k=0;
        while(k<c.length){
            if(c[k]==element){
                System.out.println(k);
                break;
            }
            k++;
        }
        //Find duplicate element in the array
        int[] d={10,20,30,40,20,50,70,10};
        Arrays.sort(d);
        for(int i=0;i<(d.length-1);i++){
            if(d[i]==d[i+1])
                System.out.println(d[i]);
        }
        System.out.println("Reverse an array");
        int[] e={40,50,70,10,20,30};
        int start=0,end=e.length-1;
        while(start < end){
            int temp=e[start];
            e[start]=e[end];
            e[end]=temp;
            start++;
            end--;
        }
        for(int i=0;i<e.length;i++)
            System.out.println(e[i]);
        System.out.println("Second largest element");
        int[] f={10,20,100,70,50,80};
        Arrays.sort(f);
        System.out.println(f[f.length-2]);
        System.out.println("To chect sorted or not");
        int[] g = {1030,40,70,100};
        boolean isSorted = true;
        for(int i = 0; i < g.length-1; i++) {
            if(g[i] > g[i+1]) {
                isSorted = false;
                break;
           }
        }
        if(isSorted)
            System.out.println("Array is Sorted");
        else
            System.out.println("Array is Not Sorted");

        System.out.println("Remove duplicates");
        int[] h = {10,20,30,20,40,10,50};
        Arrays.sort(h);
        System.out.print(h[0] + " ");
        for(int i=1;i<h.length;i++){
            if(h[i] != h[i-1]){
                System.out.print(h[i] + " ");
            }
        }
        System.out.println("Rotate an array by 1 position");
        int[] j = {10,20,30,40,50};
        int first = j[0];
        for(int i = 0; i < j.length-1; i++){
            j[i] = j[i+1];
        }
        j[j.length-1] = first;
        for(int i : j)
            System.out.print(i + " ");
        System.out.println("")
       /*
       //2D array
       int[][] f = new int[3][2];
       f[0][0]=60;
       f[0][1]=40;
       f[2][1]=30;
       for(int i=0;i<f.length;i++){
        for(int j=0;j<f.length;j++)
            System.out.print(f[i][j]);
        System.out.println();
       }
        */
    

     }
}
