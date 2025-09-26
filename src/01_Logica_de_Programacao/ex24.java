// 24) Imprima os números múltiplos de 3 menores que 50.

public class Solution {
	public static void main(String[] args) {
		for(int i=3; i<50; i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
	}
}