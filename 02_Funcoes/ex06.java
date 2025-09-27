// 06) Função ehPar que retorna true se o número for par, false caso contrário.
import java.util.Scanner;

public class Solution {
	public static boolean ehPar(int num) {
		if(num%2==0) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		boolean r = ehPar(num);
		System.out.println(r);
	}
}