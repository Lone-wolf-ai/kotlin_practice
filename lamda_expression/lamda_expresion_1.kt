val sum={a:Int,b:Int ->a+b}

fun main(args:Array<String>){
    val result=sum(1,2)
    val result1=sum1(3,4)
    println(result1)
}

val sum1={a:Int,b:Int -> 
    val num =a+b 
    num.toString()
}


val lambda4 : String.(Int) -> String = { this + it }
val lambda1:(Int)->Int={a->a*a}
val lambda2:(String,String)->String={a,b->a+b}
val lambda3:(Int)->Unit={print(Int)}

val anonomyous1=fun(x:Int,y:Int):Int=x+y
val anonomyous2=fun(a:Int,b:Int):Int{
    val mul=a*b 
    return mul
}

"""Difference between lambda expressions and anonymous functions
The only difference is the behavior of non-local returns. A return statement without a label always returns from the function declared with the fun keyword. This means that a return inside a lambda expression will return from the enclosing function, whereas a return inside an anonymous function will return from the anonymous function itself."""