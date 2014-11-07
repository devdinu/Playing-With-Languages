var moves_count = scala.collection.mutable.Map("R"->0, "P"->0, "S"->0)
def makeMove(move:String) = moves_count(move) += 1
def getFrequentMove = moves_count.maxBy(_._2)._1
makeMove("R")
println("Far more Cooool!" + getFrequentMove)

makeMove("S")
makeMove("S")
println("Far more Cooool!" + getFrequentMove)

println(moves_count)