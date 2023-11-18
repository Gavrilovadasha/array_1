fun main() {
    // Вводим количество строк и столбцов
    println("Введите количество строк:")
    val n = readln().toInt()
    println("Введите количество столбцов:")
    val m = readln().toInt()
    var i=0
    var j=0
    // Создаем двумерный массив и заполняем его введенными числами
    println("Введите трехзначные числа:")
    val arr = Array(n) { IntArray(m) }
    val number = mutableSetOf<Int>()

    for (n in arr) {
        i++
        for (m in n) {
            j++
            arr[i-1][j-1] = readln().toInt()

           number.addAll(arr[i-1][j-1].toString().toList().map { it.toString().toInt() })
        }
        j=0
    }
    // Выводим двумерный массив
    println("Двумерный массив:")
    for (n in arr)
    {
        println(n.contentToString())
    }

    // Выводим количество различных цифр
    println("В массиве использовано ${number.size} различных цифр")
}
