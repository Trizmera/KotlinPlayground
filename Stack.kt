class Stack<T> {

    private val list = mutableListOf<T>()

    fun push(element: T) {
        list.add(element)
    }

    fun pop(): T? {
        return if (!isEmpty()) list.removeAt(list.size - 1) else null
    }

    fun peek(): T? {
        return if (!isEmpty()) list[list.size - 1] else null
    }

    fun isEmpty(): Boolean {
        return list.isEmpty()
    }

    fun size(): Int {
        return list.size
    }
}