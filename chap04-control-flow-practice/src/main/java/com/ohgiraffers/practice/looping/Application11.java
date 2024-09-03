package com.ohgiraffers.practice.looping;

import java.util.Scanner;

public class Application11 {

    public static void main(String[] args) {

        /* 받은 금액을 입력 받고, 상품 가격을 입력 받아 거스름돈을 계산하는 프로그램을 작성하세요
         *
         * 단, 거스름돈은 대한민국 화폐 단위 별 필요 수량이 출력되도록 작성하고,
         * 지폐외 동전을 구분하여 단위를 표기하세요.
         *
         * -- 입력 예시 --
         * 받으신 금액을 입력하세요 : 100000
         * 상품 가격을 입력하세요 : 22340
         *
         * -- 출력 예시 --
         * ============================
         * 50000원권 지폐 1장
         * 10000원권 지폐 2장
         * 5000원권 지폐 1장
         * 1000원권 지폐 2장
         * 500원권 동전 1개
         * 100원권 동전 1개
         * 50원권 동전 1개
         * 10원권 동전 1개
         * ============================
         * 거스름돈 : 77660원
         * */

        Scanner sc = new Scanner(System.in);

        System.out.print("받으신 금액을 입력하세요 : ");
        int input = sc.nextInt();

        System.out.print("상품 가격을 입력하세요 : ");
        int price = sc.nextInt();

        int charge = input -price;

        int pay50000 = charge / 50000;
        charge = charge % 50000;

        int pay10000 = charge / 10000;
        charge = charge % 10000;

        int pay5000 = charge / 5000;
        charge = charge % 5000;

        int pay1000 = charge / 1000;
        charge = charge % 1000;

        int pay500 = charge / 500;
        charge = charge % 500;

        int pay100 = charge / 100;
        charge = charge % 100;

        int pay50 = charge / 50;
        charge = charge % 50;

        int pay10 = charge / 10;

        System.out.println("50000원권 지폐 " + pay50000 + "장");
        System.out.println("10000원권 지폐 " + pay10000 + "장");
        System.out.println("5000원권 지폐 " + pay5000 + "장");
        System.out.println("1000원권 지폐 " + pay1000 + "장");
        System.out.println("500원권 동전 " + pay500 + "장");
        System.out.println("100원권 동전 " + pay100 + "장");
        System.out.println("50원권 동전 " + pay50 + "장");
        System.out.println("10원권 동전 " + pay10 + "장");

        System.out.println("거스름돈 : " + (input-price) + "원");

    }

}
