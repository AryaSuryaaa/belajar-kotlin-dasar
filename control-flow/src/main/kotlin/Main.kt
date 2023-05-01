import java.awt.Color
import kotlin.random.Random

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

    // Expression
    // expression adalah statement yang dapat mengembalikan nilai dan bisa kita simpan ke dalam sebuah variabel seperti
    // Statement
    // tidak mengembalikan nilai (variabel value1&2)
    val value1 = 10
    val value2 = 20

    sum(value1, value2)

    // When Expression
    val stringOfValue = when(value1) {
        6 -> {
            println("six")
            "value is 6"
        }
        7 -> {
            println("sever")
            "value is 7"
        }


        else -> {
            println("undefined")
            "value cannot be reached"
        }
    }
    println(stringOfValue)

    // memeriksa instance dengan tipe tertentu
    // menggunakan is / !is
    val anyType: Any = 100L
    when(anyType) {
        is Long -> println("the value has a Long type")
        is String -> println("the value has a String type")
        else -> println("undefined")
    }

    // when untuk range
    val nilai = 27
    val range = 10..50

    when(nilai) {
        in range -> println("values is in the range")
        !in range -> println("value is outside the range")
        else -> println("value out of range")
    }

    val registerNumber = when(val regis = getRegisterNumber()){
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }
    println(registerNumber)

    // While ===========================================================
    // bersifat  Entry Controlled Loop
    var counter = 1
    while(counter <= 7) {
        println("Hello, World!")
        counter++
    }
    println("")

    // Do While ========================================================
    // Exit Controlled Loop
    do{
        println("Hello, world!")
        counter++
    } while (counter <= 7)
    println("")
}

enum class Colors(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

fun sum(value1: Int, value2: Int) = value1 + value2

fun getRegisterNumber() = Random.nextInt(100)