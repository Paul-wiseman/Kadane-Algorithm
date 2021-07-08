internal  object KadaneAlgorithm{

    // kadane's algorithm returns the max sum in an array of Integers
    // O(n) time and O(1) space
    fun kadaneAlgorithm(array: Array<Int>): Int{
        var currentSum = array[0]
        var maxSum = array[0]
        for(i in 1 until array.size){
            currentSum = Math.max((currentSum + array[i]), array[i])
            maxSum = Math.max(maxSum, currentSum)
        }
    return maxSum
    }

    @JvmStatic
    fun main(args: Array<String>){
        val array = arrayOf(3,5,-9,1,3,-2,3,4,7,2,-9,6,3,1,-5,4)
        println(kadaneAlgorithm(array))
    }
}