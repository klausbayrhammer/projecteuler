def fac(x: Int) : Int =
  if(x <= 1)
    1
  else
    x * fac(x-1)

((1 to 1000000) map ((x) => (x, (x.toString map (_.asDigit) map fac).sum))).foldLeft(0) ((s,y) =>
    if(y._1 == y._2)
      s+y._1
    else
      s)

























































































































































































































































































































































































































