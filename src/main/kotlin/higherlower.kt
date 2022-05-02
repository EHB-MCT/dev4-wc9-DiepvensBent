fun main(){
    val sweep = FileReader().getPuzzle1()
    val n: Int = sweep.size
    var i = 0
    var h = 0
    while (i < n - 1){
        println(sweep[i])
        if (sweep[i]<sweep[i+1]) {
        h++
        }
        i++
    }
    println(h)
}