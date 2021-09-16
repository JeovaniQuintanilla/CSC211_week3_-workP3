
package com.mycompany.week_3_lab_session;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NewClass {
 
    public boolean isPrime(int b){
         for (int i = 2; i < b; i++ ){
            if (b%i == 0) return false;
     }
         return true;
         
    }
     int getPrimeSum(int[] nums){
        int sm=0;
        for(int i=0; i<nums.length; i++){
            if(isPrime(nums[i])){
                sm+=nums[i];
            }
        }
        return sm;
    }
     //Homework
      int[] getArrayFromFile(String fl) throws FileNotFoundException {
        
        Scanner sc =new Scanner(new File(fl));
        int[] arr = new int [10];
        int count = 0;
        
        //count number of lines in text
        while(sc.hasNextLine()){
            count = count +1;
            sc.next();
        }
        //add text information to array
        for (int i=0; i < count; i = i+1) {
            arr[i]=sc.nextInt();
            //previous used code however syntax was not in netbeans
            //int num = sc.nextInt();
            //arr.add(num);
        }
       
        return arr;
      }
    
    
    public static void main(String[] args)throws FileNotFoundException {
        NewClass nc= new NewClass();
        String fl = ("C:\\Users\\quint\\TextFiles\\prime.txt");
      
        System.out.print(nc.getArrayFromFile(fl));
        
        
        
        //int[] arr={3,4,8,7,9,10,12,5,11};
        //int sum = nc.getPrimeSum(arr);
        //System.out.println("The sum of the primes in the array is "+ sum );
     }
}

