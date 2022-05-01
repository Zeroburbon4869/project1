
import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("회원가입");
        System.out.println("--------");
        System.out.println("아이디를 등록해주세요");
        String re_ID = scanner.nextLine();
        System.out.println("등록되었습니다");
        System.out.println("--------");
        System.out.println("비밀번호를 입력해주세요");
        String re_PW = scanner.nextLine();
        System.out.println("등록되었습니다");
        System.out.println("--------");

        System.out.println();
        System.out.println("로그인");
        System.out.println("아이디를 입력해주세요");
        String log_ID = scanner.nextLine();
        System.out.println("--------");
        System.out.println("비밀번호를 입력해주세요");
        String log_PW = scanner.nextLine();
        System.out.println("--------");

        if(re_ID.equals(log_ID) && (re_PW.equals(log_PW))){
            System.out.println("로그인되었습니다");
        }else if((re_ID.equals(log_ID)) && !(re_PW.equals(log_PW))){
            System.out.println("비밀번호를 다시 입력해주세요");
        }else if(!(re_ID.equals(log_ID)) && (re_PW.equals(log_PW))){
            System.out.println("아이디를 다시 입력해주세요");
        }else if(!(re_ID.equals(log_ID)) && !(re_PW.equals(log_PW))){
            System.out.println("아이디와 비밀번호를 다시 입력해주세요");
        }
    }
}
//javalogin
