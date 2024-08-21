package com.example.kotlin_basics

fun main() {

    var userinput :Int
    var computerinput = ""
    var check : Int =0

    //---------- User Input--------

    println("Enter your choice")
    println("1. Rock " +
            "2. Paper " +
            "3. Scissor")

    userinput = readln().toInt()

    if ( userinput == 1)
    {
        println("User = Rock")

    }
    else if(userinput == 2 )
    {
        println("User = Paper")

    }
    else
    {
        println("User = Scissor")
    }

    //--------Computer---------

    val randomvariable = (1..3).random()
    if (randomvariable == 1)
    {
        computerinput = "Computer = Rock"
        check =1
    }
    else if(randomvariable == 2 )
    {
        computerinput = "Computer = Paper"
        check =2
    }
    else
    {
        computerinput= "Computer =  Scissor"
        check = 3
    }
    println(computerinput)

    //=============Wining Condition

    if (check > userinput)
    {
        println("Computer Wins")
    }
    else if(check == userinput )
    {
        println("Mach Draw")
    }
    else
    {
        println("User Wins")
    }

    println("Let's Play Again")


}