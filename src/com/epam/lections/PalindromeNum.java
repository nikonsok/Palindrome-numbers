package com.epam.lections;

public class PalindromeNum {
    public static void main(String[] args) {
        IsPalNum(0);
    }
    public static void IsPalNum (int x) {
        int del_num,sum=0,temp_num;
        temp_num=x;
        while(temp_num>0){
            del_num=temp_num%10;
            sum=(sum*10)+del_num;
            temp_num=temp_num/10;
        }
        if(temp_num==sum)
            System.out.println(x + " is palindrome number");
        else
            System.out.println(x + " isn't palindrome number");
    }
    }


