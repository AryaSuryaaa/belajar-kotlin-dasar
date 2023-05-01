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

}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}