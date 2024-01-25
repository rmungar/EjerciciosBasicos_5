fun main(){
    try {
        val hora1 = tiempo(1)
        hora1.pedirHora()
        hora1.pedirMinutos()
        hora1.pedirSegundos()
        println(hora1.toString())
    }
    catch (e:Exception){
        println(e)
    }
}