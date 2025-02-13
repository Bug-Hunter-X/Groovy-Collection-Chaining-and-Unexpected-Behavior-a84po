def list = [1, 2, 3, 4, 5]

def evenNumbers = list.findAll { it % 2 == 0 }
println evenNumbers // Output: [2, 4]

def doubleEvenNumbers = evenNumbers.collect { it * 2 }
println doubleEvenNumbers // Output: [4, 8]