/*
Infix Notation merupakan operasi yang dilakukan di matematika, dilakukan operasi terhadap dua data
Hampir semua operasi matematika ada di infix notation
kita juga bisa membuat function notation
jika menggunkan function infix notation tidak wajib menggunakan tanda titik (.)

Syarat Function Infix Notation
-Harus sebagai function member(akan dibahas di OOP) atau function extention
-Harus memiliki 1 paramter
-Parameter tidak boleh varargs dan tidak boleh memiliki nilai default
 */

infix fun String.to(dataku : String): String {
    if(dataku == "UP"){
        return this.toUpperCase()
    }else{
        return this.toLowerCase()
    }
}

fun main(){

    val tampilkan = "Gramandha Wega" to "UP"
    println(tampilkan)
}