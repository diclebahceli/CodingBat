public String front22(String str) {
  if(str.length()<=1)
    return str+str+str;
  return str.substring(0,2)+str+str.substring(0,2);
}
