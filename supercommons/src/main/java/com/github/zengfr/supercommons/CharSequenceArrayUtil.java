package com.zengfr.supercommons;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.WordUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CharSequenceArrayUtil{ 
public static int indexOfDifference(java.lang.CharSequence... p0){
return StringUtils.indexOfDifference(p0);
}
public static java.lang.String appendIfMissingIgnoreCase(java.lang.String p0,java.lang.CharSequence p1,java.lang.CharSequence... p2){
return StringUtils.appendIfMissingIgnoreCase(p0,p1,p2);
}
public static java.lang.String prependIfMissingIgnoreCase(java.lang.String p0,java.lang.CharSequence p1,java.lang.CharSequence... p2){
return StringUtils.prependIfMissingIgnoreCase(p0,p1,p2);
}
public static boolean isAnyEmpty(java.lang.CharSequence... p0){
return StringUtils.isAnyEmpty(p0);
}
public static int indexOfAny(java.lang.CharSequence p0,java.lang.CharSequence... p1){
return StringUtils.indexOfAny(p0,p1);
}
public static boolean isAnyBlank(java.lang.CharSequence... p0){
return StringUtils.isAnyBlank(p0);
}
public static boolean isNoneEmpty(java.lang.CharSequence... p0){
return StringUtils.isNoneEmpty(p0);
}
public static boolean isNoneBlank(java.lang.CharSequence... p0){
return StringUtils.isNoneBlank(p0);
}
public static boolean containsAny(java.lang.CharSequence p0,java.lang.CharSequence... p1){
return StringUtils.containsAny(p0,p1);
}
public static int lastIndexOfAny(java.lang.CharSequence p0,java.lang.CharSequence... p1){
return StringUtils.lastIndexOfAny(p0,p1);
}
public static boolean endsWithAny(java.lang.CharSequence p0,java.lang.CharSequence... p1){
return StringUtils.endsWithAny(p0,p1);
}
public static java.lang.String appendIfMissing(java.lang.String p0,java.lang.CharSequence p1,java.lang.CharSequence... p2){
return StringUtils.appendIfMissing(p0,p1,p2);
}
public static boolean startsWithAny(java.lang.CharSequence p0,java.lang.CharSequence... p1){
return StringUtils.startsWithAny(p0,p1);
}
public static java.lang.String prependIfMissing(java.lang.String p0,java.lang.CharSequence p1,java.lang.CharSequence... p2){
return StringUtils.prependIfMissing(p0,p1,p2);
}
public static boolean containsAllWords(java.lang.CharSequence p0,java.lang.CharSequence... p1){
return WordUtils.containsAllWords(p0,p1);
}
}
