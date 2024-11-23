fun main (args :Array<String>) {
	print("Enter name of the planet: ")
	// var name=readLine()!!.toString()
	var  name="Earth"
	when(name) {
		"Mercury","Earth","Mars","Jupiter"
			,"Neptune","Saturn","Venus","Uranus" -> print("This is a planet")
		else -> print("This not a planet")
	}
}
