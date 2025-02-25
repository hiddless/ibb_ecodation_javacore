package com.hiddless._1_part_javatypes.week3.project_step1_file;

import com.hiddless._1_part_javatypes.ultis.SpecialColor;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class StudentManagementSystem {

    /// Field
    private ArrayList<StudentDto> studentDtoList= new ArrayList<>();
    private int studentCounter = 0;
    private static final String FILE_NAME = "students.txt";

    /// Static
    static {

    }

    /// Parametresiz
    public StudentManagementSystem(){
        loadStudentsListFromFile();
    }

    private void saveToFile(){
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new ObjectOutputStream(new ObjectOutputStream(new FileOutputStream(FILE_NAME))))) {
            objectOutputStream.writeObject(studentDtoList);
        }catch (IOException io) {
            System.out.println(SpecialColor.RED + "Dosya Ekleme Hatası"+ SpecialColor.RESET);
            io.printStackTrace();
        }
    }

    /// Öğrenci Listesini Yükle (Dosya)
    private void loadStudentsListFromFile(){
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_NAME))){
            studentDtoList = (ArrayList<StudentDto>) objectInputStream.readObject();
            studentCounter = studentDtoList.size();
        }catch (FileNotFoundException fileNotFoundException){
            System.out.println(SpecialColor.RED+ "Öğrenci Kaydı Bulunamadı " +SpecialColor.RESET);
            fileNotFoundException.printStackTrace();
        }catch (IOException io) {
            System.out.println(SpecialColor.RED+"Dosya Okuma Hatası"+ SpecialColor.RESET);
            io.printStackTrace();
        }catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /// Öğrenci Ekle
    public void list(){
        // Öğrenci Yoksa
        if (studentDtoList.isEmpty()) {
            System.out.println(SpecialColor.RED+ "Öğrenci Listesi Boş"+SpecialColor.RESET);
            return;
        }else {
            studentDtoList.forEach(System.out::println);
        }
    }

    /// Öğrenci Ara
    public void search(String name){
        studentDtoList.stream()
                .filter(temp -> temp.getName().equalsIgnoreCase(name))
                .forEach(System.out::println);

    }

    /// Öğrenci Güncelle
    public void update(int id, StudentDto dto) {
        for (StudentDto temp : studentDtoList) {
            if (temp.getId() == id) {
                temp.setName(dto.getName());
                temp.setSurname(dto.getSurname());
                temp.setBirthDate(dto.getBirthDate());
                temp.setGrade(dto.getGrade());
                System.out.println(SpecialColor.YELLOW+"Öğrenci Bilgisi Güncellendi"+SpecialColor.RESET);
                saveToFile();
                return;
            }
        }
        System.out.println(SpecialColor.RED+"Böyle Bir Öğrenci Yok"+SpecialColor.RESET);
    }

    /// Öğrenci Sil

    public void delete(int id) {
        studentDtoList.removeIf(temp -> temp.getId() == id);
        System.out.println(SpecialColor.YELLOW+ "Öğrenci Başarıyla Silinmiştir"+SpecialColor.RESET);
        saveToFile();
    }

    //////////////////////////////////////////////////////////////////////////////////

    /// Console Seçimi
    public void chooise(){
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem studentManagementSystem = new StudentManagementSystem();

        // Sonsuz While
        while (true) {
            System.out.println("\n1.Öğrenci Ekle");
            System.out.println("\n2.Öğrenci Listele");
            System.out.println("\n3.Öğrenci Ara");
            System.out.println("\n4.Öğrenci Güncelle");
            System.out.println("\n5.Öğrenci Sil");
            System.out.println("\n6.Öğrenci Toplam Öğrenci Sayısı");
            System.out.println("\n7.Öğrenci rastgele gelsin");
            System.out.println("\n8.Öğrenci Not Hesapla");
            System.out.println("\n9.Öğrenci En Yüksek, En düşük notları göster");
            System.out.println("\n10.Öğrenci Öğrenci Sıralaması Doğum gününe göre");
            System.out.println("\n11.çıkış");
            System.out.println("\nLütfen Seçim Yapınız");

            int chooise= scanner.nextInt();
            scanner.nextLine();
            StudentDto studentDto= new StudentDto();
            String name, surname;
            String birthDate;
            Double grade;

            switch (chooise){
                case 1:
                    System.out.println("Öğrenci Adı");
                    name = scanner.nextLine();
                    System.out.println("Öğrenci Soyadı");
                    surname = scanner.nextLine();
                    System.out.println("Öğrenci Doğum Tarihi");
                    birthDate=scanner.nextLine().toString();
                    System.out.println("Öğrenci Puanı");
                    grade= scanner.nextDouble();
                    studentDto.setId(studentCounter);
                    studentDto.setName(name);
                    studentDto.setSurname(surname);
                    studentDto.setCreatedDate(new Date(System.currentTimeMillis()));
                    studentManagementSystem.add(StudentDto);
                    break;

                case 2:
                    studentManagementSystem.list();
                    break;
            }
        }
    }
}
