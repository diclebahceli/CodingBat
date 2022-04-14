public int max1020(int a, int b) {
  boolean a1 = a>=10 && a<=20;
  boolean b1= b>=10 && b<=20;
  if(!(a1||b1))
    return 0;
  else if(a1 && !b1)
    return a;
  else if(!a1 && b1)
    return b;
  else if(a1 && b1 && a>b)
    return a;
  return b;
}
