public String everyNth(String str, int n) {
  String newS = "";
  for(int i=0;i<str.length();i++){
    if(i%n==0)
      newS += str.charAt(i);
  }
  return newS;
}
