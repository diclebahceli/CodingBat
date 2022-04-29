public boolean squirrelPlay(int temp, boolean isSummer) {
  if(temp>=60 && temp<=90)
    return true;
  if(isSummer && temp<=100 && temp>=60)
    return true;
  return false;
}
