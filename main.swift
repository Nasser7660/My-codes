/* Nasser Alblooshi
21103356
784-2007-6290350-6
12CAI
*/
class Shape {
    func getArea() -> Double {
        return 0
    }
}

class Rectangle: Shape {
    var width: Double
    var height: Double
    init(width: Double, height: Double) {
        self.width = width
        self.height = height
    }
    override func getArea() -> Double {
        return width * height
    }
}

class Circle: Shape {
    var radius: Double
    init(radius: Double) {
        self.radius = radius
    }
    override func getArea() -> Double {
        return Double.pi * radius * radius
    }
}

let rectangle = Rectangle(width: 3, height: 4)
let circle = Circle(radius: 2)

// PC8.7
let shapes: [Shape] = [rectangle, circle]  // Collection of Shape objects

for shape in shapes {
    print("Area: \(shape.getArea())")
}
