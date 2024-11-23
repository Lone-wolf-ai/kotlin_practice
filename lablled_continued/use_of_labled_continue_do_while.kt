fun main(args:Array<String>){
    var num1=4
    outer@ do {
        num1--
        var num2 =4
        inner@ do{
            if(num1<=2)
                continue@outer
            println("num1=$num1;num2=$num2")
            num2--
            
        }while (num2>0)
    }while(num1>0)
}