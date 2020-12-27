/*
break untuk menghentikan perintah pada kondisi true
continue untuk menghentikan perintah dan melajutkan selanjutnya
Continue = skip
 */

fun main() {
    var i = 0
    // while(true){
    //     println(i)
    //     i++
    //     if(i>10){
    //         break
    //     }
    //}

    for(i in 1..10){
        if(i % 2 == 0){
            continue
        }
        println("Angka $i")
    }
}