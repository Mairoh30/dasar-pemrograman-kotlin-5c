fun main(args: Array<String>) {
    //string template
    val a = 7
    val b = 8
    val c = a + b
    val s = "When we add $a and $b, we get $c"
    println(s)
    println("When we add $a and $b, we get ${a + b}") //literal string (tanda kutip 2)
    val price = """
        ${'$'}9.99
        """

    println(price)
}