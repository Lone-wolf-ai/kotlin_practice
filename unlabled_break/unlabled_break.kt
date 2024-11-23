fun main(args: Array<String>) { 
	var sum = 0
	var i = 1
    println(Int.MAX_VALUE)
	while(i <= Int.MAX_VALUE) { //int.max_value=
		sum += i 
		i++ 
		if(i == 11)  
			break
		
	} 
	print("The sum of integers from 1 to 10: $sum") 
} 

