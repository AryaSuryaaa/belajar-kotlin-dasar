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


}