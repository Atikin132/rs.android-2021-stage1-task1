package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
//        throw NotImplementedError("Not implemented")
        val billArrayList: MutableList<Int> = java.util.ArrayList()
        for (i in bill) {
            billArrayList.add(i)
        }
        billArrayList.removeAt(k)
        var sum = 0
        val difference: Int
        for (i in billArrayList.indices) {
            sum += billArrayList.get(i)
        }
        difference = b - sum / 2
        return if (difference == 0) {
            "bon appetit"
        } else {
            difference.toString()
        }
    }
}
