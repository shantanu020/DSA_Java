# HashMap

> HashMaps (also known as hash tables) were introduced to solve problems related to efficient data retrieval, insertion, and deletion while maintaining a key-value association.

| Operation      | Average Time | Worst Time |
|----------------|--------------|------------|
| Insertion      | O(1)         | O(n)       |
| Access (get)   | O(1)         | O(n)       |
| Deletion       | O(1)         | O(n)       |
| Search         | O(1)/O(n)    | O(n)       |


## Collision resolution technique in hashing

> 1.Open Addressing
    -Linear Probing: pos=(hf(v)+i)%m  {i is number of probes}
        -Problem of primary clustering (two or more values follow same path to reach to an empty key)
    -Quadratic Probing: pos=(hf(v)+c1*i+c2*i^2)%m
        -Limitations are loss of data and Secondary clustering 
    -Double Hashing: pos=(hf1(v)+hf2(v)*i)%m
        -Limitation is loss of data
        

> 2.Chaining (not effiecient as it uses extra space outside the hash table)



## Various functions of HashMap

> 1.put() - to add key value pair
> 2.get() - to get value at any particular key
> 3.remove() - to remove a key value pair
> 4.entrySet() - used to retrieve all key value pair as set of Map.Entry objects
> 5.containsKey() - returns true if key is present

## Map Interface
    -LinkedHashMap : Stores data on the basis of insertion
    -HashMap : Stores data in unordered manner
    -TreeMap : Stores data in Sorted manner in terms of key (uses red black tree internally)
    -HashTable : Stores key value pair on the basis of hash function
        -Load Factor : Load factor is number of elements in HashTable divided by size of HashTable. If a hashtable's load factor increases to 0.75 then it is rehashed internally
        