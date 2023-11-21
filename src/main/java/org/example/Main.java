package org.example;
import java.util.*;

public class Main {
    static org.Controller.MainController mainController = new org.Controller.MainController();
    public static void main(String[] args) {


        int selectNumber = 0;
        Scanner in = new Scanner(System.in);

        while(true) {
            mainController.productPrint();
            System.out.println("------------------------------");
            System.out.println("1.상품등록 2.상품검색 3.상품사기 4.흥정하기");
            System.out.println("원하는 번호를 입력해주세요.");
            selectNumber = in.nextInt();
            if(selectNumber == 0){
                System.out.println("0은 종료합니다.");
            }
            //상품등록
            else if(selectNumber == 1){
                System.out.println("-----------------------------");
                System.out.println("등록하실 상품명을 작성해주세요.");
                String productName = in.next();
                System.out.println("상품의 가격을 작성해주세요.");
                int price = in.nextInt();
                System.out.println("현재 상품의 개수를 작성해주세요.");
                int count = in.nextInt();
                mainController.productRegist(productName, price, count);
                System.out.println(mainController.productRegist(productName, price, count)+" 상품이 등록되었습니다.");
            }
            //상품검색
            else if(selectNumber == 2){
                System.out.println("------------------------------");
                System.out.println("가격 검색하실 상품을 적어주세요.");
                String productName = in.next();
                System.out.print("해당 상품의 가격은 ");
                mainController.productCountCheck(productName);
                System.out.println("입니다.");
            }
            //상품사기
            else if(selectNumber == 3){

            }
        }
    }
}