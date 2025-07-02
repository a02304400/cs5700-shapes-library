class Point (xPosition: Double, yPosition: Double) {
    var xPosition: Double = xPosition
        private set

    var yPosition: Double = yPosition
        private set

    fun clone(): Point {
        return Point(xPosition, yPosition)
    }

    fun move(deltaX: Double, deltaY: Double) {
        xPosition += deltaX
        yPosition += deltaY
    }
}