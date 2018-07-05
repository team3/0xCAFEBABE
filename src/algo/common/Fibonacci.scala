package algo.common

class Fibonacci {
  def fibRec(N: Int): Int = {
    if (N == 0) 0
    else if (N == 1) 1
    else fibRec(N - 1) + fibRec(N - 2)
  }

  def fib: Int => Int = (N: Int) => {
    var first: Int = 0
    var second: Int = 1
    var idx = 0

    while (idx <= N) {
      val sum = first + second

      first = second
      second = sum
      idx += 1
    }

    first
  }

  def main(args: Array[String]): Unit = {
    print(fibRec(5))
    print(fib(5))
  }
}
