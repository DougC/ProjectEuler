package level1

object Problem2 {
	lazy val fib: Stream[Int] = Stream.cons(0, Stream.cons(1, fib.zip(fib.tail).map(p => p._1 + p._2)))
	
	implicit def iterableWithSum(it: Iterable[Int]) = new { def sum = it.foldLeft(0)(_ + _) }
	
	
	def main(args: Array[String]) : Unit = {
		println(fib.filter(_ % 2 == 0).takeWhile(_ <= 1000000).sum)
	}
}