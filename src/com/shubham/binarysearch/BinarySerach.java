
package com.shubham.binarysearch ;
import java.util.Scanner;

//Binary Serach Implementation
public class BinarySerach {

   public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        int status = 0 ;
        do {
           // callBinarySearch();
            callBinarySearchDsc();
            System.out.println("Do you want to continue 1 / 0");
             status = sc.nextInt();
             if(status == 0)
                 System.out.println("Thank you ....visit again");

        }while(status == 1) ;

    }

    public static void callBinarySearch(){
        int[] inputarr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Enter the key to be search");
        int key = sc.nextInt();
        int start = 0;
        int end = inputarr.length - 1;
        int getIndexofKey = searchKey(inputarr, key, start, end);
        System.out.println(key + " found at index  " + getIndexofKey);
    }

    public static void callBinarySearchDsc(){
        int[] inputarrDsc = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Enter the key to be search");
        int key = sc.nextInt();
        int start = 0;
        int end = inputarrDsc.length - 1;
        int getIndexofKey = searchKeyDsc(inputarrDsc, key, start, end);
        System.out.println(key + " found at index  " + getIndexofKey);
    }

    public static int searchKey(int[] inputarr, int key, int start, int end) {

        if (start <= end) {
            int mid = (start + end) / 2;
            if (inputarr[mid] == key)
                return mid;
            {
                if (inputarr[mid] > key)
                    return searchKey(inputarr, key, start, mid - 1);
                else
                    return searchKey(inputarr, key, mid + 1, end);

            }
        }
          return  -1 ;
    }

    public static int searchKeyDsc(int[] inputarr, int key, int start, int end) {

        if (start <= end) {
            int mid = (start + end) / 2;
            if (inputarr[mid] == key)
                return mid;
            {
                if (inputarr[mid] < key)
                    return searchKeyDsc(inputarr, key, start, mid - 1);
                else
                    return searchKeyDsc(inputarr, key, mid + 1, end);

            }
        }
        return  -1 ;
    }
}
