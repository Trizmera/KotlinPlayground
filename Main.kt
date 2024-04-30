class Main {
        fun main() {
            val queue = Queue<Int>()

            queue.enqueue(1)
            queue.enqueue(2)
            queue.enqueue(3)

            println("Dequeued: ${queue.dequeue()}")
            println("Dequeued: ${queue.dequeue()}")

            val stack = Stack<Int>()

            stack.push(1)
            stack.push(2)
            stack.push(3)

            println("Popped: ${stack.pop()}")
            println("Popped: ${stack.pop()}")
        }
}