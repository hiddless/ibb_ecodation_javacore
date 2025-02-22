package com.hiddless._1_part_javatypes.week3;

import com.hiddless._1_part_javatypes.ultis.SpecialColor;

import java.util.Date;
import java.util.Objects;

public class _05_Class_BEAN {

    private Long id;
    private String name;
    private String surname;
    private Date createdDate;

    public _05_Class_BEAN() {
        id = 0L;
        name = "isim alanını yaz";
        surname = "Soyismini yaz";
        this.createdDate = new Date(System.currentTimeMillis());
    }

    public _05_Class_BEAN(Long id, String name, String surname, Date createdDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.createdDate = createdDate;
    }

    // Parametreli

    public _05_Class_BEAN(String name, String surname) {
        id = 0L;
        this.name = name;
        this.surname = surname;
        this.createdDate = new Date(System.currentTimeMillis());
    }

    // metot
    public String toString() {
        return "_05_Class_BEAN{" + "id=" + id + ", name=" + name + '\'' + ", surname=" + surname + '\'' + ", createdDate=" + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        _05_Class_BEAN bean = (_05_Class_BEAN) o;
        return Objects.equals(id, bean.id) && Objects.equals(name, bean.name) && Objects.equals(surname, bean.surname) && Objects.equals(createdDate, bean.createdDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, createdDate);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalAccessException {
        if (name != null && name.matches(".*[.,!?;:]+.*")) {
            System.out.println(SpecialColor.RED + "İsimde noktalama işaretleri var, noktalama işaretinden sonraki harfler silindi" + SpecialColor.RESET);
            name = name.replaceAll("[.,!?;:].*", "");
            System.out.println(name);
        }
        if (name != null && !name.isEmpty()) {
            this.name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        } else {
            this.name = name;
        }
    }

    public void setSurname(String surname) {

        if (!name.matches("[a-zA-ZğüşıöçĞÜŞİÖÇ]+")) {
            throw new IllegalArgumentException("İsim sadece harf içermelidir!");
        } else if (surname != null && surname.length() >= 3) {
            //this.surname="MIZ***";
            this.surname = surname.substring(0, 3).toUpperCase() + "*".repeat(surname.length() - 3);

        } else if (surname != null) {
            this.surname = surname.toUpperCase();
        } else {
            this.surname = "";
        }
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public static void main(String[] args) throws IllegalAccessException {
        _05_Class_BEAN bean1 = new _05_Class_BEAN();
        bean1.setId(1L);
        bean1.setName("Sophie");
        bean1.setSurname("Hiddles");

        System.out.println(SpecialColor.PURPLE + " " + bean1 + " " + SpecialColor.RESET);

    }
}
