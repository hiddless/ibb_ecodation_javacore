package com.hiddless._1_part_javatypes.week3.project_step2_file;

import com.hiddless._1_part_javatypes.ultis.SpecialColor;

import java.io.*;
import java.util.ArrayList;

public class StudentManagementSystem {

    /// Field
    private ArrayList<StudentDto> studentDtoList = new ArrayList<>();
    private int studentCounter = 0;
    private static final String FILE_NAME = "students.txt";

    /// Static
    static {

    }

    /// Parametresiz
    public StudentManagementSystem() {
        createFileExists();
        loadStudentsListFromFile();
    }

    private void createFileIfNotExists() {
        File file = new File(FILE_NAME)
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println(SpecialColor.BLUE+ "Dosya Oluşturuldu" +SpecialColor.RESET);
            }catch (IOException ioException) {
                System.out.println(SpecialColor.RED+ "Dosya oluştururken Hata!"+SpecialColor.RESET);
                ioException.printStackTrace();
            }

        }
    }

    /// File Create
    private void saveToFile(){
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new ObjectOutputStream())){
            objectOutputStream.writeObject(studentDtoList);
        }catch (IOException io) {
            System.out.println(SpecialColor.RED+"Dosya Ekleme Hatası"+SpecialColor.RESET);
            io.printStackTrace();
        }
    }

    /// File Read
    private void loadStudentsListFromFile() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_NAME))){
            studentDtoList = (ArrayList<StudentDto>) objectInputStream.readObject();
            studentCounter = studentDtoList.size();
            System.out.println(SpecialColor.CYAN+"Dosyadan yüklenen öğrenci sayısı"+SpecialColor.RESET + studentCounter);
        } catch (IOException io) {
            System.out.println(SpecialColor.RED +"Dosya Yükleme Hatası"+SpecialColor.RESET);
            io.printStackTrace();
        }catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    /// Öğrenci Ekle
    public void add(StudentDto) {
        new StudentDto(++studentCounter, dto.getName(),dto.getSurname(), dto.getMidTerm(), dto.getFinalTerm(), dto.getBirthDate(), dto.geteStudentType());
        System.out.println(SpecialColor.YELLOW+ "Öğrenci Eklendi"+ SpecialColor.RESET);
        saveToFile();
    }

    /// Öğrenci Listesi
    public void list(){
        if (studentDtoList)
    }
}
