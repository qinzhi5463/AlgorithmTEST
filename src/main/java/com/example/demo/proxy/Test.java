package com.example.demo.proxy;

public class Test {

    public static void main(String[] args) {
        BigStar bigStar =new BigStar("蔡徐坤");
        Star proxy = ProxyUtil.createProxy(bigStar);

        String sing = proxy.sing("只因你太美");
        System.out.println(sing);


        proxy.dance();
    }





}
