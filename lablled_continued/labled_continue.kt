// Labeled continue is used to skip the iteration of the desired block when it satisfies a specific condition without checking the condition in the while loop. If you mark the outer loop using the label outer@ and inner loop using inner@ then you can easily skip for the specific condition using continue@outer in the conditional block.
// The syntax for labeled continue in while loop-

fun main(args: Array<String>) {

	var num1 = 4
	outer@ while (num1 > 0) {
		num1--
		var num2 = 4

		inner@ while (num2 > 0) {
			if (num1 <= 2)
				continue@outer
			println("num1 = $num1, num2 = $num2")
			num2--
		}
	}
}
