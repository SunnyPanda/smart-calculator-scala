package calculator

import scala.io.StdIn.readLine

object Main extends App {
    var input = readLine()
    while (input != "/exit") {
        input match {
            case "/help" => println("The program calculates the sum of numbers")
            case "" => ()
            case _ => println(input.split(" ").map(_.toInt).sum)
        }
        input = readLine()
    }
    println("Bye!")
}
