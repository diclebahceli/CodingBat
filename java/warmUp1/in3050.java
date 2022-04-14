public boolean in3050(int a, int b) {
  boolean a1= a>=30 && a<=40;
  boolean b1= b>=30 && b<=40;
  boolean a2= a>=40 && a<=50;
  boolean b2= b>=40 && b<=50;
  
  if(a1 && b1 || a2 && b2)
    return true;
    return false;
  
}
