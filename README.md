# Utils

Utils is a java utility library that contains partition() method to partition list into sub-lists with maximum number of elemets.

## Installation

Import the dependency into the project 

```java
<dependency>
     <groupId>com.adneom.utils</groupId>
     <artifactId>utils</artifactId>
     <version>1.0</version>
</dependency>
```


## Usage


```java
import com.adneom.utils.Utils

// Integer list
List<List<Integer>> listOfInt = Utils.partition(listToPartition, maxSize);
//exemple
List<List<Integer>> listOfInt = Utils.partition(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7), 4);

// String list
List<List<String>> listOfString = Utils.partition(Arrays.asList("AA", "BB", "CC"), 2);
```
