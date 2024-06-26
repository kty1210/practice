package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
경화는 과수원에서 귤을 수확했습니다. 
경화는 수확한 귤 중 'k'개를 골라 상자 하나에 담아 판매하려고 합니다. 
그런데 수확한 귤의 크기가 일정하지 않아 보기에 좋지 않다고 생각한 경화는 귤을 크기별로 분류했을 때 서로 다른 종류의 수를 최소화하고 싶습니다.

예를 들어, 경화가 수확한 귤 8개의 크기가 [1, 3, 2, 5, 4, 5, 2, 3] 이라고 합시다. 
경화가 귤 6개를 판매하고 싶다면, 크기가 1, 4인 귤을 제외한 여섯 개의 귤을 상자에 담으면, 
귤의 크기의 종류가 2, 3, 5로 총 3가지가 되며 이때가 서로 다른 종류가 최소일 때입니다.

경화가 한 상자에 담으려는 귤의 개수 k와 귤의 크기를 담은 배열 tangerine이 매개변수로 주어집니다. 
경화가 귤 k개를 고를 때 크기가 서로 다른 종류의 수의 최솟값을 return 하도록 solution 함수를 작성해주세요.

*/

public class ex03 {

	public static void main(String[] args) {
        int k = 6;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
        System.out.println(minimizeVarieties(k, tangerine)); // 결과는 3이어야 합니다.
    }

    public static int minimizeVarieties(int k, int[] tangerine) {
        // 각 크기의 빈도를 저장하기 위한 맵
        Map<Integer, Integer> sizeFrequency = new HashMap<>();
        for (int size : tangerine) {
            sizeFrequency.put(size, sizeFrequency.getOrDefault(size, 0) + 1);
        }

        // 빈도를 저장하기 위한 리스트
        ArrayList<Integer> frequencies = new ArrayList<>(sizeFrequency.values());
        // 빈도를 내림차순으로 정렬
        Collections.sort(frequencies, Collections.reverseOrder());

        int totalTangerines = 0;
        int typeCount = 0;

        // 빈도가 높은 것부터 귤 선택
        for (int frequency : frequencies) {
            totalTangerines += frequency;
            typeCount++;
            if (totalTangerines >= k) {
                break;
            }
        }

        return typeCount;
    }
}
