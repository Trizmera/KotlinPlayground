class Main {
        fun main() {
            val queue = Queue<Int>()

            queue.enqueue(1)
            queue.enqueue(2)
            queue.enqueue(3)

            println("Dequeued: ${queue.dequeue()}")
            println("Dequeued: ${queue.dequeue()}")
        }
}