public boolean strCopies(String str, String sub, int n) {
  if(!str.contains(sub) && n<=0)
    return true;
  else if(n>0 && str.length()<sub.length())
    return false;
  if(str.substring(0,sub.length()).equals(sub))
    return strCopies(str.substring(1,str.length()),sub,n-1);
  return strCopies(str.substring(1,str.length()),sub,n);
  


}
