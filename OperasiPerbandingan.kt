/*
operasi perbandingan merupakan operasi untuk membandingkan dua buah data
operasi perbandingan menghasilkan nilai boolean (benar atau salah)
jika hasil operasinya benar maka true
jika hasil operasinya salah maka false

> lebih dari
< kurang dari
>= lebih dari sama dengan
<= kuranga dari sama dengan
== sama dengan
!= tidak sama dengan
 */

fun main() {
    val a = 100 
    val b = 200

    val hasil: Boolean = a<b
    println(hasil)

    println(a == b)
    println("a" == "b")
    println("a" != "b")
    
}