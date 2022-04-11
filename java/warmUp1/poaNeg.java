public boolean posNeg(int a, int b, boolean negative) {
  if(a*b<0 && negative==false)
    return true;
  if(negative==true && a<0 && b<0)
    return true;
  return false;
}