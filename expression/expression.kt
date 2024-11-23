// Kotlin Expression –
// An expression consists of variables, operators, methods calls etc that produce a single value. Like other language, Kotlin expression is building blocks of any program that are usually created to produce new value. Sometimes, it can be used to assign a value to a variable in a program. It is to be noted that an expression can contain another expression.  

// A variable declaration can not be an expression (var a = 100)
// Assigning a value is not an expression (b = 15)
// A class declaration is not an expression (class XYZ {….})
// Note: In Kotlin every function returns a value atleast Unit, so every function is an expression.
// Let’s take an example: 


fun sumOf(a:Int,b:Int): Int{
    return a+b
}
 
fun main(args: Array<String>){
    val a = 10
    val b = 5
    var sum = sumOf(a,b)
    var mul = a * b
    println(sum)
    println(mul)
}