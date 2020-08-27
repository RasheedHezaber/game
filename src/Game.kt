fun main() {
    var healthpoints=100;
    val playerName = "madrigal"
    var isBlessed = true

    if (healthpoints==100)
        println(playerName+"Madrigal is in excellent condition"+ "  "+healthpoints)
       else if (healthpoints in 90..99)  println("Madrigal has a few scratches")
        else if (healthpoints in 75 ..89 ) {
       if (isBlessed==true) println(playerName + "has some miner wounds but is healing quite qickly" + "  " +healthpoints)
       else println("has some minor wounds")
   }

      else if(healthpoints in 15..74)  println(playerName +" looks pretty hurt" + "   " + healthpoints)
         else println(playerName+ " is in awful condition" +"   " + healthpoints)


}
nyethack

var healthpoints=100;
val playerName = "madrigal"
var isBlessed = true


