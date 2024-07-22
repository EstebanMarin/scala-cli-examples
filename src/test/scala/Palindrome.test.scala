//> using test.dep org.scalameta::munit::1.0.0
//> using file ../../main/scala/palindrome.scala

class MyTests extends munit.FunSuite:

  test("foo"):
    assert(2 + 2 == 4)

  test("palindrome"):
    assert(palindrome("lol") == true)
