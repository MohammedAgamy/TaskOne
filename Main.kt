import java.util.regex.Pattern

fun main(args: Array<String>) {


    fun main(args: Array<String>) {

        //1: Ask the user to enter one integer (Int).
        println("Enter number one type of Int")
        val numInt = readln().toInt()
        //2: Ask the user to enter one double (Double).
        println("Enter number one type of Double ")
        val numDouble = readln().toDouble()
        //3: Calculate the quotient of the double divided by the integer.
        val divide = numDouble / numInt
        println("The quotient of $numDouble divided by $numInt is = $divide")
        //4: Calculate the remainder when the integer is divided by 3.
        //5: Print the results of both calculations.
        val calcDividedBy = numInt % 3
        println("The remainder when $numInt is divided by 3 is = $calcDividedBy")

        //6: Check if the double is greater than the integer.
        //7: Print the result of this comparison.
        if (numDouble > numInt)
            println("Double is greater than the integer ")
        else println("Integer is greater than the Double ")

        val check = if (numDouble > numInt) "Double is greater than the integer " else "Double is greater than the integer "
        println(check)

        //8: check if the double is greater than 5 and the integer is greater than 5.
        //9: check if the double is greater than 5 or the integer is greater than 5.
        if (numDouble > 5 && numInt > 5)
            println("Yes the double and integer is greater than 5 ")
        else
            println("No the double and integer is not  greater than 5 ")

        //11: Prompt the user to enter an email address.
        //12: Validate the entered email using a regular expression (regex).
        //13: Print whether the entered email is valid or not.
        println("Enter Your Email ")
        val email = readln()
        val emailRegex = "^[A-Za-z](.*)([@])(.+)(\\.)(.+)".toRegex().matches(email)
        println("is valid Email $emailRegex")

        /* another way */
        if (emailRegex) {
            println("The email address $email is valid")
        } else println("The email address $email is  invalid.")

        /* another way use Pattern */
        if (Pattern.matches("^[A-Za-z](.*)([@])(.+)(\\.)(.+)", email)) {
            println("The email address $email is valid")
        } else println("The email address $email is  invalid.")



}