// 29) Calcule a soma dos números ímpares entre 1 e 100.

public class Solution {
	public static void main(String[] args) {
		int s = 0;
		for(int i=1; i<=100; i+=2) {
			s += i;
		}
		System.out.println(s);
	}
}