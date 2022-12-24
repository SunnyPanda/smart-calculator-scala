package calculator

import scala.io.StdIn.readLine

object Main extends App {
    var input = readLine()
    while (input != "/exit") {
        if (input.nonEmpty) println(input.split(" ").map(_.toInt).sum)
        input = readLine()
    }
    println("Bye!")
}
