public int countHi(String str) {
  if(!str.contains("hi"))
    return 0;
  else if(str.substring(0,2).equals("hi"))
    return 1 + countHi(str.substring(2,str.length()));
  return countHi(str.substring(1,str.length()));
  
  
  
}
