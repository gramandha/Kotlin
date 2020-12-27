/*
Single Expression function yaitu deklarasi function hanya dengan 1 baris kode
Untuk membuat single expression function, kita hanya butuh tanda = (sama dengan)
setelah deklarasi nama function dan tipe data pengembalian function
 */

 fun kaliDua(a: Int): Int = a*2

 fun panggil(nama: String): Unit = println("Saya $nama")

 fun main(){
     println(kaliDua(2))
     println(panggil("Gramandha"))
 }
