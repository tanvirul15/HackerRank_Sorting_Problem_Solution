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

public class ClosestNumberProblem {

    // Complete the closestNumbers function below.
    static ArrayList<Integer> closestNumbers(int[] arr) {
        ArrayList<Integer> solution=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        int size=arr.length;
        Arrays.sort(arr);
        
        for(int i=0;i<size-1;i++){
            //System.out.println("");
            
            if((arr[i+1]-arr[i])<min){
                min=arr[i+1]-arr[i];
                if(!solution.isEmpty())solution.clear();
                solution.add(arr[i]);
                solution.add(arr[i+1]);
                
            }
            else if((arr[i+1]-arr[i])==min){
               solution.add(arr[i]);
               solution.add(arr[i+1]);
            }
        }
        //System.out.println("Min: "+min);
        return solution;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        
        System.out.println("Enter size: ");
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];
        System.out.println("Enter values");
        String[] arrItems = scanner.nextLine().split(" ");
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        ArrayList<Integer> result = closestNumbers(arr);
        //System.out.println("Result size: "+result.size());
        for (int i = 0; i < result.size(); i++) {
            System.out.print(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                System.out.print(" ");
            }
        }



        scanner.close();
    }
}

