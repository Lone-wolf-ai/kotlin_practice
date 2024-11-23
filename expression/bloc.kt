// A block is a section of software code enclosed with
//  curly braces ({…}). A block can consist of one or more 
//  statements, preceded by the declarations of variables.
//   A block contains one or more blocks nested within it. 
//   Every function has its own block and main function also contains a block.

fun main(args: Array<String>) {              //start of main block or outer block
    val array = intArrayOf(2, 4, 6, 8)
    for (element in array) {                // start of inner block
       println(element)
    }                                       // end of inner block
}   