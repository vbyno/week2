package ua.edu.ucu

import org.scalatest._
import ua.edu.ucu.Lists

class ListsSpec extends FunSpec with Matchers {
  describe("#max") {
    it("max([1,2,3,-1])") {
      assert(max(List(1,2,3,-1)) == 3)
    }
  }
}