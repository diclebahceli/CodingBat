public String changeXY(String str) {
  if(!str.contains("x"))
    return str;
  return changeXY(str.replaceFirst("x","y"));
}
