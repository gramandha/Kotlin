/*
tipe data Arry
val nama_variable : Array<String> = arrayof("data1","data2","data3")

untuk mengetahui ukuran
nama_variabel.size           : mendapatkan panjang array
nama_variabel.get(index)     : mendapatkan data di posisi index
nama_variable[index]         : mendapatkan data di posisi index
nama_variable(index, value)  : mengubah data di posisi index
nama_variable[index] = value : mengubah data di posisi index

    //kondisi array bisa bernilai null
    val name_variable : Array<tipeData?> = arrayOfNulls(sizeofArray)

 */
fun main(){
    val kelompok : Array<String> = arrayOf("Dono", "Kasino", "Indor")

    //merubah array
    kelompok[1] = "Jaka"
    kelompok.set(2, "Binar")

    //menampilkan nilai data pada attay pada index ke ...
    println(kelompok[0])
    println(kelompok[1])
    println(kelompok[2])
    //ukuran array
    println(kelompok.size)

    //kondisi array bisa bernilai null
    val kota : Array<String?> = arrayOfNulls(4)

    //merubah/set array
    kota[0] = "Jakarta"
    kota[2] = "Bimnomo"

    println(kota[0])


}