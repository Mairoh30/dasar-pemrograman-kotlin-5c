fun main(args: Array<String>) {
    //Parrot program
    println("Hi I'm Maairoh, the virtual parrot, and I love to repeat!");
    println("Type something in: ");
    var input: String
    input = readLine()!!
    var output: String
    output = input + ", " + input + "!"
    println(output)
}