package practice;

/*대문자와 소문자가 섞여있는 문자열 s가 주어집니다. 
 * s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요. 
 * 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 
 * 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
 * 예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다
*/

public class ex01 {
	
	// 메인 메서드
    public static void main(String[] args) {
        String s = "pPoooyY"; // 예시 문자열
        ex01 solution = new ex01();
        boolean result = solution.checkPYCount(s);
        System.out.println(result);
    }
    
    // 문자열에서 'p'와 'y'의 개수를 비교하는 메서드
    public boolean checkPYCount(String s) {
        // 문자열을 소문자로 변환
        s = s.toLowerCase();
        
        // 'p'와 'y'의 개수 세기
        int pCount = 0;
        int yCount = 0;
        
        // 문자열을 순회하며 'p'와 'y' 개수 증가
        for (char ch : s.toCharArray()) {
            if (ch == 'p') {
                pCount++;
            } else if (ch == 'y') {
                yCount++;
            }
        }
        
        // 'p'와 'y'의 개수가 같은지 비교
        return pCount == yCount;
    }
 }
