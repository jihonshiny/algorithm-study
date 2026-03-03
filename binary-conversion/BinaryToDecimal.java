public class BinaryToDecimal {
    public static void main(String[] args) {
        
        int input = 101110; // 변환할 2진수
        int di = 1;         // 자리값 (2⁰부터 시작)
        int sum = 0;        // 최종 10진수 결과
        
        while (true) {
            
            if (input == 0) break; // input이 0이면 반복 종료
            
            sum = sum + (input % 10) * di; // 끝자리 숫자 × 자리값을 sum에 더함
            di = di * 2;                   // 자리값 2배 증가 (1→2→4→8→16→32)
            input = input / 10;            // 끝자리 제거
        }
        
        System.out.println(sum); // 출력: 46
    }
}