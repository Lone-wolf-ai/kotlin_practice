

//we can use @foreach to do the loop task
// fun main(args: Array<String>)
//  { var name = "GeeksforGeeks"; name.forEach { if (it == 's') return@forEach; println(it) } }

fun main(args:Array<String>){
    var name="GeeeksforGeeks"
    for(i in name){
        print(i)
        if(i=='s')break  //'s' and "s" is defferent:'s' reffer char and "s" string
    }
}