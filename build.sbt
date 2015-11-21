tutSettings

scalaVersion := "2.11.4"

lazy val check = TaskKey[Unit]("check")

check := {
//  val expected = IO.readLines(file("expect.md"))
  val actual   = IO.readLines(crossTarget.value / "tut"/ "test.md")
  println(actual.mkString("\n"))
  // if (expected != actual)
  //   error("Output doesn't match expected: \n" + actual.mkString("\n"))
}
