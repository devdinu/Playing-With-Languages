from multiprocessing import Pool


def reverse(x):
	return int(str(x)[::-1])

def is_all_odd(num):
 	num_in_str = str(num)
	if num_in_str == num_in_str[::-1]:
		mid_index = (len(num_in_str)+1)/2
		half_len_number = num_in_str[:mid_index]
		res = all([ int(d)&1 for d in half_len_number])
		return res
	else:
	     return all([int(d)%2!=0 for d in str(num)])	

def unopt_is_all_odd(num):
	return all([int(d)%2!=0 for d in str(num)])

def get_result(my_range):
	return [ x for x in my_range if reverse(x)!=x and x%10!=0 and is_all_odd(x+reverse(x))]


limit = pow(10,4)
print len(get_result(range(1,limit)))

last_range = 1
result={}
end_result = {}
for i in range(1,5):
	limit = pow(10,i)
	my_range = range(last_range,limit+1)
	result[i] =  Pool().apply_async(get_result(my_range))
	last_range = limit

# print result
# print result[1].get(timeout=10)

# limit=1000

# result_pair = [ (x,x+reverse(x)) for x in range(1,limit+1) if x%10!=0 and is_all_odd(x+reverse(x))]
# print result_pair
# print len(result_pair)

# print result
# print len(result), "len"
# print [x for x in result if is_all_odd(x)]