package com.shubham.binarysearch.countElements;

/*COUNT NUMBER OF OCURRENCES(or frequency) IN A SORTED ARRAY:

        Given a sorted array arr[] and a number x,
        write a function that counts the occurrences of x in arr[].
        Expected time complexity is O(Logn)
        Examples:

        Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 2
        Output: 4 // x (or 2) occurs 4 times in arr[]

        Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 3
        Output: 1*/
import static com.shubham.binarysearch.BinarySerach.*;
import static com.shubham.binarysearch.occurrence.Occurrence.*;
public class CountElements {

    public static void main(String[] args) {

        int[] inputarr = new int[]{1, 1, 2, 2, 2, 2, 3,} ;
        System.out.println("Enter the key to calculate count");
        int key = sc.nextInt();
        int firstOccur = callFirstOccur(inputarr,key,0,inputarr.length-1,-1);
        int lastOccur = callLastOccur(inputarr,key,0,inputarr.length-1,-1);
        int count = lastOccur - firstOccur + 1 ;
        System.out.println(key+" is "+count+" times");
    }
}
