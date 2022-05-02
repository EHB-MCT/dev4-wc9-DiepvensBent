fun main(){
    val sweep = FileReader().getPuzzle1()
    val n: Int = sweep.size
    var i = 0
    var h = 0
    while (i < n - 3){
        var number1 = sweep[i]+sweep[i+1]+sweep[i+2]
        var number2 = sweep[i+1]+sweep[i+2]+sweep[i+3]
        if (number1<number2) {
            h++
        }
        i++
    }
    println(h)
}