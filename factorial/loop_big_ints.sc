def printVals(arg:Int) = {
	def facts(n:Int, acc:Int):Int = {
		if(n > arg) acc
		else {
			var value = acc * n
			println(n+": "+value)
			if(value < 0) println("omg! " + n + "!, It reached Max Value");
			facts(n+1, value)
		}
	}
	facts(1,1)
}
	
printVals(18)
	

