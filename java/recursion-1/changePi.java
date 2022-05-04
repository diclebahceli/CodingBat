public String changePi(String str) {
  if(!str.contains("pi"))
    return str;
  return changePi(str.replaceFirst("pi","3.14"));
}
