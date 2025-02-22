package com.hiddless._1_part_javatypes.week3;

import com.hiddless._1_part_javatypes.ultis.SpecialColor;

public class _02_POJO {
    private String name;
    private String surname;

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname.toUpperCase();
    }

    public static void main(String[] args) {
        _02_POJO pojo= new _02_POJO();
        pojo.setName("Sophie");
        pojo.setSurname("Hiddles");
        String nameAndSurname=pojo.getName().toString()+" "+pojo.getSurname().toString();
        System.out.println(SpecialColor.CYAN +nameAndSurname+SpecialColor.RESET);


    }
}
