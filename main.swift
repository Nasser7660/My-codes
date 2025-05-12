/*
Nasser Alblooshi
784-2007-6290350-6
21103356
12CAI
*/

import Foundation

// Simulate rolling a six-sided dice until the value 1 is rolled
print("Rolling the dice...")

var diceValue: Int

// Initialize the dice rolling process
repeat {
    diceValue = Int.random(in: 1...6) // Generate a random number between 1 and 6
    print("Dice rolled: \(diceValue)")
} while diceValue != 1
