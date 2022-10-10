// Kotlin Fundamental - Variable and Data Type
// Ferry Dwianta P


fun main(args: Array<String>) {
    // Varible :
    var Company: String = "Infinite Learning"
//    val Company: String = "Infinite Learning" //Immutable
//    var Company = "Infinite Learning" //Type Inference
    Company = "Nongsa Digital Park"
    println (Company)
    println()

    // Char :
    var grade = 'A'
    println("Grade " + grade++) //ini adalah post increment, jadi print dlu baru ditambah.
    println("Grade " + grade++)
    println("Grade " + grade++)
    println("------")
    println("Grade " + grade--)
    println("Grade " + grade--)
    println("Grade " + grade--)
    println()

    // String :
    val stringText = "Kampus Merdeka \nby \"Infinite Learning\"\n"  //Escaped String :
    println(stringText)

    //Raw String :
    val stringText1 = """ 
            Kampus Merdeka
            by Infinite Learning
            
            """.trimIndent()
    println(stringText1)

    // Boolean :
    var x = true
    var y = false

    println("x && y = " + (x && y))
    println("x || y = " + (x || y))
    println("!y = " + (!y) + "\n")

    var a: Int = 50
    var b: Int = 25

    println("a > b = " + (a > b))
    println("a < b = " + (a < b))
    println("a >= b = " + (a >= b))
    println("a <= b = " + (a <= b))
    println("a != b = " + (a != b))
    println()

    // Number :
    val i: Int = 10000
    val d: Double = 100.00
    val f: Float = 100.00f
    val l: Long = 1000000004L
    val s: Short = 10
    val by: Byte = Byte.MAX_VALUE

    println(i)
    println(d)
    println(f)
    println(l)
    println(s)
    println(by)
    println()

    // Array :
    val groups = arrayOf<String>("Group1", "Group2", "Group3", "Group4")

    println(groups[0])
    println(groups.get(1))
    println("------------")

    groups[0] = "Group Satu"
    groups.set(1, "Group Dua")

    println(groups[0])
    println(groups.get(1))
    println(groups.get(2))
}