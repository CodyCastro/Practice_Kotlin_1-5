fun main(){

    // Числа в переменные задаются рандомно
    val a = (0..100).random()
    val b = (0..100).random()
    val c = (0..100).random()
    val d = (0..100).random()

    // Переменная, определяющая количество пробелов (пустая по умолчанию)
    var space = String()

    // Функция, задающая количество пробелов в переменную space
    fun spacenum(num: Int){

        // Добавляет столько пробелов в переменную, сколько указано в параметре num
        for(i in num downTo 1 step 1){
            space += " "
        }
    }

    // Один пробел
    spacenum(1)

    print("${a}${space}${b}${space}${c}${space}${d}\n")
}