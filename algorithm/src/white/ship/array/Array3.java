package white.ship.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 3, 4, 7};
		System.out.println(Arrays.toString(solution(arr, 9)));
	}

	// 3개의 합으로 target 넘버를 만들 수 있는 array index 3개 출력
	static int[] solution(int[] arr, int target) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], i);
		}
		
		for (int i : map.keySet()) {
			int[] subSolution = subSolution(target - i, map);
			if (subSolution != null) {
				if (subSolution[0] != map.get(i) && subSolution[1] != map.get(i)) {
					return new int[] {map.get(i), subSolution[0], subSolution[1]};
				}
			}
		}
		
		return null;
	}
	
	static int[] subSolution(int target, Map<Integer, Integer> map) {
		for (int i : map.keySet()) {
			int findNumber = target - i;
			if (findNumber != i && map.containsKey(findNumber)) {
				return new int[] {map.get(i), map.get(findNumber)};
			}
		}
		return null;
	}
}
