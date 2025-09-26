// 27) Verifique todos os números de 1 a 100 e diga quais são primos.

public class Solution {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			int j = 2;
			for(; j<i && i%j!=0; j++);
			if(j==i && i!=1) {
				System.out.println(i + " eh primo.");
			}
		}		
	}
}