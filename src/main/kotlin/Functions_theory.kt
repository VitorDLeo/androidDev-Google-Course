fun birthdayGreeting (): String {
    val nameGreeting = "Happy bithday, Rover"
    val ageGreeting = "You are now 5 years old"
    return "$nameGreeting\n$ageGreeting"
}


fun main() {

    val greeting = birthdayGreeting()

    println(greeting)

}