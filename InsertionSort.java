package Hra;

import java.util.*;
import java.lang.Math;

public class InsertionSort {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector();
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Inputkan Panjang Vector : ");
        int panjang = scan.nextInt();
        for (int i = 0; i < panjang; i++) {
            System.out.print("index ke " + i + " : ");
            int angka = scan.nextInt();
            vector.add(angka);
        }
        System.out.println("Sebelum Disorting : "+vector);
        for (int i = 0; i < vector.size(); i++) {
            for (int j = 0; j < vector.size()-1; j++) {
                if(vector.get(j) > vector.get(j+1)){
                    int temp = vector.get(j);
                    vector.set(j, vector.get(j+1));
                    vector.set(j+1,temp);
                
                   
                }
                
            }
            
        }
        int n = vector.size();
        int i = 1;
        int j;
        while(i<n){
            int temp = vector.get(i);
            for(j=i;j>0;j--){
                if(temp<vector.get(j-1)){
                    vector.set(j, vector.get(j-1));
                }else{
                    break;
                }
            }
            vector.set(j, temp);
            i++;
        }
        System.out.println("Setelah disorting : "+vector);
    }
    
}
