class Queue<T> {
    private val list = mutableListOf<T>()

    fun enqueue(element: T) {
        list.add(element)
    }

    fun dequeue(): T? {
        return if (!isEmpty()) list.removeAt(0) else null
    }

    fun peek(): T? {
        return if (!isEmpty()) list[0] else null
    }

    fun isEmpty(): Boolean {
        return list.isEmpty()
    }

    fun size(): Int {
        return list.size
    }



}