package com.hiddless._1_part_javatypes.week3.project_step1_file;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode

public class StudentDto implements Serializable {

    /// Serileştirmek için
    private static final long serialVersionUID=5563646556456565465L;

    /// Field
    private Integer id;
    private String name;
    private String surname;
    private LocalDate birthDate;
    private Date createdDate;
    private Double grade;

    static {

    }

    /// Parametresiz Constructure

    public StudentDto(Integer id, String name, String surname, LocalDate birthDate, Double grade) {
        this.id =id;
        this.name= name;
        this.surname= surname;
        this.birthDate=birthDate;
        this.grade=grade;
    }

    public StudentDto() {
        
    }

    /// Metotlar

    // Getter and Setter

    public Integer getId(){
        return id;
    }

    public void setId(Integer id) {
        this.id= id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name= name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname= surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate){
        this.birthDate= birthDate;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade){
        this.grade= grade;
    }


    public void setCreatedDate(Date date) {
    }
}
