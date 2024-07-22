//> using toolkit typelevel:0.1.27
import cats.effect.*
import io.circe.Decoder
import fs2.Stream
import fs2.io.file.*
import org.http4s.ember.client.*
import org.http4s.*
import org.http4s.implicits.*
import org.http4s.circe.*
import cats.syntax.all.*
import scala.annotation.tailrec

// Exercise 1 Palindrome
extension (s: String)
  // tail recursive reverse homegrown implementation
  def reverseI: String =
    @tailrec
    def reverseRec(str: String, acc: String): String =
      if (str.isEmpty) acc
      else reverseRec(str.tail, str.head + acc)
    reverseRec(s, "")
  def removeSpaces: String = s.replaceAll("\\s+", "")
  def lowerCase: String = s.toLowerCase

def palindrome(s: String): Boolean =
  s.removeSpaces.lowerCase === s.removeSpaces.reverseI.lowerCase
