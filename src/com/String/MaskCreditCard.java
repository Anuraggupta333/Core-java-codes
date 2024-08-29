package com.String;

/**
 * MaskCreditCard
 */
public class MaskCreditCard {
   static String x = "xxxx-xxxx-xxxx-";

    public static String mask( String creditcard){
        // return x+creditcard.substring(15, 19);
        StringBuffer sb = new StringBuffer(x);
            sb.append(creditcard.substring(15));
            return sb.toString();

    }

    public static void main(String[] args) {
        System.out.println(mask("0538241300136915647"));
    }
}