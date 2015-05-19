package oop02.encapsule;

import java.util.Scanner;

public class RpsController {
 public static void main(String[] args) {
  RpsService service = new RpsService();
  RpsUtill utill = new RpsUtill();
  
  System.out.println("가위바위보 게임을 시작합니다.");
  System.out.println("1.가위 2.바위 3.보자기 를 입력하세요.");  
  Scanner scanner = new Scanner(System.in);
  int playerVal = scanner.nextInt();
  
  if( !(playerVal >= 1 && playerVal <=3)){
   System.out.println(utill.showRange(1, 3));
   scanner.close();
   return; // main 에서 return 값이 없기 때문에 메인 종료
  }
  System.out.println("플레이어는 "+ service.showRpsVal(playerVal) +"를 냈습니다.");
  int comVal = service.displayComVal();
  
  System.out.println("컴퓨터는 "+ service.showRpsVal(comVal) +"를 냈습니다.");
  String winner = service.showWinner(playerVal,comVal);
  System.out.println(winner);
  scanner.close();
 }
}