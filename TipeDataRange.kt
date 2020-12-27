/*
membuat data array yang isinya berurutan

nama_variable.count() : mendapatkan total data di range
nama_variable.contains(value) : mengeceka apakah terdapat value tersebut
nama_variable.first :mendapatkan nilai awal
nama_variable.last : mendapatkan nilai akhir
nama_variable.step : untuk tiap kenaikan
 */

fun main() {

    val range = 1..100 step 5
    val range2 = 100 downTo 1 step 3

    println(range.count())
    println(range.contains(70))
    println(range.contains(119))
    println(range.first)
    println(range.last)
    println(range.step)


    println(range2.count())
    println(range2.contains(70))
    println(range2.contains(119))
    println(range2.first)
    println(range2.last)
    println(range2.step)
    
}