/*that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
*/
package test;

public class CodilitySampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int solution(int[] A) {
        int[] arr = new int[1000001];
        for (int i : A){
            if(i > 0) arr[i]++;
        }
        for (int i = 1; i < arr.length; i++){
            if(arr[i] == 0) return i;
        }
        //untouchable
        return -1;
    }
}
