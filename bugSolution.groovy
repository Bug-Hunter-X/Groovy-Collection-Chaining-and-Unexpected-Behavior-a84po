def list = [1, 2, 3, 4, 5]

def doubledEvenNumbers = list.findAll { it % 2 == 0 }.collect { it * 2 }
println doubledEvenNumbers // Output: [4, 8]

//Alternative solution using inject
def list = [1, 2, 3, 4, 5]
def doubledEvenNumbers = list.inject([]) { acc, it -> if (it % 2 == 0) acc << it * 2 else acc }
println doubledEvenNumbers //Output: [4, 8]