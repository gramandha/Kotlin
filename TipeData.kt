fun main() {
//Tipe Data Number
/*
Byte 8 -128 127
Short 16 -32767 32767
Int 32 -2,147,483,648(-2^31) 2,147,483,647(2^31 -1)
Long 64 -9,223,3373,036,854,775,808(-2^63) 9,223,3373,036,854,775,808(2^63-1)
 */

 var umur: Byte = 28
 var jarak: Short = 1231
 var luardaerah : Int = -213123
 var jarakdiantarakita : Long = 2313131321L

 println (umur)
 println (jarak)
 println (luardaerah)
 println (jarakdiantarakita)

//Tipe Data Character
var cobacarakter: Char = 'T'
println(cobacarakter)

//Tipe Data Boolean
var benar: Boolean = true
var salah: Boolean = false
println(benar)
println(salah)

//Tipe String
var nama_pertama: String = "Gramandha"
var nama_kedua: String = "Wega"
var alamat: String ="""Jalan
    Kahuripan AA 3
    Sumbersari
    Jember"""
var alamat2: String = """Lingkunga
|Plelen RT 01/06
|Sidoharjo
|Pacitan""".trimMargin()
//tanda | bisa di rubah dengan simbol lain tetapi pada .trimMargin() harus diubah juga
/*ex: Plelen 
<Sidoharjo
<Pacitan.trimMargin("<")
*/
println(nama_pertama)
println(nama_kedua)
println(alamat)
println(alamat2)
println(nama_pertama+ " "+nama_kedua)
println("$nama_pertama $nama_kedua")
println("${nama_kedua.length}")

}