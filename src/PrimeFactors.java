
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * @author User1 Factorize a positive integer number into its prime factors.
 * 
 *         For example:
 *
 *         1 = [ ] 2 = [2] 3 = [3] 4 = [2,2] 5 = [5] 6 = [2,3] 7 = [7] 8 =
 *         [2,2,2] 9 = [3,3] 12 = [2,2,3] 15 = [3,5]
 */
class PrimeFactors {

	@Test
	void factors1() {
		assertEquals(2, factorsOf(1));
		System.out.println();
	}

	@Test
	void factors2() {
		assertEquals(3, factorsOf(2));
		System.out.println();
	}

	@Test
	void factors3() {
		assertEquals(5, factorsOf(3));
		System.out.println();
	}

	@Test
	void factors4() {
		assertEquals(7, factorsOf(4));
		System.out.println();
	}

	@Test
	void factors5() {
		assertEquals(11, factorsOf(5));
		System.out.println();
	}
	
	@Test
	void factors6() {
		assertEquals(13, factorsOf(6));
		System.out.println();
	}
	
	@Test
	void factors7() {
		assertEquals(17, factorsOf(7));
		System.out.println();
	}

	private int factorsOf(int num) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int answer = 0;
//		for (int i = 0; i < num; i++) {
//			list.add(0, 0);
//		}
		int size = 0;
		if (num > 0) {
			if (num == 1) {
				answer = 2;
			} else {
				for (int i = 2; i <= num*num; i++) {
					int counter = 0;
					for (int j = i; j >= 1; j--) {
						if (i % j == 0) {
							counter = counter + 1;
							
						}
					}
					if (counter == 2 && size !=num) {
						list.add(i);
						size++;

					}
				}

				System.out.println(list.toString());
				answer = list.get(num-1);
			}

		}

		return answer;
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
