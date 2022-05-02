fun main(){
    val commands = FileReader().getPuzzle2()
    println(commands);
    var i = 0;
    val n = commands.size;
    var x: Int = 0;
    var y: Int = 0;
    var aim: Int = 0;


    while (i< n){
        var string =commands[i]
        var integer: Int = string[1] as Int
        when(string[0]){
            "forward" -> {
                x += integer
                y += (aim * integer)
            }
            "up" ->{
                aim -= integer
            }
            "down" ->{
                aim += integer
            }
        }
        i++
    }
    println(x)
    println(y)
    var xy = x * y;
    println(xy)


}