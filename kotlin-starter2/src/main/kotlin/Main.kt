fun main(args: Array<String>) {
    println("Hello Kotlin!")

    // Nilai dari var bisa dirubah
    var company: String = "Arya Surya"
    company = "Belajar Kotlin"

    println(company)

    // Nilai dari val tidak bisa dirubah
    val studentName : String = "Arya Surya"
//    studentName = "Kadek Surya"

     print(studentName)

    // menggunakan operator
    val namaDepan = "Arya"
    val namaBelakang = "Surya"
    println(namaDepan + namaBelakang)

    // Pertambahan
    val nilai1 = 2
    val nilai2 = 5
    println(nilai1 + nilai2)

    // TIPE DATA CHAR ==============================================================================================
    // Untuk mendefinisikan sebuah variabel dengan tipe data Char kita bisa menggunakan tanda kutip tunggal (' ')
    val correct = 'A'
//    val incorrect ='ABC' error: too many character

    // bisa melakukan inc dan decrement pada char
    // Karena pada dasarnya setiap Characters merupakan representasi dari Unicode. A = 0041, B = 0042
    var incrementChar = 'A'
    println(incrementChar++)
    println(incrementChar++)
    println(incrementChar++)

    // TIPE DATA String ====================================================================================================
    // String bisa menampung beberapa karakter di dalamnya. Kita bisa mendefinisikan variabel tersebut dengan tanda petik ganda (" ")
    val textString = "Kotlin"
    val firstChar = textString[0] // Dasarnya String berbentuk Array
    println(firstChar)
    for (char in textString) {
        print("$char ")
    }

    // escape String
//    val escape = "Kotlin is "Awesome"!"
    val escape = "Kotlin is \"Awesome\"!"
    /*
    * \t: menambah tab ke dalam teks.
    * \n: membuat baris baru di dalam teks.
    * \’: menambah karakter single quote kedalam teks.
    * \”: menambah karakter double quote kedalam teks.
    * \\: menambah karakter backslash kedalam teks.
    * */

    // Raw String
    val lineString = "Line 1\n" +
            "Line2\n" +
            "Line3\n"
    // cara lebih mudah
    val lineStringHack = """
        Linw 1
        Line 2
        Line 3
    """.trimIndent()

    // Memanggul fungsi yang dibuat
    val user = setUser("Arya Surya", 20)
    print(user)

    printUser("Saputra")

    // If Expression ===========================================================================================
    val openHours = 7
    val now = 20
    var office: String
    var school: String
    if (now > openHours) {
       office = "Office already open"
    } else {
        office = "Office is closed"
    }
    println(office)

    school = if (now > openHours) {
        "School already open"
    } else if (now == openHours) {
        "Wait a minute, office will be open"
    }else {
        "School is closed"
    }
    println(school)
    // Kotlin tidak mendukung ternary operator (condition ? then : else)


    // Boolean ================================================================
    val coffeeShopOpen = 7
    val coffeeShopClosed = 20
    val today = 20

    // AND &&
    val isOpen = today >= coffeeShopOpen && today <= coffeeShopClosed
    println("Coffee Shop is open: $isOpen")
    // OR ||
    val isClose = today < coffeeShopOpen || today > coffeeShopClosed
    println("Coffee Shop closed: $isClose")
    // NOT (!)
    if(!isOpen) {
        print("Coffee Shop is closed")
    }

    // Numbers =========================================================
    // Int (32 Bit)
    val intNumber = 100
    // Long (64 Bit)
    val longNumber: Long = 100
    // val longNumber = 100L
    //Short (16 Bit)
    val shortNumber: Short = 10
    // Byte (8 Bit)
    val byteNumber = 0b11010010
    // Double (64 Bit)
    val doubleNumber: Double = 1.4
    //Float (32 Bit)
    val floatNumber: Float = 0.123456789f

    // tips nulis jutaan
    val readableNumber = 1_000_000
    print(readableNumber)

    val konversiByte: Int = byteNumber.toInt();
    /*
    * toByte(): Byte
    * toShort(): Short
    * toInt(): Int
    * toLong(): Long
    * toFloat(): Float
    * toDouble(): Double
    * toChar(): Char
    * */

    // Arrays ==============================================================
    val array = arrayOf(1,3,5,7)
    val mixArray = arrayOf(1,3,5,7, "Dicoding", true)

    // Array dengan tipe data primitif
    val intArray = intArrayOf(1,2,3,6,7)
    print(intArray[2])
    /*
    * intArrayOf() : IntArray
    * booleanArrayOf() : BooleanArray
    * charArrayOf() : CharArray
    * longArrayOf() : LongArray
    * shortArrayOf() : ShortArray
    * byteArrayOf() : ByteArray
    * */


    // Nullability ======================================================
//    val text: String = null (error)
    val text: String? = null
    // cara mengakses nilai null
    if(text != null) {
        val textLength = text.length // ready to go
    }

    // Safe calls operator (?.)
    text?.length

    // Elvis Operator (?:)
    val textLength2 = text?.length ?: 7
    // sama seperti
    // val textLength = if (text != null) text.length else 7

}

// FUNCTION ========================================================================
// Pendeklarasian fungsi pada Kotlin diawali dengan kata kunci fun
fun setUser(name: String, age: Int): String {
    return "Your name is $name, and you $age years old"
}
// jika return hanya 1 expression, bisa ditulis secara singkat
//fun setUser(nama: String, age: Int): String = "Your name is $nama, and you $age years old"

// fungsi yang tidak mengembalikan nilai
fun printUser(name: String) {
    print("Your name is $name")
}
// cara memanggil fungsi yang sudah di buat di main