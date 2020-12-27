/*
Seperti yang sudah dibahas sebelumnya, bahwa function itu tudak bisa mengembalikan data
Untuk memberitahu bahwa function mengembalikan data, kita harus menuliskan tipe data kembalian dari function tsb
Jika function tsb tidak deklarasikan dengan tipe data pengembalian,
,maka wajib functionnya kita harus mengebalikan data
Untuk mengembalikan data dari function, kita bisa menggunakan kata kunci return
diikuti dengan datanya
 */


 fun penjumlahan (a : Int, b: Int): Int{
     val total = a + b
     return total
 }

fun pembagian(a: Int, b:Int): Int{
    if(b == 0){
        return 0
    }else{
        val hasil = a/b
        return hasil
    }
   
}

 fun main(){
    println(penjumlahan(10,10))

    val hasil = penjumlahan(20,20)
    println(hasil)

    println(pembagian(10,0))
 }