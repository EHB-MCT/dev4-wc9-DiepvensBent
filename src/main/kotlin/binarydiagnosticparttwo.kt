import java.util.logging.Filter

fun main (){
    var lifeSupportRating = 0 //oxygenGeneratorRating * C02ScrubberRating

    val binary = FileReader().getPuzzle3()
    val n = binary.size
    var i = 0
    var ones = 0
    var zeroes = 0
    var oxygenFilter = mutableListOf<Int>()
    var CO2Filter = mutableListOf<Int>()


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
        //println("Zeroes: $zeroes")
        //println("Ones: $ones")
        if (zeroes < ones){
        //oxygen keep ones
            oxygenFilter.add(1)
        //CO2 keep zeroes
            CO2Filter.add(0)
        }else if (zeroes > ones) {
        //oxygen keep zeroes
            oxygenFilter.add(0)
        //CO2 keep ones
            CO2Filter.add(1)
        }else if(zeroes == ones){
        //oxygen keep ones
            oxygenFilter.add(1)
        //CO2 keep zeroes
            CO2Filter.add(0)
        }
        zeroes = 0
        ones = 0
        i = 0
    }
    var test = "111100111011"
    test.toInt(2)
    //oxygenRating(oxygenFilter)
    //oxygenRating(CO2Filter)
    var test2 = "000011000110"
    test2.toInt(2)
    println(test.toInt(2) * test2.toInt(2))
}

fun oxygenRating(oxygenFilter: MutableList<Int>){
    var oxygenBinary = FileReader().getPuzzle3().toMutableList()
    var n = oxygenBinary.size
    var key = oxygenFilter
    var i = 0
    //println(oxygenBinary)
    //println(key)
    while (n > 1){
        for (a in 0 until 12){
            var filter = key[a]
            while (i < n){
                var integer = oxygenBinary[i]
                if (filter == integer[a]){
                    oxygenBinary.remove(integer)
                    n--
                }
                i++
            }
            i = 0
            //println(oxygenBinary)
        }
        //println(n)

    }


}