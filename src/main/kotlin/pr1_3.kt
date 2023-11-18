
fun main() {
    val alphabet = listOf(    'А' to 21, 'Б' to 13, 'В' to 4,
        'Г' to 20, 'Д' to 22, 'Е' to 1,    'Ё' to 25, 'Ж' to 12, 'З' to 24,
        'И' to 14, 'Й' to 2, 'К' to 28,    'Л' to 9, 'М' to 23, 'Н' to 3,
        'О' to 29, 'П' to 6, 'Р' to 16,    'С' to 15, 'Т' to 11, 'У' to 26,
        'Ф' to 25, 'Х' to 30, 'Ц' to 27,    'Ч' to 8, 'Ш' to 18, 'Щ' to 10,
        'Ь' to 33, 'Ы' to 31, 'Ъ' to 32,    'Э' to 19, 'Ю' to 7, 'Я' to 17
    )

    println("Введите 1 - чтобы зашифровать' или 2 - чтобы расшифровать': ")
    val choice = readln().toUpperCase() // зашифровать или расшифровать
    println("Введите исходный текст: ")
    val inputText = readln().toUpperCase() // изначальный текст
    println("Введите ключевое слово: ")
    val keyword = readln().toUpperCase() // ключевое слово

    var result = ""

    if (choice == "1") {
        var index = 0
        for (char in inputText) {
            val key = alphabet.find { it.first == keyword[index] }!!.second
            val currentIndex = alphabet.indexOfFirst { it.first == char }
            val shiftedIndex = (currentIndex + key - 1) % 33
            result += alphabet[shiftedIndex].first
            index = (index + 1) % keyword.length
        }
    } else if (choice == "2") {
        var index = 0
        for (char in inputText) {
            val key = alphabet.find { it.first == keyword[index] }!!.second
            val currentIndex = alphabet.indexOfFirst { it.first == char }
            val shiftedIndex = (currentIndex + 33 - key + 1) % 33
            result += alphabet[shiftedIndex].first
            index = (index + 1) % keyword.length
        }
    } else {
        println("Некорректный выбор")
    }

    println(result)
}
