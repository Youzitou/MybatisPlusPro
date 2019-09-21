/*
 * Nothing is impossible to a willing heart
 */

package com.lyy.interview;

import java.util.Scanner;

/**
 * @autohor liuyouyun
 * @date 2019/9/21 - 22:59
 */
public class TestBonusByInterest {

        public static void main(String[] args) {
            Scanner sc= new Scanner (System.in);
            System.out.println("请输入当月利润：(万元)");
            // 利润
            double interest = sc.nextDouble();
            // 奖金
            double bonus =0.0;
            if(interest >0 && interest <=10){
                bonus= interest *0.1;
            }else if(interest >10 && interest <=20 ){
                bonus = 10*0.1 + (interest -10)*0.075;
            }else if(interest >20 && interest <=40 ){
                bonus = 10*0.1 + 10*0.075 + (interest -20)*0.05;
            }else if(interest >40 && interest <=60){
                bonus = 10*0.1 + 10*0.075 + 20*0.05 + (interest -40)*0.03;
            }else if(interest >60 && interest <=100){
                bonus =  10*0.1 + 10*0.075 + 20*0.05 + 20*0.03 + (interest -60)*0.015;
            }else if( interest >100){
                bonus =  10*0.1 + 10*0.075 + 20*0.05 + 20*0.03 + 40*0.015 + (interest -100)*0.01;
            }else{
                System.out.println("奖金不在此范围以内");
            }
            System.out.println("本月奖金："+bonus+"万元");
        }


}
