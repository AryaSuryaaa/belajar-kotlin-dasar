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
data class DataUser(val name: String, val age: Int)

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
}