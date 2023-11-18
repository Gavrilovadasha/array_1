fun main() {
    // Получаем массив слов от пользователя
    println("Введите массив слов через запятую:")
    val input = readln()
    val words = input.split(",").map { it.trim() }

    // Создаем пустой Map для группировки слов
    val wordMap = mutableMapOf<String, MutableList<String>>()

    // Идем по каждому слову
    for (word in words) {
        // Преобразуем слово к набору отсортированных букв
        val sortedWord = word.toCharArray().sorted().joinToString("")

        // Добавляем слово к этому набору в Map
        if (wordMap.containsKey(sortedWord)) {
            wordMap[sortedWord]!!.add(word)
        } else {
            wordMap[sortedWord] = mutableListOf(word)
        }
    }

    // Выводим результат
    for ((_, value) in wordMap) {
        println(value.joinToString(","))
    }
}
