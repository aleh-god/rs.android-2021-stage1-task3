package subtask3

class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {

        var result: Array<String>? = null

        val charForChange = mapOf(
            '0' to listOf('8'),
            '1' to listOf('2', '4'),
            '2' to listOf('1', '3', '5'),
            '3' to listOf('2', '6'),
            '4' to listOf('1', '5', '7'),
            '5' to listOf('2', '4', '6', '8'),
            '6' to listOf('3', '5', '9'),
            '7' to listOf('4', '8'),
            '8' to listOf('0', '5', '7', '9'),
            '9' to listOf('6', '8')
        )

        val resultList = mutableListOf<String>()

        val checkInt: Int? = number.toIntOrNull()

        if (checkInt != null) {
            if (checkInt > 0) {

                val numberArray = number.toMutableList()

                for (i in 0..numberArray.lastIndex) {

                    val x = numberArray[i]
                    val temp: List<Char>? = charForChange[x]

                    for (j in temp!!) {
                        numberArray[i] = j
                        resultList.add(String(numberArray.toCharArray()))
                    }
                    numberArray[i] = x
                }
                result = resultList.toTypedArray()
            }
        }

        return result
    }
}
