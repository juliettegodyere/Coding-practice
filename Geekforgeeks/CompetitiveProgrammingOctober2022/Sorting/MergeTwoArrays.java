package Sorting;

import java.util.ArrayList;

/**
 * Merge two sorted array. Here we will use two pointer technique.
 *  a[] = {10,15,20,40};
 *  b[] = {5,6,6,10,15};
 *  1st
 *  i = 0, j = 1
 * print(5)
 * 2nd
 * i = 0, j = 2
 * print(6)
 * 3rd
 * i = 0; j = 3
 * print(6)
 * 4th
 * i = 0, j = 4
 * print(10)
 * 5th
 * i = 1, j = 4
 * print(10)
 * 6th
 * i =, j = 5
 * print(15)
 * 
 */

import java.util.Arrays;

public class MergeTwoArrays {
    static void merge(int a[], int b[], int m, int n){
    
        int i=0,j=0;
        while(i<m && j<n){
            if(a[i]<b[j])
                System.out.print(a[i++]+" ");
            else
                System.out.print(b[j++]+" ");
        }
        while(i >=0 && i<m)
            System.out.print(a[i++]+" ");
        while(j >=0 && j<n)
            System.out.print(b[j++]+" ");    
    }

    static ArrayList<Integer> mergeTest(int a[], int b[], int m, int n){

        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;

        while (i < m && j < n) {
            if (a[i] < b[j]) {
                list.add(a[i]);
                i++;
            } else {
                list.add(b[j]);
                j++;
            }
        }

        while (i < m) {
            list.add(a[i]);
            i++;
        }

        while (j < n) {
            list.add(b[j]);
            j++;
        }

        return list;
    }

    static void mergeNaive(int a[], int b[], int m, int n){
    
        int[] c=new int[m+n];
        for(int i=0;i<m;i++)
            c[i]=a[i];
        for(int j=0;j<n;j++)
            c[j+m]=b[j];
        
        Arrays.sort(c);
        
        for(int i=0;i<m+n;i++)
            System.out.print(c[i]+" ");
    }
    public static void main (String[] args) 
    {
        int a[] = new int[]{10,15,20,40};
        int b[] = new int[]{5,6,6,10,15};
        
        int m = a.length;
        int n = b.length;
       // merge(a,b,m,n);

        System.out.println(mergeTest(a, b, m, n));
        
    }
}
