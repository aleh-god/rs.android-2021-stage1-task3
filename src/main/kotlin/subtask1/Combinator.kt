package subtask1

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        var count = 0
        var resultN = 0

        fun binomi(n: Int, k: Int): Int {

            return if ((n == k) || (k == 0))
                1
            else
                binomi(n - 1, k) + binomi(n - 1, k - 1)
        }

        while (resultN < array[0]) {
            ++count
            resultN = binomi(array[1], count)
            if (resultN == 1) return null
        }

        resultN = count

        return resultN!!
    }


}
