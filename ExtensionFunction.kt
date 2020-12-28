/*
Extension Function digunakan untuk menambah tipe data yang sudah ada
untuk membuat extension function, kita cukup menambahkan tipe data pada functionnya
lalu diikuti denga tanda titik (.)
untuk mengakses datanya di extension function kita bisa menggunakan kata kunci this
 */

fun String.hello(): String = "Hello $this"

fun String.helloGaes(): Unit = println("Hello $this")

fun String.coba(): String{
    var saya = "Saya $this"
    return saya
}

fun String.coba2(){
    println("Saya $this")
}

fun main(){
    val name = "Wega"

    println(name.hello())
    name.helloGaes()

    "Gramandha".helloGaes()
    println("Prima".coba())
    "Dono".coba2()
}
