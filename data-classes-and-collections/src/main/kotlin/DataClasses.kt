// Penggunaan data class ========================================================
//Perbedaan class dengan data class

class User(val name: String, val age: Int) {
    // Agar output dari class seperti data class
    // tambahkan fungsi toString
    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }

    // Jika ingin sama seperti equals data Class
    override fun equals(other: Any?): Boolean {
        if(this === other) return true
        if(javaClass != other?.javaClass) return false

        other as User

        if(name != other.name) return false
        if(age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return  result
    }
}


// data class otomatis memiliki fungsi toString
// memiliki fungsi equals() otomatis
data class DataUser(val name: String, val age: Int) {
    // menambahkan behaviour
    fun address() {
        println("i live at Bandung")
    }
}

fun main() {
    val user = User("nrohmen", 17)
    val user2 = User("nrohmen", 17)
    val user3 = User("Arya", 20)

    val dataUser = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("Arya", 20)


    println(user)
    println(dataUser)

    println(user.equals(user2))
    println(user.equals(user3))

    // Konsol akan langsung memberi tahu apakah kedua objek tersebut sama atau tidak
    println(dataUser.equals(dataUser2))
    println(dataUser.equals(dataUser3))

    // Menyalin dan memodifikasi Data Class =======================================
    val dataUser4 = dataUser.copy(age = 20)
    println(dataUser4)

    // Destructuring Declarations
    // adalah proses memetakan objek menjadi sebuah variabel.
    val name = dataUser.component1()
    val age = dataUser.component2()
    // cara cepat
    // val (name, age) = dataUser



    println("My name is $name, I am $age years old" + dataUser.address())

    // COLLECTIONS ====================================================================================================
    // dalam collections terdapat beberapa objek turunan, di antaranya adalah List, Set, dan Map.

    // list ================
    //  List tersebut bersifat immutable alias tidak bisa diubah.
    val numberList = listOf(1,2,3,4,5)
    val charList = listOf('a', 'b', 'c')
    val anyList = listOf('a', "Kotlin", 3, true)

    println(numberList[3])
    print(charList)
    println("")
    for (i in anyList) {
        print("$i ")
    }
    println("")

    // mengubah list menjadi mutable,
    // dpt melakukan menambah, menghapus, atau mengganti nilai yang sudah ada.
    val mutableList = mutableListOf('a', "kotlin", 3, true, User("arya", 18))

    mutableList.add('d') // menambah item di akhir List
    mutableList.add(1, "love") // menambah item pada indeks ke-1
    mutableList[3] = false // mengubah nilai item pada indeks ke-3
    mutableList.removeAt(0) // menghapus item pada indeks ke-0

    for (i in mutableList) {
        print("$i ")
    }
    println("")

    // Set ===========================
    // merupakan sebuah collection yang hanya dapat menyimpan nilai yang unik.
    // tidak ada data yang sama atau duplikasi
    val integerSet = setOf(1,2,4,2,1,5)
    print(integerSet)
    println("")

    // urutan bukan hal yang penting
    val setB = setOf(5,1,4,2,1,5)
    println(integerSet == setB)

    // mengecek keberadaan
    println(5 in setB)

    // menggabungkan (union) dan irisan (intersect)
    val setA = setOf(1,4,8,9,10)
    val union = setB.union(setA)
    val intersect = setB.intersect(setA)

    println(union)
    println(intersect)

    // Pada Mutable Set kita bisa menambah dan menghapus item namun tak bisa mengubah nilai seperti pada List.
    val mutableSet = mutableListOf(1,2,3,4,5)
    //mutableSet[2] = 6 // tidak bisa mengubah set immutable
    mutableSet.add(6)
    mutableSet.remove(1) //bukan remove index melainkan element 1
    println(mutableSet)

    // Map ==================================
    // sebuah collection yang dapat menyimpan data dengan format key-value.
    val capital = mapOf(
        //key         //value
        "Jakarta" to "Indoneisa",
        "London" to "England",
        "New Delhi" to "Indoa"
    )
    // mengakses value
    println(capital["Jakarta"]) // jika kosong -> null
    // atau
    println(capital.getValue("Jakarta")) // jika kosong

    // menampilkan key apa saja yang ada di dalam Map
    val mapKeys = capital.keys
    // keys mengembalikan nilai berupa Set karena keys harus Unik
    println(mapKeys)

    // menampilkan values yang ada
    val mapValues = capital.values
    // values mengembalikan data berupa collection
    println(mapValues)

    // menambahkan data
    // ubah menjadi mutable
    val mutableMap = capital.toMutableMap()
    mutableMap.put("Berlin", "Germany")

    // Collections Operations =====================================================================
    // fungsi operasi yang bisa kita gunakan untuk mengakses data di dalam collections
    val numbersList = listOf(1,2,3,4,5,6,7,8,9,10)
    // filter
    val evenList = numbersList.filter { it % 2 == 0 }
    println(evenList)
    val notEvenList = numbersList.filterNot { it % 2 == 0 }
    println(notEvenList)

    // map
    val multipliedby5 = numbersList.map { it * 5 }
    println(multipliedby5)

    // count
    println(numbersList.count())
    println(numbersList.count{it % 3 == 0})

    // find
    val fisrtOddNumber = numbersList.find { it % 2 == 1 }
    val fisrtOrNullNumber = numbersList.firstOrNull { it % 2 == 3 }
    val lastOddNumber = numbersList.lastOrNull { it % 2 == 1 }
    println(fisrtOddNumber)
    println(fisrtOrNullNumber)
    println(lastOddNumber)

    // first and last
    val moreThan6 = numbersList.first { it > 6}
    println(moreThan6)
    println(numbersList.last())

    // sum
    val total = numbersList.sum()
    println(total)

    // sorted
    val kotlinChar = listOf('k','o','t', 'l', 'i', 'n')
    val ascendingSort = kotlinChar.sorted() // abc
    println(ascendingSort)

    val descendingSort = kotlinChar.sortedDescending()
    println(descendingSort)

    // Sequencea ==========================================================================
    val list = (1..10000000).toList()
    //list.filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }
    // Dengan eager evaluation atau dikenal dengan horizontal evaluation, list akan menyelesaikan proses filter terhadap 1 juta data baru kemudian melakukan mapping data sampai akhirnya ditampilkan pada konsol
    // lama bannget
    //list.asSequence().filter { it % 5 == 0 }.map { it *2 }.forEach { println(it) }
    /*
    * operasi akan dilakukan secara vertikal atau per item, misalnya dimulai angka 1. Karena tidak memenuhi kondisi
    * pada filter maka operasi tidak akan dilanjutkan ke map(). Sampai dengan iterasi ke-5 akan dilakukan mapping, angka 5 akan
    * dikalikan 2 dan ditampilkan pada konsol, setelah itu akan dilanjutkan ke iterasi berikutnya sampai dengan iterasi ke-1 juta.
    * */
    val sequenceNumber = generateSequence(1) { it + 1 }
    sequenceNumber.take(5).forEach { print("$it ") }
}
