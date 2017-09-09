fun main(args: Array<String>) {
    println("Hello World!")

    val number = 2
    println(number)

    println(square(number))

    println(number)
    // Note that this prints 2:
    // `square(Int)` returns a new number and doesn't modify the existing one.
    // This is known as an immutable data type.
}
