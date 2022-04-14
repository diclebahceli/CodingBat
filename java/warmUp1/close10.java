public int close10(int a, int b) {
  int diff1=Math.abs(a-10);
  int diff2 = Math.abs(b-10);
  if(diff1>diff2)
    return b;
  else if(diff2>diff1)
    return a;
  return 0;
}
