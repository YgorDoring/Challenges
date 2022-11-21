// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class User(val nome: String, val email: String)

data class EducationalContent(val nome: String, val duracao: Int)

data class Formation(var nome: String, var conteudos: List<EducationalContent>, var nivel: Nivel) {

    val subscription = mutableListOf<User>()

    fun registration(user: User) {
        subscription.add(user)
    }

    fun contactList() {
        for (user in subscription) {
            println(user.nome)
        }
    }

    fun formationContent() {
        for (i in conteudos) {
            println("${i.nome} - ${i.duracao}")
        }
    }
}

fun main() {

    val kotlinExperience = EducationalContent("Kotlin Experience", 160)
    val androidDeveloper = EducationalContent("Android Bootcamp Developer", 120)
    val contentList = mutableListOf<EducationalContent>()
    contentList.add(kotlinExperience)
    contentList.add(androidDeveloper)


    val androidDev = Formation("Android Developer", contentList, Nivel.INTERMEDIARIO)
    val kotlinDev = Formation("Kotlin Developer", contentList, Nivel.AVANCADO)
    val basicJavaDev = Formation("Basic Java Developer", contentList, Nivel.BASICO)

    val user1 = User("Camila", "camila@gmail.com")
    val user2 = User("Arthur", "arthur@gmail.com")
    val user3 = User("Ygor", "developer@ygordoring.dev")


    androidDev.registration(user1)
    kotlinDev.registration(user2)
    basicJavaDev.registration(user3)

    println("Dados da formação")
    println("------------------")

    println("${androidDev.nome} - ${androidDev.nivel}")
    println("${androidDev.formationContent()}")
    println("${androidDev.contactList()}")

    println("---")
    println("${kotlinDev.nome} - ${kotlinDev.nivel}")
    println("${kotlinDev.formationContent()}")

    println("---")
    println("${basicJavaDev.nome} - ${basicJavaDev.nivel}")
    println("${basicJavaDev.formationContent()}")

}