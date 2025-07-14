fun evenFilter(numbers: Set<Int>): Set<Int> = numbers.toList().filter({ it%2==0 }).toSet()
