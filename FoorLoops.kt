//For digunakan untuk perulangan iterasi dari data iterator(Array, Range, dsb) 

fun main() {

    val dataku = arrayOf("Wega", "Ilham", "Binar")

    var perulangan = 0
    for(d in dataku){
        println(d)
        perulangan++
    }
    println("Total perulangan : $perulangan")
    println("Total perulangan : "+perulangan)

    for(a in 0..90 step 10){
        println(a)
    }

    val ukuranDataku = dataku.size - 1
    for( c in 0..ukuranDataku){
        println(dataku[c])
        println(dataku.get(c))
    }
}