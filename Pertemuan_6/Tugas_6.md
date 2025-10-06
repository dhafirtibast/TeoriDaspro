# Tugas Pertemuan 6  
Tugas latihan untuk materi Pemilihan.   
## 1. Flowchart dan Pseudocode Sistem Akses Parkir
1. Flowchart
![Flowchart]( "Flowchart Sistem Akses Parkir")
2. Pseudocode    
START   
   
  // Deklarasi variabel   
  DECLARE bawa_kartu AS BOOLEAN   
  DECLARE registrasi_online AS BOOLEAN   
   
  // menerima input    
  INPUT "Apakah Anda membawa kartu mahasiswa? (true/false)": bawa_kartu    
  INPUT "Apakah Anda sudah registrasi online? (true/false)": registrasi_online   
   
  // kondisi   
  IF bawa_kartu IS TRUE OR registrasi_online IS TRUE THEN    
    // Jika salah satu atau kedua syarat terpenuhi   
    PRINT "akses diberikan, silakan masuk."   
  ELSE   
    // Jika kedua syarat tidak terpenuhi   
    PRINT "Akses tidak diberikan."   
  ENDIF   
   
END   

