# https://projecteuler.net/problem=33

from fractions import gcd

def prod(arr):
	prod = 1
	for i in arr:
		prod *= i
	return prod

# Get the decimal value from the non-trivial fractions
def nontrivialdenom(num1, num2):
	from fractions import gcd
	arr1 = list(str(num1))
	arr2 = list(str(num2))
	temp = list(arr1)
	finalarr = []
	for i in arr1:
		if i not in arr2:
			finalarr.append(i)
	for i in arr2:
		if i not in arr1:
			finalarr.append(i)
	finalarr = [int(x) for x in finalarr]
	if len(finalarr) == 2:
		return finalarr[0]/finalarr[1]

# Check to see if the denominator and the numerator share a common digit
def sharesomething(num1, num2):
	arr1 = list(str(num1))
	arr2 = list(str(num2))
	counter = 0
	for i in arr1:
		if i in arr2:
			counter += 1
	if counter >= 1:
		return True
	else:
		return False

# Putting everything together
arr = []
for i in range(11,100):
	for j in range(11,i):
		if sharesomething(j,i) and i%10 != 0 and j%10 != 0 and nontrivialdenom(j,i)==j/i:
			arr.append(nontrivialdenom(j,i))


print(1000//(gcd(int(1000*prod(arr)),1000)))