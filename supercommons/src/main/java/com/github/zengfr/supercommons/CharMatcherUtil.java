package com.zengfr.supercommons;
import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CharMatcherUtil{ 
public static com.google.common.base.CharMatcher digit(){
return CharMatcher.digit();
}
public static com.google.common.base.CharMatcher ascii(){
return CharMatcher.ascii();
}
public static com.google.common.base.CharMatcher is(char p0){
return CharMatcher.is(p0);
}
public static com.google.common.base.CharMatcher inRange(char p0,char p1){
return CharMatcher.inRange(p0,p1);
}
public static com.google.common.base.CharMatcher breakingWhitespace(){
return CharMatcher.breakingWhitespace();
}
public static com.google.common.base.CharMatcher javaLetterOrDigit(){
return CharMatcher.javaLetterOrDigit();
}
public static com.google.common.base.CharMatcher javaDigit(){
return CharMatcher.javaDigit();
}
public static com.google.common.base.CharMatcher javaUpperCase(){
return CharMatcher.javaUpperCase();
}
public static com.google.common.base.CharMatcher javaIsoControl(){
return CharMatcher.javaIsoControl();
}
public static com.google.common.base.CharMatcher singleWidth(){
return CharMatcher.singleWidth();
}
public static com.google.common.base.CharMatcher invisible(){
return CharMatcher.invisible();
}
public static com.google.common.base.CharMatcher whitespace(){
return CharMatcher.whitespace();
}
public static com.google.common.base.CharMatcher noneOf(java.lang.CharSequence p0){
return CharMatcher.noneOf(p0);
}
public static com.google.common.base.CharMatcher none(){
return CharMatcher.none();
}
public static com.google.common.base.CharMatcher anyOf(java.lang.CharSequence p0){
return CharMatcher.anyOf(p0);
}
public static com.google.common.base.CharMatcher javaLowerCase(){
return CharMatcher.javaLowerCase();
}
public static com.google.common.base.CharMatcher any(){
return CharMatcher.any();
}
public static com.google.common.base.CharMatcher isNot(char p0){
return CharMatcher.isNot(p0);
}
public static com.google.common.base.CharMatcher javaLetter(){
return CharMatcher.javaLetter();
}
public static com.google.common.base.CharMatcher forPredicate(com.google.common.base.Predicate<? super java.lang.Character> p0){
return CharMatcher.forPredicate(p0);
}
public static com.google.common.base.Splitter on(com.google.common.base.CharMatcher p0){
return Splitter.on(p0);
}
}
