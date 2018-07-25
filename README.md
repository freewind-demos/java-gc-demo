Java GC Demo
============

How to trigger and view the GC information.

In IDEA:
--------

Run `Hello` with `VM Options`:

- Show GC Log: `-XX:+PrintGC`, or alias `-verbose:gc`
- Specify a small heap: `-Xmx10m`

Read the Log
------------

```
[GC (System.gc())  3941K->664K(251392K), 0.0017948 secs]
 1^  2^^^^^^^^^^   3^^^^  4^^^ 5^^^^^^   6^^^^^^^^^^^^^
```

- 1: 可能值有GC/Full GC，表示当前这次GC是什么类型。应该大多数时候是GC
- 2: 由`System.gc()`调用触发，其它可能值: `Allocation Failure`, `Ergonomics`
- 3: 本次GC前，共占用heap 3941K
- 4: 本次GC的heap占用变成了664K，少了很多
- 5: GC之后，Head的总容量
- 6: 本次GC所花时间

Resources
---------

- <https://blog.codecentric.de/en/2014/01/useful-jvm-flags-part-8-gc-logging>