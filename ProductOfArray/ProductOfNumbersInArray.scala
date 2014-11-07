print (BigInt(1) to BigInt(100)).product

// (1 to 100).reduceLeft(_ * _)
// But it 'll consider it as Int
// So this will also work, this gives more explanation that we can use our own functions for the numbers
(BigInt(1) to BigInt(100)).reduceLeft(_ * _)