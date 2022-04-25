public int strCount(String str, String sub) {
  if(!str.contains(sub))
    return 0;
  if(str.substring(0,sub.length()).equals(sub))
    return 1 +  strCount(str.substring(sub.length(),str.length()),sub);
  return strCount(str.substring(1,str.length()),sub);
}
