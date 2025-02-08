package com.hiddless._1_part_javatypes;

public class _05_WrapperTypes {
    public static void main(String[] args) {
        // WRAPPER TYPE (new varsa)
        Byte wrapperTypeByte = new Byte((byte)127);
        Short wrapperTypeShort = new Short((short)32767);

        // Primitive => Wrapper Type dönüştürmek
        int primitiveValue = 100;
        Integer wrapperValue = primitiveValue;
        System.out.println("Wrapper Integer: " + wrapperValue);

    }
}
