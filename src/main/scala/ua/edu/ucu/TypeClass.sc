trait SemiGroup[A] {
  def add(x: A, y: A): A
}
// Here’s a subclass Monoid of SemiGroup which adds a unit element.
trait Monoid[A] extends SemiGroup[A] {
  def unit: A
}
// Here are two implementations of monoids:
object stringMonoid extends Monoid[String] {
  def add(x: String, y: String): String = x.concat(y)
  def unit: String = ""
}
object intMonoid extends Monoid[Int] {
  def add(x: Int, y: Int): Int = x + y
  def unit: Int = 0
}

def sum[A](xs: List[A])(/*???*/): A = ???