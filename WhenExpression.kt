/*
hampir sama dengan if
sangat sederhana dan lebih derekomendasikan dari if 
 */
 fun main() {

 //    val nilaiku  = 'B'
/*
     when(nilaiku) {
         'A' -> println("Apik")
         'B' -> println("Lumayan")
         'C' -> println("Biasa")
         'D' -> println("Elek")
         'E' -> println("Elek Pol")
         else -> println("Sinau Sing Genah Le")
     } 
*/
    // when(nilaiku) {
    //     //if(nilai == 'A' || nilai == 'B' || nilai == 'C')
    //     'A', 'B', 'C' -> println("Lulus")
    //     else -> println("Tidak Lulus")
    // }

    // val nilaiSemsester: Array<String> = arrayOf('A', 'B', 'C')

    // when(nilaiku){
    //     in nilaiSemsester -> println("Anda Lulus")
    //     !in nilaiSemsester -> println("Tidak Lulus")
    // }

    val variable = "Wega"
    when(variable){
        is String -> println("variabel is String")
        !is String -> println("variabel isn't String")
    }

    // val valueku: Int = 90
    // when{
    //     valueku <= 65 -> println("elek")
    //     valueku <= 75 -> println("biasa")
    //     valueku <= 85 -> println("lumayan")
    //     else -> println("gas")
    // }
    
 }