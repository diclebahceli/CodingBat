public String noX(String str) {
  if(!str.contains("x"))
    return str;
  return noX(str.replaceFirst("x",""));
}
