/*If Expression
if merupakan salah satu kunci yang digunkan dalam percabangan
Percabangan yang dimaksud yaitu mengeksekusi perintah atau kondisi yang terpenuhi
 */


 fun main() {
     val nilai = 65
     if(nilai > 80){
        println("Lulus")
     }else if (nilai <= 80 && nilai >= 65){ // kondisi penilaian dianatara =65 s.d  =80
         println("Remidi")
     }else{
         println("Tidak Lulus")
     }

 }