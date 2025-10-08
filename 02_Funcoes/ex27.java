// 27) Função que recebe um array e retorna uma cópia invertida.

import java.util.Scanner;

public class Solution {
    public static int[] inverteArray(int arr[]) {
        int invArr[] = new int[arr.length];
        for(int i=0; i<invArr.length; i++) {
            invArr[i] = arr[arr.length-1-i];
        }
        return invArr;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int len = scan.nextInt();

        scan.close();

        int arr[] = new int[len];

        System.out.print("Original array = [");
        for(int i=0; i<len; i++) {
            arr[i] = (int)(Math.random()*100);
            System.out.print(arr[i]);
            if(i<len-1) {
            	System.out.print(',');
            }
        }
        System.out.println("]");

        int invArr[] = inverteArray(arr);
        
        System.out.print("Inverted array = [");
        for(int i=0; i<len; i++) {
        	System.out.print(invArr[i]);
        	if(i<len-1) {
        		System.out.print(',');
        	}
        }
        System.out.println("]");
    }
}