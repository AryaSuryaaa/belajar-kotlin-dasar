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
}

// FUNCTION
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