import java.util.*;
public class 자릿수더하기 {
    public int 자릿수더하기(int num) {
        int answer = 0;
        String strNum = Integer.toString(num);
        for (int i = 0; i < strNum.length(); i++) {
            System.out.println(strNum.charAt(i));
            answer += strNum.charAt(i) - '0';
            // charAt이란 string 타입으로 받은 문자열을 char 타입으로 한 글자만 받게 해주는 함수이다.
            // 숫자형 문자를 CharAt함수로 추출하면  char형이므로 int 형으로 변환하려하면 아스키코드로 변환된다.
            //따라서 '0' 또는 48을 빼주어야 의도한대로 계산할 수 있다.
        }
        System.out.print(answer);
        return answer;
    }
}
