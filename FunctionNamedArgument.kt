/*
fitur dimana kita bisa menyebutkan nama parameter saat memanggil functionnya,
dengan demikian kita tidak wajib tahu posisi tiap parameter

 */

 fun namaLengkap(namaPertama: String, 
    namaKedua: String = "",
    namaKetiga: String = "")
    {
        println("Hello $namaPertama $namaKedua $namaKetiga")
 }

 fun main(){
     namaLengkap("Gramandha", "Wega", "Intyanto")
     namaLengkap(
         namaPertama = "Vika",
         namaKedua = "Octaviani"
     )
 }