# Tugas Pertemuan 6  
Tugas latihan untuk materi Pemilihan.   
## 1. Flowchart dan Pseudocode Sistem Akses Parkir
1.1. Flowchart
     
![Flowchart](https://github.com/dhafirtibast/TeoriDaspro/blob/main/Pertemuan_6/Screenshot%202025-10-06%20221012.png "Flowchart Sistem Akses Parkir")   
    
1.2. Pseudocode
   
     START   
   
       // Deklarasi variabel   
       DECLARE bawa_kartu AS BOOLEAN   
       DECLARE registrasi_online AS BOOLEAN   
   
       // menerima input    
       INPUT "Apakah Anda membawa kartu mahasiswa? (true/false)": bawa_kartu    
       INPUT "Apakah Anda sudah registrasi online? (true/false)": registrasi_online   
   
       // kondisi   
       IF bawa_kartu IS TRUE OR registrasi_online IS TRUE THEN    
         PRINT "akses diberikan, silakan masuk."   
       ELSE     
         PRINT "Akses tidak diberikan."   
       ENDIF   
   
     END         

## 2. Flowchart dan Pseudocode Sistem Akses WiFi    
2.1. Flowchart   

   <img width="742" height="859" alt="Screenshot 2025-10-06 234053" src="https://github.com/user-attachments/assets/1006e61c-e900-4156-a1cb-421ade1f5cea" />

2.2. Pseudocode
   
     START   
    
        // Deklarasi variabel yang akan digunakan   
        DECLARE status AS STRING   
        DECLARE sks AS INTEGER   
   
        // Meminta input status user   
        PRINT "Masukkan status Anda (dosen/mahasiswa):"   
        INPUT status   
   
        // Memeriksa status user   
        // Kondisi pertama  
        IF status IS EQUAL TO "dosen" THEN   
          PRINT "Akses WiFi diberikan (dosen)"   
   
        // Kondisi kedua   
        ELSE IF status IS EQUAL TO "mahasiswa" THEN   
            PRINT "Masukkan jumlah SKS Anda:"   
        INPUT sks   
   
        // Periksa kondisi   
        IF sks >= 12 THEN   
        PRINT "Akses WiFi diberikan (mahasiswa aktif)"   
        ELSE   
        PRINT "Akses ditolak, SKS kurang dari 12"   
        END IF   
    
        // Kondisi ketiga  
        ELSE   
        PRINT "Akses ditolak"   
        END IF   
    
    END    
