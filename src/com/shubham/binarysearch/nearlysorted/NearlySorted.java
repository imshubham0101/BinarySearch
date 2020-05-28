package com.shubham.binarysearch.nearlysorted;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import org.w3c.dom.ls.LSOutput;

/*SEARCH IN A NEARLY SORTED ARRAY:

        Given an array which is sorted,but after sorting some elements are moved to either of the adjacent positions,
          i.e., arr[i] may be present at arr[i+1] or arr[i-1].
          Write an efficient function to search an element in this array.
          Basically the element arr[i] can only be swapped with either arr[i+1] or arr[i-1].

        For example consider the array {2, 3, 10, 4, 40}, 4 is moved to next position and 10 is moved to previous position.

        Example :
        Input: arr[] =  {10, 3, 40, 20, 50, 80, 70}, key = 40
        Output: 2
        Output is index of 40 in given array
        */
import static com.shubham.binarysearch.BinarySerach.* ;
public class NearlySorted {

    public static void main(String[] args) {
        int[] inputarr = new int[]{10, 3, 40, 20, 50, 80, 70} ;
        System.out.println("Enter key to be search");
        var key = sc.nextInt() ;
        var start = 0 ;
        var end = inputarr.length - 1 ;
        int indexOfKey = searchKeyInNearlySorted(inputarr,key,start,end);
        System.out.println(indexOfKey);

    }

    public static int searchKeyInNearlySorted(int[] arr, int key, int start, int end) {

        var mid = (start + end) / 2 ;
        var next =( mid + 1 )% arr.length ;
        var prev =( mid -1 + arr.length ) % arr.length ;

        return (key == arr[prev]) ? prev : (key == arr[mid]) ? mid : (key == arr[next]) ?
                next : (mid > key) ? searchKeyInNearlySorted(arr,key,start,mid-1) :
                searchKeyInNearlySorted(arr,key,mid+1 ,end);

    }
}
