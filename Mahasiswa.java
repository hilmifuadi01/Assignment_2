package Program_Data_Mahasiswa;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private String major;
    private int semester;
    private int year;
    private String gender;

    public Student(int id, String name, String major, int semester, int year, String gender) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.semester = semester;
        this.year = year;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "ID: " + id + "\nName: " + name + "\nMajor: " + major + "\nSemester: " + semester +
                "\nYear: " + year + "\nGender: " + gender;
    }
}

public class Mahasiswa {
    public static void main(String[] args) {
        HashMap<Integer, String> Mahasiswa = new HashMap<Integer, String>();

        Mahasiswa.put(001,"Hilmi,Physics,1,2023,Male");
        Mahasiswa.put(002,"Isna,Physics,1,2023,Female");
        Mahasiswa.put(003,"Riska,Physics,1,2023,Female");
        Mahasiswa.put(004,"Devi,Physics,1,2023,Female");
        Mahasiswa.put(005,"Istian,Physics,1,2023,Male");
        Mahasiswa.put(006,"Adi,Physics,1,2023,Male");

        System.out.println(001 +Mahasiswa.get(001));

        int ID, semester, year, pilih;
        String name, major, gender;

        Scanner inputUser = new Scanner(System.in);
        int ch;
        do {
            System.out.println("STUDENT DATA");
            System.out.println("======================");
            System.out.println("\nMenu");
            System.out.println("1. Add Data Mahasiswa");
            System.out.println("2. Update Data Mahasiswa");
            System.out.println("3. See All Data Mahasiswa");
            System.out.println("4. See Data Mahasiswa Berdasarkan ID");
            System.out.println("5. Exit");
            System.out.print("\nEnter Your Choice: ");
            pilih = inputUser.nextInt();
            inputUser.nextLine();
            ch = inputUser.nextInt();

                    switch (pilih) {
                        case 1:
                            // Add data mahasiswa
                            System.out.print("ID: ");
                            ID = inputUser.nextInt();
                            inputUser.nextLine();
                            System.out.print("Name: ");
                            name = inputUser.nextLine();
                            System.out.print("Major: ");
                            major = inputUser.nextLine();
                            System.out.print("Semester: ");
                            semester = inputUser.nextInt();
                            inputUser.nextLine();
                            System.out.print("Year: ");
                            year = inputUser.nextInt();
                            inputUser.nextLine();
                            System.out.print("Gender: ");
                            gender = inputUser.nextLine();

                            Mahasiswa newStudent = new Mahasiswa();
                            Mahasiswa.get(newStudent);
                            System.out.println("Data Mahasiswa berhasil ditambahkan.");
                            break;
                        case 2:
                            // Update Data Mahasiswa
                            System.out.print("Masukkan ID Mahasiswa yang ingin diupdate: ");
                            int updateID = inputUser.nextInt();
                            inputUser.nextLine();

                            if (Mahasiswa.containsKey(updateID)) {
                                System.out.print("Nama: ");
                                String updatedName = inputUser.nextLine();
                                System.out.print("Jurusan: ");
                                String updatedMajor = inputUser.nextLine();
                                System.out.print("Semester: ");
                                int updatedSemester = inputUser.nextInt();
                                inputUser.nextLine();
                                System.out.print("Tahun: ");
                                int updatedYear = inputUser.nextInt();
                                inputUser.nextLine();
                                System.out.print("Jenis Kelamin: ");
                                String updatedGender = inputUser.nextLine();

                                Mahasiswa.put(updateID, "Nama: " + updatedName + ", Jurusan: " + updatedMajor + ", Semester: " + updatedSemester + ", Tahun: " + updatedYear + ", Jenis Kelamin: " + updatedGender);
                                System.out.println("Data Mahasiswa berhasil diupdate.");
                            } else {
                                System.out.println("Mahasiswa dengan ID " + updateID + " tidak ditemukan.");
                            }
                            break;

                        case 3 :
                            // See All Data Mahasiswa
                            System.out.println("Data Mahasiswa:");
                            for (Map.Entry<Integer, String> entry : Mahasiswa.entrySet()) {
                                int id = entry.getKey();
                                String data = entry.getValue();
                                System.out.println("ID: " + id + ", " + data);
                            }
                            break;
                        case 4 :
                            // See Data mahasiswa Berdasarkan ID
                            System.out.print("Masukkan ID Mahasiswa yang ingin ditampilkan: ");
                            int viewId = inputUser.nextInt();
                            inputUser.nextLine();
                            String studentData = Mahasiswa.get(viewId);
                            if (studentData != null) {
                                System.out.println("\nData Detail:");
                                System.out.println("ID: " + viewId);
                                System.out.println(studentData);
                            } else {
                                System.out.println("Mahasiswa dengan ID " + viewId + " tidak ditemukan.");
                            }
                            break;
                        case 5:
                            // Exit
                            System.out.println("Keluar dari program.");
                            inputUser.close();
                            System.exit(0);
                            break;

                        default:
                            System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                            break;

                            }
                            

        } while (ch!=0);
    }

    private String getGender() {
        return null;
    }

    private int getYear() {
        return 0;
    }

    private String getSemester() {
        return null;
    }

    private String getMajor() {
        return null;
    }

    // See All data
    private String getName() {
        return null;

    }
// update data
    private String setGender(String updatedGender) {
        return null;
    }
    private int setYear(int updatedYear) {
        return 0;
    }

    private int setSemester(int updatedSemester) {
        return 0;
    }

    private String setMajor(String updatedMajor) {
        return null;
    }

    private String setName(String updatedName) {
        return null;
    }
    private int getID() {
        return 0;
    }

    }




