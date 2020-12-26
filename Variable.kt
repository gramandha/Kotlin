/*
var: varible yang mutable atau bisa berubah-ubah
val: varible yang imutable atau tidak bisa diubah2
**direkomendasikan menggunakan tipe data immutable jika tidak membutuhkan perubahan
? digunakan jika variable benilai null atau tidak berisi
const digunakan untuk variable yang bisa di akses pada class lain tetapi harus bersifat immutable (val)
 */

 const val kota = "Jakarata"
 var lahir = "Jember"

 fun main(){
        var laki = "Dina"
        laki = "Jono"

        println(laki)

        var dana: String? = "Eko"
        dana = null
             println(dana)
             println(dana?.length)

             println(kota)
             punya()
    
 }

 fun punya(){
      println(lahir)
 }