/*
&& dan
|| atau
! kebalikan

Operasi &&
1 && 1 -> 1
1 && 0 -> 0
0 && 1 -> 0
0 && 0 -> 0

Operasi ||
1 || 1 -> 1
1 || 0 -> 1
0 || 1 -> 1
0 | 0 -> 0

Operasi !
!0 -> 1
!1 -> 0

 */

 fun main() {
     val nilaiA = 88
     val nilaiB = 80

     val syaratLulusA = nilaiA > 75 
     val syaratLulusB = nilaiB > 75 

    //jika operasi bolean lebih dari satu maka dilakukan yang pertama kemudian selanjutnya
    //ex: a && b && c -> (a && b) && c
    val nilaiAkhir = syaratLulusA && syaratLulusB
    println(nilaiAkhir)

 }
 