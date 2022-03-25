package com.pluralsight.Youtube30Questions;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {

        /**random numbers approach_1*/
        Random rand = new Random();
        int a=rand.nextInt(10);
        System.out.println(a);

        /**random Strings*/
        String str = RandomStringUtils.randomAlphabetic(5);
        System.out.println(str);

    }
}
