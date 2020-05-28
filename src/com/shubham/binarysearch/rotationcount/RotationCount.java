package com.shubham.binarysearch.rotationcount;

/*
Find the Rotation Count in Rotated Sorted array
        Consider an array of distinct numbers sorted in increasing order. The array has been rotated (clockwise) k number of times. Given such an array, find the value of k.

        Examples:

        Input : arr[] = {15, 18, 2, 3, 6, 12}
        Output: 2
        Explanation : Initial array must be {2, 3,
        6, 12, 15, 18}. We get the given array after
        rotating the initial array twice.

        Input : arr[] = {7, 9, 11, 12, 5}
        Output: 4

        Input: arr[] = {7, 9, 11, 12, 15};
        Output: 0
*/
import static com.shubham.binarysearch.BinarySerach.*;
public class RotationCount {

    public static void main(String[] args) {

        //int[] inputarr = new int[]{15, 18, 2, 3, 6, 12};
       int[] inputarr = new int[]{5,6,7,0,1,2,3,4};
        // int[] inputarr = new int[]{7, 9, 11, 12,15,16};
        int start = 0 ;
        int end = inputarr.length-1 ;
        int pivotmid = (start + end) / 2 ;
        int count = callRotationCount(inputarr,pivotmid,start,end);
        //System.out.println(count);
        //search in sorted rotated array
        System.out.println("enter element to be search");
        int key = sc.nextInt();
        int indexOfKey = searchInSortedArray(inputarr,key,count);
        System.out.println(indexOfKey);
    }



    public static int callRotationCount(int[] arr, int mid ,int start, int end) {
         //int mid = (start + end) / 2 ;
        if(arr[start] <= arr[end])
            return start ;
        int next = mid+1 % arr.length ;
        int prev = (mid + arr.length - 1 ) % arr.length ;
        if(arr[mid] < arr[prev] && arr[mid] < (arr[next])){
            return mid ;
        }
        else{
            if(arr[mid] <= arr[end]){
                end = mid -1 ;
                mid = (start + end ) / 2 ;
                return callRotationCount(arr,mid,start,end);

            }
            else{
                start = mid+1 ;
                mid = (start + end) / 2 ;
                return callRotationCount(arr,mid,start,end);
            }
        }

    }
    //search in sorted rotated array
    public static int searchInSortedArray(int[] inputarr, int key, int minIndex) {
        var leftindex = searchKey(inputarr,key,minIndex,inputarr.length-1);
        var rightindex = searchKey(inputarr,key,0,minIndex-1);



        return  (leftindex >= rightindex) ? leftindex : rightindex ;
    }


}
