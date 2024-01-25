/**
 * La clase tiempo cuenta con los parámetros:
 * @property hora: Int -> Entero que registra un número que representa las horas
 * @constructor Crea una instancia de tiempo con hora
 */
class tiempo(var hora: Int){
     init {
         require(hora <= 24){"No se puede superar el límite de horas"}

     }
    fun pedirHora(){
        print("Ingrese el número de horas: ")
        val h = readln()
        if (h == "") throw NumberFormatException ("Formato de entrada no válido")
        if (h.toInt() > 24){
            throw Exception ("Límite de horas excedido")
        }
        if (h != "") this.hora = h.toInt()
        else this.hora = 0
    }
    //------------------------------------------------------------------------------------------------------------------
    private var minuto: Int = 0
    fun pedirMinutos(){
        print("Ingrese los minutos: ")
        val m = readln()
        if (m == "") throw NumberFormatException ("Formato de entrada no válido")
        if (m.toInt() != 0){
            var min = m.toInt()
            while (min >= 60){
                this.hora += 1
                min -= 60
            }
            this.minuto = min
        }
        else this.minuto = 0
        if (this.hora > 24){
            throw Exception ("Límite de horas excedido")
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    private var segundo:  Int = 0
    fun pedirSegundos(){
        print("Ingrese los segundos: ")
        val s = readln()
        if (s == "") throw NumberFormatException ("Formato de entrada no válido")
        if (s.toInt() != 0) {
            var sec = s.toInt()
            while (sec >= 60){
                this.minuto += 1
                if (this.minuto == 60) {
                    hora += 1
                    if (this.hora > 24){
                        throw Exception ("Límite de horas excedido")
                    }
                }
                sec -= 60
            }
            this.segundo = sec
        }
        else this.segundo = 0
        if (this.hora > 24) {
            throw Exception("Límite de horas excedido")
        }
    }
    //------------------------------------------------------------------------------------------------------------------

    //------------------------------------------------------------------------------------------------------------------
    override fun toString() :String{
        return if (hora < 10) {
            if(minuto < 10 && segundo < 10) "0${this.hora}h 0${this.minuto}m 0${this.segundo}s"
            else if(minuto < 10 && segundo > 10) "0${this.hora}h 0${this.minuto}m ${this.segundo}s"
            else if(minuto > 10 && segundo < 10) "0${this.hora}h ${this.minuto}m 0${this.segundo}s"
            else "0${this.hora}h ${this.minuto}m ${this.segundo}s"
        } else {
            if (minuto < 10 && segundo < 10) "0${this.hora}h 0${this.minuto}m 0${this.segundo}s"
            else if(minuto < 10 && segundo > 10) "0${this.hora}h 0${this.minuto}m ${this.segundo}s"
            else if(minuto > 10 && segundo < 10) "0${this.hora}h ${this.minuto}m 0${this.segundo}s"
            else "0${this.hora}h ${this.minuto}m ${this.segundo}s"
        }
    }
}
