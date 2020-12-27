/*
function default parameter
merupakan function yang memiliki parameter default
jadi kita tidak wajib memasukkan nilai pada parameternya
ex: parm : String = "" <- default kosong
 */
fun hello(nama_pertama: String, nama_kedua: String= ""){
    println(println("Nama saya $nama_pertama $nama_kedua"))
}


fun main() {
    hello("Gramandha")
    hello("Vika","Octaviani")   
}