fun main(args: Array<String>) { 
	var names = arrayOf("Earth","Mars","Venus","Jupiter","Saturn","Uranus") 
	var i = 0

	do{ 
		println("The name of $i th planet: "+names[i]) 
		if(names[i]=="Jupiter") { 
			break
		} 
		i++ 
	}while(i<=names.size) 
} 
