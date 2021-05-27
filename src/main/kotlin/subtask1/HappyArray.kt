package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
//        throw NotImplementedError("Not implemented")
        val sadArrayList: MutableList<Int> = java.util.ArrayList()
        for (i in sadArray) {
            sadArrayList.add(i)
        }
        var k = 1
        while (k < sadArrayList.size - 1) {
            if ((sadArrayList.get(k - 1) + sadArrayList.get(k + 1)) < sadArrayList.get(k)) {
                sadArrayList.removeAt(k)
                k -= 1
                if (k <= 1) {
                    k++
                }
            } else {
                k++
            }
        }
        val happyArray = IntArray(sadArrayList.size)
        for (i in 0 until sadArrayList.size) {
            happyArray[i] = sadArrayList[i]
        }
        return happyArray
    }
}
