package subtask2

import kotlin.math.floor
import kotlin.math.sqrt

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {

        val funResult: MutableList<Int>? = decompose2(number.toDouble())
        var result: Array<Int>? = null

        if (funResult == null) return null
        else result = funResult.toTypedArray()

        return result
    }

    fun decompose2(n: Double): MutableList<Int>? {
        val nn = n - 1
        return decompose2Rec(nn, n * n) // 49 2500
    }

    fun decompose2Rec(i: Double, tot: Double): MutableList<Int>? {

        if (tot == 0.0) {
            return mutableListOf()
        }

        if (i <= 0.0 || tot < 1.0) {
            return null
        }

        var tempTot = tot - i * i
        var temp = sqrt(tempTot)
        temp = floor(temp)

        if (i == temp || i < temp) {
            return null
        }

        val subList = decompose2Rec(temp, tot - i * i)

        if (subList != null) {
            subList.add(i.toInt())
            return subList
        }

        return decompose2Rec(i - 1, tot)
    }
}
