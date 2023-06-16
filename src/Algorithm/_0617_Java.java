package Algorithm;

public class _0617_Java {
    public static void main(String[] args) {

    }
}

// 01_문제
//단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

//class Solution {
//    public String solution(String s) {
//        String answer = "";
//
//        if(s.length()%2==0){
//            answer = s.substring(s.length()/2-1,s.length()/2+1);
//        } else {
//            answer = s.substring(s.length()/2,s.length()/2+1);
//        }
//
//
//        return answer;
//    }
//}

// 02_문제
//0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. numbers에서 찾을 수 없는 0부터 9까지의 숫자를
// 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
//제한사항
//1 ≤ numbers의 길이 ≤ 9
//0 ≤ numbers의 모든 원소 ≤ 9
//numbers의 모든 원소는 서로 다릅니다. > HashSet 배열 사용


//입출력 예 #1
//5, 9가 numbers에 없으므로, 5 + 9 = 14를 return 해야 합니다.
//입출력 예 #2
//1, 2, 3이 numbers에 없으므로, 1 + 2 + 3 = 6을 return 해야 합니다.

//import java.util.HashSet;
//        import java.util.Set;
//class Solution {
//    public int solution(int[] numbers) {
//        int answer = 0;
//
//        Set<Integer> num = new HashSet<Integer>();
//
//        for(int n : numbers){
//            num.add(n);
//        }
//
//        for(int i=0; i<10; i++){
//            if(!num.contains(i)){
//                answer += i;
//            }
//        }
//
//        return answer;
//    }
//}

// 03_문제
// 어떤 정수들이 있습니다. 이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와 이 정수들의 부호를 차례대로
// 담은 불리언 배열 signs가 매개변수로 주어집니다. 실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.
//absolutes의 길이는 1 이상 1,000 이하입니다.
//absolutes의 모든 수는 각각 1 이상 1,000 이하입니다.
//signs의 길이는 absolutes의 길이와 같습니다.
//signs[i] 가 참이면 absolutes[i] 의 실제 정수가 양수임을, 그렇지 않으면 음수임을 의미합니다.

//입출력 예 #1
//signs가 [true,false,true] 이므로, 실제 수들의 값은 각각 4, -7, 12입니다.
//따라서 세 수의 합인 9를 return 해야 합니다.

//class Solution {
//    public int solution(int[] absolutes, boolean[] signs) {
//        int answer = 0;
//
//        for(int i=0; i<signs.length; i++){
//            if(signs[i]==true){
//                answer+= absolutes[i];
//            } else {
//                answer-= absolutes[i];
//            }
//        }
//
//
//        return answer;
//    }
//}

// 04 문제
// 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
//전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로
// 가린 문자열을 리턴하는 함수, solution을 완성해주세요.

//입출력 예
//phone_number	return
//"01033334444"	"*******4444"
//"027778888"	"*****8888"

//class Solution {
//    public String solution(String phone_number) {
//        String answer = "";
//        String s = phone_number;
//        String star = "";
//
//        String last = s.substring(s.length()-4);
//        String front = s.substring(0,s.length()-4);
//
//        for(int i=0; i<front.length(); i++){
//            star += "*" ;
//        }
//
//        answer = star + last ;
//        return answer;
//    }
//}

// 05 문제
//문제 설명
//행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다.
// 2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.

//제한 조건
//행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.

//입출력 예
//arr1	arr2	return
//[[1,2],[2,3]]	[[3,4],[5,6]]	[[4,6],[7,9]]
//[[1],[2]]	[[3],[4]]	[[4],[6]]

//class Solution {
//    public int[][] solution(int[][] arr1, int[][] arr2) {
//        int[][] answer = new int[arr1.length][arr1[0].length];
//
//        for(int i=0; i<arr1.length; i++){
//            for(int j=0; j<arr1[0].length; j++){
//                answer[i][j] = arr1[i][j] + arr2[i][j];
//            }
//        }
//
//        return answer;
//    }
//}


