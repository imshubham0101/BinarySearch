/*
FIND FIRST AND LAST POSITIONS OF AN ELEMENT IN A SORTED ARRAY:

        Given a sorted array with possibly duplicate elements,
        the task is to find indexes of first and last occurrences of an element x in the given array.

        Example:

        Input : arr[] = {1, 3, 5, 5, 5, 5 ,67, 123, 125}
        x = 5
        Output : First Occurrence = 2
        Last Occurrence = 5
*/
package  com.shubham.binarysearch.occurrence ;

import  static com.shubham.binarysearch.BinarySerach.* ;
public class Occurrence {

   // int result = 0 ;
    public static void main(String[] args) {
       // int[] inputarr = new int[]{1, 3, 5, 5, 5, 5 ,67, 123, 125} ;
        int[] inputarr = new int[]{2, 2, 2, 2, 2, 2, 3,} ;
        System.out.println("Enter the key");
        int key = sc.nextInt() ;
        int start = 0 ;
        int end = inputarr.length - 1 ;
        int result = -1 ;
        int firstOccur = callFirstOccur(inputarr,key,start,end,result);
        int lastOccur =  callLastOccur(inputarr,key,start,end,result);
        System.out.println("First Occurence "+firstOccur + "Last Occurenece "+lastOccur);
    }

    public static int callFirstOccur(int[] inputarr, int key, int start, int end,int result ) {

        var index = searchKey(inputarr,key,start,end);
        if(index > -1 )
            result = index ;
        if(index == -1)
            return  result;
        else if( index > -1){
            return callFirstOccur(inputarr,key,start,index-1 ,result);
        }
        return result;
    }

    public static int callLastOccur(int[] inputarr, int key, int start, int end,int result ) {

        var index = searchKey(inputarr,key,start,end);
        if(index > -1 && index > result)
            result = index ;
        if(index == -1)
            return  result;
        else if( index > -1){
            return callLastOccur(inputarr,key,index+1,end ,result);
        }
        return result;
    }
}
