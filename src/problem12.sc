def triangleNumber(n : Int) : Int = {
    (n*n +n)/ 2
}
def divisors(n : Int) : Seq[Int] = {
  n +: ((1 to (n/2)) filter(n % _ == 0))
}

(1 to 10000000).par.view map((x) => (x, divisors(triangleNumber(x)).size)) find(_._2 > 500)

