package com.hiddless._1_part_javatypes.week3.accessModifier;

import com.hiddless._1_part_javatypes.ultis.SpecialColor;
import com.hiddless._1_part_javatypes.week3.Week3_02_Access_1_PublicAccessModifier;

public class AllAccessModifier {
    public static void main(String[] args) {
        Week3_02_Access_1_PublicAccessModifier accessModifier = new Week3_02_Access_1_PublicAccessModifier();
        System.out.println(SpecialColor.BLUE + accessModifier.publicData + SpecialColor.RESET);
        //System.out.println(SpecialColor.YELLOW+accessModifier.defaultData+SpecialColor.RESET);
        //System.out.println(SpecialColor.PURPLE+accessModifier.protectedData+SpecialColor.RESET);
        //System.out.println(SpecialColor.RED+accessModifier.privateData+SpecialColor.RESET);
    }
}
