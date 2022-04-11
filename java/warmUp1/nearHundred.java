public boolean nearHundred(int n) {
  int diff1 = Math.abs(n-100);
  int diff2 = Math.abs(n-200);
  if((diff1>=0 && diff1<=10) || (diff2>=0 && diff2<=10))
    return true;
  return false;
}