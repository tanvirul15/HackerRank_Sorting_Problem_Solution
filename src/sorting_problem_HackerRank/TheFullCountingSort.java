/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting_problem_HackerRank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class TheFullCountingSort {

    // Complete the countSort function below.
//    static void countSort(List<List<String>> arr) {
//        ArrayList<String>[] li=new ArrayList[100];
//        
//        for (int i = 0; i < 100; i++) { 
//            li[i] = new ArrayList<String>(); 
//        }
//       
//        
//        int len=arr.size();
//        int mid=len/2;
//        for(int i=0;i<mid;i++){
//            List<String> temp=arr.get(i);
//            int index=Integer.parseInt(temp.get(0));
//            li[index].add("-");
//        
//        }
//        for(int i=mid;i<len;i++){
//            List<String> temp=arr.get(i);
//            int index=Integer.parseInt(temp.get(0));
//            li[index].add(temp.get(1));
//        
//        }
//        
//        
//        for(List<String> x:li){
//            for(String s:x){
//                System.out.print(s+" ");
//            }
//        }
//
//
//    }

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);

        int n = sc.nextInt();
        int mid=n/2;

        ArrayList<String>[] li=new ArrayList[100];
        
        for (int i = 0; i < 100; i++) { 
            li[i] = new ArrayList<String>(); 
        }
        
        for(int i=0;i<mid;i++){
            int index=Integer.parseInt(sc.next());
            sc.next();
            li[index].add("-");
        
        }
        
        for(int i=mid;i<n;i++){
            int index=Integer.parseInt(sc.next());
            String s=sc.next();
            li[index].add(s);
        
        }
        StringBuilder sb=new StringBuilder();
        for(List<String> x:li){
            for(String s:x){
                sb.append(s+" ");
            }
        }
        System.out.println(sb);



        //countSort(arr);

       // bufferedReader.close();
    }
}
