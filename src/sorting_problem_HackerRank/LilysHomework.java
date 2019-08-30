/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting_problem_HackerRank;

/**
 *
 * @author Tanvirul Islam
 */


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LilysHomework {

    // Complete the lilysHomework function below.
    static int lilysHomework(int[] arr) {
        int size=arr.length;
        int [] sorted_arr= arr.clone();
        int [] arr2= new int[size];
        Arrays.sort(sorted_arr);
        //Arrays.sort(sorted_arr2,Collections.reverseOrder());
        //Arrays.sort(sorted_arr2);
        //Arrays.sort((sorted_arr2, Collections.reverseOrder()); 
        
        
      
         
        for (int i = 0; i < size; i++) 
        {
            arr2[i]=arr[size-i-1];
            
        }
        
       
        
        
        
        
       // Arrays.
        //ArrayUtils.reverse(sorted_arr2.);
        //Collections.reverse(sorted_arr2);
        
        
        int count1=0;
        int count2=0;
        
        Map<Integer,Integer> mp=new TreeMap<>();
                for(int i=0;i<size;i++){
            mp.put(arr[i],i);
                 
        }
        
        
        for(int i=0;i<size-1;i++){
            if(sorted_arr[i]!=arr[i]){
                int ind=mp.get(sorted_arr[i]);
                int temp=arr[i];
                arr[i]=sorted_arr[i];
                arr[ind]=temp;
                mp.put(temp, ind);
                count1++;
            }
        
        }
        
       // Map<Integer,Integer> mp=new TreeMap<>();
        for(int i=0;i<size;i++){
            mp.put(arr2[i],i);
                 
        }
        
        
        for(int i=0;i<size-1;i++){
            if(sorted_arr[i]!=arr2[i]){
                int ind=mp.get(sorted_arr[i]);
                int temp=arr2[i];
                arr2[i]=sorted_arr[i];
                arr2[ind]=temp;
                mp.put(temp, ind);
                count2++;
            }
        
        }
        
        

        return Math.min(count1, count2);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = lilysHomework(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
