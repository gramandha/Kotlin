/*
Yang dimaksud function scope merupakan pembatasan agar dapat diakses oleh 
hanya pada main saja, contohnya pembuatan function didalam maian

 */

fun tes1(){
    //error
    //helloGaes()
}

fun test2(){
    //error
    //helloGaes()
}

fun main() {
    fun helloGaes(){
        println("Hello Gaes")
    }
    
    helloGaes()
}