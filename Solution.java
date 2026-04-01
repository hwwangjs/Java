import java.util.Scanner;

public class Solution {
    public static void main(String [] args){
        //대소문자 바꿔서 출력하기
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char b;
        String answer="";

        for(int i = 0; i < a.length(); i++){
            b =a.charAt(i); //문자열에서 문자 하나만 가져오는 함수
            if(Character.isUpperCase(b)){ //Character.isUpperCase() 대문자 확인 함수
                answer += Character.toLowerCase(b); //Character.toLowerCase() 소문자 변경 함수 
            }else{
                answer += Character.toUpperCase(b); //Character.toUpperCase() 대문자 변경 함수 
            }
        }
        System.out.println(answer);
    }
}
