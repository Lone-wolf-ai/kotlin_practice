fun student( name: String , grade: Char , roll_no: Int) {
    println("Name of the student is : $name")
    println("Grade of the student is: $grade")
    println("Roll no of the student is: $roll_no")

}
fun main(args: Array<String>) {
    val name = "Praveen"
    val rollno = 25
    val grade = 'A'
    student(name,grade,rollno)
    student("Gaurav",'B',30)
}
// -> Disadvantages of Using functions in Kotlin
// Overhead: Functions can increase the size of your code and increase the amount of memory required to execute it, especially if you have many functions.
// Debugging: Functions can make debugging more difficult if you have complex logic inside your functions, especially if you have multiple functions that call each other.