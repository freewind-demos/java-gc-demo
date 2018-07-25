Java GC Demo
============

How to trigger and view the GC information.

-XX:+PrintGC
------------

打印出简单的GC信息。

Run `Hello` with `VM Options`:

- Show GC Log: `-XX:+PrintGC`, or alias `-verbose:gc`
- Specify a small heap: `-Xmx10m`

You will see such log in console:

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


-XX:+PrintGCDetails
-------------------

打印出GC细节信息。

Run `Hello` with `VM Options`:

- Show GC Log: `-XX:+PrintGCDetails`
- Specify a small heap: `-Xmx10m`

You will see such log in console:

```
[GC (System.gc()) [PSYoungGen: 2180K->480K(2560K)] 2487K->803K(9728K), 0.0008510 secs] [Times: user=0.01 sys=0.00, real=0.00 secs]
```

TODO: Complete this next time when I need it.

### Full GC

```
[Full GC (System.gc())
    [PSYoungGen: 480K->0K(2560K)]
    [ParOldGen: 323K->544K(7168K)] 803K->544K(9728K),
    [Metaspace: 3330K->3330K(1056768K)], 0.0052894 secs]
    [Times: user=0.02 sys=0.00, real=0.00 secs]
```

TODO: Complete this next time when I need it.

Resources
---------

- <https://blog.codecentric.de/en/2014/01/useful-jvm-flags-part-8-gc-logging>