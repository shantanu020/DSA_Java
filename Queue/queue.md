#QUEUE 

1.Queue
2.Circular Queue
3.Deque

>[!NOTE]
>Using Deque we can insert or delete elements at both ends
>Deque has few methods which throw exceptions while others return null value we can understand this by below table
>| **Operation**             | **Throws Exception**   | **Does Not Throw Exception** |
 |---------------------------|------------------------|------------------------------|
 | **Insert at Front**       | `addFirst(e)`          | `offerFirst(e)`              |
 | **Insert at End**         | `addLast(e)`           | `offerLast(e)`               |
 | **Remove from Front**     | `removeFirst()`        | `pollFirst()`                |
 | **Remove from End**       | `removeLast()`         | `pollLast()`                 |
 | **Examine First Element** | `getFirst()`           | `peekFirst()`                |
 | **Examine Last Element**  | `getLast()`            | `peekLast()`                 |


>[!IMPORTANT]

