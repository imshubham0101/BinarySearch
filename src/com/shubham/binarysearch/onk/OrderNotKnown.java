
package com.shubham.binarysearch.onk ;



import static com.shubham.binarysearch.BinarySerach.*;

//Given a sorted array of numbers, find if a given number ‘key’ is present in the array.
// Though we know that the array is sorted, we don’t know if it’s sorted in ascending or descending order.
public class OrderNotKnown {

    // static Scanner sc  = new Scanner(System.in) ; imported from previous class
    public static void main(String[] args) {
       // int[] inputarr = new int[]{ 1,2,4,5,6,7,8};   //Ascending array
        int[] inputarr = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1}; //Descending Array

        System.out.println("Enter the key to be search");
        int key = sc.nextInt();
        int start = 0;
        int end = inputarr.length - 1;
        int diff = inputarr[1] - inputarr[0] ;

        int getIndexofKey = (diff>=0)?searchKey(inputarr, key, start, end):searchKeyDsc(inputarr,key,start,end);
        System.out.println(key + " found at index  " + getIndexofKey);
    }
}
