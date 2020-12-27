/*
Jika kita menambah parameter di function
maka ketika memanggil function tersebut,
kita wajib memasukkan data ke parameternya
 */

 fun bilangHello(parm1: String, parm2: String?){
     //println("Hello $parm1 & $parm2")

     if(parm2 == null){
         println("Hello $parm1")
     }else{
         println("Hello $parm1 $parm2")
     }

 }

 fun main(){
     bilangHello("Wega", "Vika")
     bilangHello("Dono", "Dini")
     bilangHello("Dono", null)
}