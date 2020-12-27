/*
+ penjumlahan
- penguraangan
* perkalian
/ pembagian
% sisa bagi


Operasi augmented Assignment
a = a + bilangan | a+=bilangan
a = a - bilangan
a = a * bilangan
a = a / bilangan
a = a % bilangan


Unary Operator
++  a = a+1
--  a = a-1
-   negative
+   positive
!   boolean kebalikan

 */

 fun main() {
     val hasil: Int = 10/3
     println(hasil)

     val math: Int = 5 + 5 /5
     println(math)


     //augmented assignment
     var tot: Int = 0
     val bil: Int = 5
     tot = tot + bil

     val bil2: Int = 6
     tot += bil2

     println(tot)

     var a: Int = 5
     a++
     println(a)

     val sehat = true
     println(!sehat)
 }