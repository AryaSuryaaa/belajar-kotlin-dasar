import java.awt.Color

fun main(args: Array<String>) {

    // Enumeration
    /*
    val colorRed = 0xFF0000
    val colorGreen = 0x00FF00
    val colorBlue = 0x0000FF
    */

    // Nilai dari variabel diatas bisa saja tertukar. Untuk mengatasinuya, bisa menggunakan Enumeration

    val colorRed = Color.RED
    val colorGreen = Color.GREEN
    val colorBlue = Color.BLUE

    // Mendapatkan daftar objek Enum dan nama
    val colors: Array<Colors> = enumValues()
    colors.forEach { color -> println("$color ") }

    // Menandapatkan nama
    val warna: Colors = Colors.valueOf("RED")
    println("Color is $warna")
    println("Color value is ${warna.value.toString(16)}")

    // Posisi tiap objek dengan properti ordinal
    println("Position GRED is ${warna.ordinal}")

    //when
    when(warna) {
        Colors.RED -> println("Color is RED")
        Colors.GREEN -> println("Color is GREEN")
        Colors.BLUE -> println("Color is BLUE")
    }

}

enum class Colors(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}