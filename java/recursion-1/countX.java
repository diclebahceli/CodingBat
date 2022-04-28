public int countX(String str) {
  if(!str.contains("x"))
    return 0;
  else if(str.charAt(0)=='x')
    return 1 + countX(str.substring(1,str.length()));
  return countX(str.substring(1,str.length()));
}
