public int strDist(String str, String sub) {
  if(!str.contains(sub))
    return 0;
  if(!str.substring(0,sub.length()).equals(sub))
    return strDist(str.substring(1,str.length()),sub);
  else if(!str.substring(str.length()-sub.length(),str.length()).equals(sub))
    return strDist(str.substring(0,str.length()-1),sub);
  return str.length();
  
  
}
