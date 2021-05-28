package subtask3

import java.util.*

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
//        throw NotImplementedError("Not implemented")
        val inputStringChar = inputString.toCharArray()
        val strings = ArrayList<String>()

        for (i in inputStringChar.indices) {
            check(inputStringChar, i, i, '(', ')', strings, inputString)
            check(inputStringChar, i, i, '[', ']', strings, inputString)
            check(inputStringChar, i, i, '<', '>', strings, inputString)
        }
        return strings.toArray(arrayOfNulls<String>(strings.size))
    }

    private fun check(
        inputStringChar: CharArray,
        i: Int,
        k: Int,
        ch: Char,
        ch1: Char,
        strings: ArrayList<String>,
        inputString: String
    ) {
        var k = k
        if (inputStringChar[i] == ch) {
            while (inputStringChar[k] != ch1) {
                if (inputStringChar[k + 1] == ch) {
                    var a = k
                    while (inputStringChar[a] != ch1) {
                        a++
                    }
                    k = a
                }
                k++
                if (k == inputStringChar.size) {
                    break
                }
            }
            strings.add(inputString.substring(i + 1, k))
        }
    }
}
