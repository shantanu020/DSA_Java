# Queue Data Structures

## 1. Queue
A **Queue** is a linear data structure that follows the First-In-First-Out (FIFO) principle, where the first element added to the queue will be the first one to be removed.

### Common Operations:
- **Enqueue**: Add an element to the end of the queue.
- **Dequeue**: Remove an element from the front of the queue.
- **Front/Peek**: Retrieve the front element without removing it.
- **IsEmpty**: Check if the queue is empty.

---

## 2. Circular Queue
A **Circular Queue** is an advanced version of a linear queue where the last position is connected back to the first position, making it circular. This helps in utilizing the available space more efficiently.

### Key Benefits:
- No wasted space when elements are dequeued, allowing for continuous insertion and deletion.
- It avoids the need to shift elements, enhancing performance.

---

## 3. Deque (Double-Ended Queue)
A **Deque** (Double-Ended Queue) allows insertion and deletion of elements from both ends. This makes it more flexible than a regular queue or circular queue.

### Operations in Deque:
- **Insert at Front**: Add an element to the front.
- **Insert at End**: Add an element to the end.
- **Remove from Front**: Remove an element from the front.
- **Remove from End**: Remove an element from the end.
- **Examine First Element**: Get the front element without removal.
- **Examine Last Element**: Get the last element without removal.

### Exception Handling in Deque
The following table summarizes how different methods behave with respect to exceptions and null values:

| **Operation**             | **Throws Exception**                       | **Does Not Throw Exception**             |
|---------------------------|--------------------------------------------|------------------------------------------|
| **Insert at Front**       | `addFirst(e)`                             | `offerFirst(e)`                          |
| **Insert at End**         | `addLast(e)`                              | `offerLast(e)`                           |
| **Remove from Front**     | `removeFirst()`                           | `pollFirst()`                            |
| **Remove from End**       | `removeLast()`                            | `pollLast()`                             |
| **Examine First Element** | `getFirst()`                              | `peekFirst()`                            |
| **Examine Last Element**  | `getLast()`                               | `peekLast()`                             |

---

## Important Notes
- **Queue**: Use when you need to manage data in a strict FIFO manner (e.g., printing tasks, process scheduling).
- **Circular Queue**: Use when you need a queue with a fixed size that can reuse space efficiently (e.g., buffering).
- **Deque**: Use when you require both FIFO and LIFO access (e.g., implementing stacks, managing palindromic sequences).

### Additional Notes:
- Deques can be implemented using arrays or linked lists, providing flexibility in performance based on the underlying structure.
- In Java, the `ArrayDeque` and `LinkedList` classes can be used to implement deques, with `ArrayDeque` typically offering better performance.
