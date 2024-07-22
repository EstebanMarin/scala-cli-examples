# a Scala-cli exercises Poc

a Small PoC to run a single palindrome function with the test.

## commands

```bash
❯ scala-cli repl src/main/scala/palindrome.scala
Compiling project (Scala 3.4.1, JVM (17))
Warning: there was 1 deprecation warning; re-run with -deprecation for details
Compiled project (Scala 3.4.1, JVM (17))
Welcome to Scala 3.4.1 (17.0.5, Java Java HotSpot(TM) 64-Bit Server VM).
Type in expressions for evaluation. Or try :help.
                                                               
scala> palindrome("lol")
val res0: Boolean = true
```

```bash
❯ scala-cli test src/test/scala/Palindrome.test.scala
Compiling project (test, Scala 3.4.1, JVM (17))
Compiled project (test, Scala 3.4.1, JVM (17))
MyTests:
  + foo 0.006s
```
