import operator


dict = {'R':0,'S':0,'P':0}

def make_move(move):
	dict[move] += 1


def get_frequent_move():
	return max(dict.iteritems(), key=operator.itemgetter(1))


make_move("R")
print get_frequent_move()
make_move("S")
make_move("S")
print get_frequent_move()

print dict