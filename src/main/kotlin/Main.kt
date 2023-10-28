fun main(args: Array<String>) {
    val sentence = "аа абв аб арбуз аб где арт ант аптека ананас банан"
    val example = "аь аь ла"
    val empty = ""
    findWords(sentence)
    findWords(example)
    findWords(empty)
}

fun findWords(inputString: String) {
    println("Входная строка: $inputString")
    var found = false
    var result = ""
    var currentWord = ""
    var index = 0

    while (index < inputString.length) {
        val currentChar = inputString[index]

        if (currentChar != ' ') {
            currentWord += currentChar
        } else {
            if (currentWord.length > 3 && currentWord[0] == 'а') {
                result += "$currentWord "
                found = true
            }
            currentWord = ""
        }
        index++
    }

    if (found) {
        println("Слова на 'а' больше 3 символов:")
        println(result.trim())
    } else {
        println("Слов на 'а' больше 3 символов не найдено")
    }
    println("--------------------------------")
}