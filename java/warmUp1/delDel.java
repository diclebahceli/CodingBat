public String delDel(String str) {
  if(str.contains("del") && str.length()>3){
    int i= str.indexOf('d');
    int j= str.indexOf('l');
    if(j-i==2 && str.charAt(i+1)=='e' && i==1)
      return str.substring(0,i) + str.substring(i+3,str.length());
      
  }
  return str;
}
