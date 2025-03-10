package com.hiddless.tutorials._2_week;

public class _15_Cast {
    public static void main(String[] args) {

        // 1-) Widening Cast - Implict Cast
        byte cast1Byte = 100;
        int cast1Int = cast1Byte;
        System.out.println(cast1Int);

        // 2-) Narrowing Cast - Explicit cast
        int cast2Int=99999984;
        byte cast2Byte= (byte) cast2Int;
        System.out.println(cast2Byte);

        // 3-) char ==> Int
        char cast3Char= 'A';
        int ascii=cast3Char;
        System.out.println(cast3Char+" harfi ascii olarak karşılığı: "+ascii);

        int cast3Int=65;
        char ascii2= (char) cast3Int;
        System.out.println(cast3Int+"ascii karşılığı: "+ascii2);

        // 4-) String => int
        String castString4="10";
        int cast4Int=Integer.valueOf(castString4);
        int cast4Int2=Integer.parseInt(castString4);
        System.out.println(cast4Int2+20);
        System.out.println(castString4+20);
        System.out.println(cast4Int+20);

        // 5-) Int ==> String
        int cast5Int=45;
        String cast5String1=String.valueOf(cast5Int);
        String cast5String2=cast5String1.toString();
        System.out.println(cast5String1);
        System.out.println(cast5String2);




    }
}
