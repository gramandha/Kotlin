/*
Function Varargs Parameter
Varags merupakan datanya lebih dari satu input atau semacam array
  -parameter tipe data Array, kita wajib membuat array dahulu sebelum mengirim ke function
  -jika parameter menggunakan varargs, kita bisa langsung mengirim datanya, 
   jika lebih dari satu cukup gunkan tanda koma   
  -untuk penggunaan parameter varargs dilakukan pade akhir tiap parameter (contoh di fun Coba)
 */

/* fun hitungTotal(aA: Array<Int>): Int{
   var c = 0

    for (a in aA){
       c += a 
    }

    return c
   
}

fun main() {
    val nilai = arrayOf(10, 10, 10, 10)
    val tot = hitungTotal(nilai)

    println(tot)    
} */

/* fun jumlahTotal(vararg tot: Int): Int{
    var i = 0
    for(n in tot){
        i += n
    }
    return i
}

fun main() {
    val hasil = jumlahTotal(5, 10, 6)
    println(hasil)
} */

fun coba(nilai1: String, vararg nilai2: Int ): Int{
    var t = 0
    for (i in nilai2) {
        t += i
    }

    return t
}

fun main(){
    val gas = coba("Matematika", 10, 10)
    println(gas)
}