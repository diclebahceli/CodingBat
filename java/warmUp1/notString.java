public String notString(String str) {
  if(str.contains("not")){
    if(str.charAt(0)== 'n')
      return str;
  }
  return "not " + str;
}