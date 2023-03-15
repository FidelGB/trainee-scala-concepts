/**
  * 
  */

import shapeless._

object _hlist extends App {
    val normalList = 1 :: "SomeString" :: true :: Nil
    println(normalList)
    val hList = 1 :: "SomeString" :: true :: HNil 
    println(hList)
}
