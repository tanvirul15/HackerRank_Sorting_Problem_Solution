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

public class SparseArray {

    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
        Map<String,Integer> mp=new TreeMap<>();
            for(String s : strings){
               if(mp.containsKey(s)){
                   mp.put(s, mp.get(s)+1);
               }else{
                   mp.put(s, 1);
               
               }
            }
            int l=queries.length;
            int ans[]=new int[l];
            for(int i=0;i<l;i++){
                ans[i]=mp.containsKey(queries[i])?mp.get(queries[i]):0;
            
            }
            return ans;
                


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] strings = new String[stringsCount];

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            strings[i] = stringsItem;
        }

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] queries = new String[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }

        int[] res = matchingStrings(strings, queries);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));

            if (i != res.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

