def even(n : Int) = n/2
def odd(n : Int) = 3*n+1
def collCache = scala.collection.mutable.Map[Int, Int]()

def collatz (element : Int, count : Int) : Int = {
  if(collCache contains element){
    (collCache.get(element) get) + count
  }
  if(element == 1)
    count
  else
    collatz(if(element % 2 == 0) even(element) else odd(element), count+1)
}


def collatzWithCache(firstNumber : Int) : Int = {
  val result: Int = collatz(firstNumber, 0)
  collCache + (firstNumber -> result)
  result
}


(1 to 999999).par.map(collatzWithCache).zipWithIndex.maxBy(_._1)._2

