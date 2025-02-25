package com.hiddless._1_part_javatypes.week3.project_step2_file;

import com.hiddless._1_part_javatypes.ultis.SpecialColor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode

public class StudentDto implements Serializable {

    /// Serileştirme
    private static final long serialVersionUID = 556364556456565465L;

    /// File
    private Integer id;
    private String name;
    private String surname;
    private EStudentType eStudentType;
    private Double midTerm;
    private Double finalTerm;
    private Double resultTerm;
    private LocalDate birthDate;
    private Date createdDate;

    /// static
    static {
        System.out.println(SpecialColor.BLUE+ "static StudentDto Yüklendi"+SpecialColor.RESET);
    }

    /// Parametresiz Constructer
    public StudentDto() {
    }

    /// Parametreli Constructer
    public StudentDto(Integer id, String name, String surname, Double midTerm, Double finalTerm, LocalDate birthDate, EStudentType eStudentType) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.midTerm = midTerm;
        this.finalTerm = finalTerm;
        this.birthDate = birthDate;
        this.createdDate = new Date(System.currentTimeMillis());
        this.resultTerm= calculateResult();
        this.eStudentType = eStudentType;
    }

    /// Metotlar
    // Vize ve Final Calculate
    private Double calculateResult(){
        if (midTerm==null || finalTerm==null)
            return 0.0;
        else
            return (midTerm*0.4+finalTerm*0.6);
    }

    // Getter and Setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public LocalDate getBirthDate(){
        return birthDate;
    }
    public Date getCreatedDate() {
        return createdDate;
    }
    public void setBirthDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Double getMidTerm() {
        return midTerm;
    }

    public void setMidTerm(Double midTerm){
        this.midTerm= midTerm;
        this.resultTerm= calculateResult();
    }

    public Double getFinalTerm() {
        return finalTerm;
    }

    public void setFinalTerm(Double finalTerm) {
        this.finalTerm = finalTerm;
        this.resultTerm = calculateResult();
    }

    public Double getResultTerm() {
        return resultTerm;
    }

    public void setResultTerm(Double resultTerm) {
        this.resultTerm = resultTerm;
    }

    public EStudentType geteStudentType(){
        return eStudentType;
    }

    public void seteStudentType(EStudentType eStudentType) {
        this.eStudentType = eStudentType;
    }
}
