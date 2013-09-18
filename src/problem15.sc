val max = 20

def route (x :BigInt, y: BigInt) : BigInt = {
  if(x >= max && y >= max)
    1
  else if(x == max)
    route(x, y+1)
  else if(y == max)
    route(x+1, y)
  else
    route(x+1, y) + route(x, y+1)
}


route(0,0)