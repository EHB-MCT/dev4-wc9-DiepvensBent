import kotlin.math.log

fun main(){
    val binary = FileReader().getPuzzle3()
    val n = binary.size
    println(binary)
    println(n)
    var powerConsumption = 0
    var gammaRate = ""
    var epsilonRate = ""
    var i = 0
    var ones = 0
    var zeroes = 0
    // gammaRate is the most common bit each position binary to decimal
    //epsilonRate is the least common bit
    for (a in 0 until 12){
        println("bit: $a")
        while (i < n) {
            val integer = binary[i]
            when(integer[a]){
                0->{
                    zeroes++
                }
                1->{
                    ones++
                }
            }
            i++
        }
        println("Zeroes: $zeroes")
        println("Ones: $ones")
        if (zeroes < ones){
            gammaRate += "1"
            epsilonRate += "0"
        }else{
            gammaRate += "0"
            epsilonRate += "1"
        }
        zeroes = 0
        ones = 0
        i = 0
    }

    println(gammaRate.toInt(2))
    println(epsilonRate.toInt(2))
    powerConsumption = gammaRate.toInt(2) * epsilonRate.toInt(2)
    println(powerConsumption)
}