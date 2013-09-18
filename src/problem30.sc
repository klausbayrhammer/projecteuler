((2 to 999999) map((y) => (y, (y.toString map ((x) => Math.pow(x.asDigit, 5))).sum)) filter((x) =>x._1 == x._2)).foldLeft(0) ((x, y) => x + y._1 )


