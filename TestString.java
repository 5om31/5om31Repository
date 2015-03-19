/*
 * Copyright (c) Unistar Corp. 2014. All Rights Reserved.
 * 
 * Unistar DEV Team
 */

/**
 * Title: .TestString.java<br>
 * Description: FIXME TestString.java Description
 * 
 * @author: hjames
 * @version: 1.0
 */
public class TestString {

    public static void main(String[] args) {
        String testString = "abc ";
        System.out.println(testString.split(" ").length);
        System.out.println(testString.trim().contains(" "));
    }

}
