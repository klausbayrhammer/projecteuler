((3 to 1001 by 2).map((n) => (n, (n-2)*(n-2))).map ((t) => t._2+t._1-1 + t._2 + 2*t._1-2 + t._2 + 3*t._1-3 + (t._2 +4*t
  ._1-4)) sum) + 1

