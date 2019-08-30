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

public class FraudulentActivityNotification {

    // Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {
        int n = expenditure.length;

        int count = 0;
        boolean flag = d % 2 == 0 ? true : false;
        int mid = (d / 2);
                
        int mark[] = new int[201];

        for (int i = 0; i < n; i++) {
            
            int x=0;
            double median=0;
            
            if (i >= d) {
                
                //if the d in even
                if (flag){
                    boolean m=false;
                    for (int j = 0; j < 201; j++) {
                        x+=mark[j];
                        if(x==mid){
                                                   
                            median=j;
                            m=true;
                            //System.out.println("Equal condition satisfied:"+median);
                            //break;
                        }
                        else if(x>mid){
                            if(m){
                                median+=j;
                                //System.out.println("Gratter condition satisfied:"+median);
                                median=median/2.00;
                                //System.out.println("Gratter condition satisfied:"+median);
                                break;
                            }else{
                            
                            median=j;
                            break;}
                        }
                    }

                } 
                //else if, d is odd
                else {
                    for (int j = 0; j < 201; j++) {
                        x+=mark[j];
                        if(x>mid){
                            median=j;
                            break;
                        }
                    }
                }
                if((median+median)<=expenditure[i])count++;
                
                
                mark[expenditure[i - d]]--;
                //System.out.println(median+" N: "+n+" I: "+i);
            

            }

            mark[expenditure[i]]++;
            

            

        }

//        for (int i = 1; i < n; ++i) { 
//            
//            if(i>=d){
//                double median=0;
//                
//                if(flag){
//                    median=(expenditure[i-mid]+expenditure[i-mid-1])/2.00;
//                    }
//                else{
//                    median=expenditure[i-mid-1];
//                }
//                if((median+median)<=expenditure[i])count++;
//                
//                
//            }
//                
//            
//            
//            int key = expenditure[i]; 
//            int j = i - 1; 
//  
//            /* Move elements of arr[0..i-1], that are 
//               greater than key, to one position ahead 
//               of their current position */
//            while (j >= 0 && expenditure[j] > key) { 
//                expenditure[j + 1] = expenditure[j]; 
//                j = j - 1; 
//            } 
//            expenditure[j + 1] = key; 
//        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] expenditure = new int[n];

        String[] expenditureItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int expenditureItem = Integer.parseInt(expenditureItems[i]);
            expenditure[i] = expenditureItem;
        }

        int result = activityNotifications(expenditure, d);
        //System.out.println(result);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
