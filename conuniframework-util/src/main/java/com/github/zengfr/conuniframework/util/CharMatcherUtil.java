package com.github.zengfr.conuniframework.util;
import java.util.*;
import java.util.Map.Entry;
import com.google.common.collect.Table;
import com.google.common.collect.Table.Cell;
/**
* @author zengfr
* @author https://github.com/zengfr/conuniframework-util
* @author https://gitee.com/zengfr/conuniframework-util
* @author  http://blog.csdn.net/zfrong/
* @author zengfr3000@qq.com
*/
public final class CharMatcherUtil{ 
/**
*{@link com.google.common.base.CharMatcher#any()}
*@see com.google.common.base.CharMatcher#any()
*<code>public static com.google.common.base.CharMatcher com.google.common.base.CharMatcher.any()
*any()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.base.CharMatcher any(){
	return com.google.common.base.CharMatcher.any();
}
/**
*{@link com.google.common.base.CharMatcher#anyOf(java.lang.CharSequence)}
*@see com.google.common.base.CharMatcher#anyOf(java.lang.CharSequence)
*<code>public static com.google.common.base.CharMatcher com.google.common.base.CharMatcher.anyOf(java.lang.CharSequence)
*anyOf(java.lang.CharSequence p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.base.CharMatcher anyOf(java.lang.CharSequence p0){
	return com.google.common.base.CharMatcher.anyOf(p0);
}
/**
*{@link com.google.common.base.CharMatcher#ascii()}
*@see com.google.common.base.CharMatcher#ascii()
*<code>public static com.google.common.base.CharMatcher com.google.common.base.CharMatcher.ascii()
*ascii()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.base.CharMatcher ascii(){
	return com.google.common.base.CharMatcher.ascii();
}
/**
*{@link com.google.common.base.CharMatcher#breakingWhitespace()}
*@see com.google.common.base.CharMatcher#breakingWhitespace()
*<code>public static com.google.common.base.CharMatcher com.google.common.base.CharMatcher.breakingWhitespace()
*breakingWhitespace()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.base.CharMatcher breakingWhitespace(){
	return com.google.common.base.CharMatcher.breakingWhitespace();
}
/**
*{@link com.google.common.base.CharMatcher#digit()}
*@see com.google.common.base.CharMatcher#digit()
*<code>public static com.google.common.base.CharMatcher com.google.common.base.CharMatcher.digit()
*digit()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.base.CharMatcher digit(){
	return com.google.common.base.CharMatcher.digit();
}
/**
*{@link com.google.common.base.CharMatcher#forPredicate(com.google.common.base.Predicate<? super java.lang.Character>)}
*@see com.google.common.base.CharMatcher#forPredicate(com.google.common.base.Predicate<? super java.lang.Character>)
*<code>public static com.google.common.base.CharMatcher com.google.common.base.CharMatcher.forPredicate(com.google.common.base.Predicate<? super java.lang.Character>)
*forPredicate(com.google.common.base.Predicate<? super java.lang.Character> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.base.CharMatcher forPredicate(com.google.common.base.Predicate<? super java.lang.Character> p0){
	return com.google.common.base.CharMatcher.forPredicate(p0);
}
/**
*{@link com.google.common.base.CharMatcher#inRange(char,char)}
*@see com.google.common.base.CharMatcher#inRange(char,char)
*<code>public static com.google.common.base.CharMatcher com.google.common.base.CharMatcher.inRange(char,char)
*inRange(char p0,char p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.base.CharMatcher inRange(char p0,char p1){
	return com.google.common.base.CharMatcher.inRange(p0,p1);
}
/**
*{@link com.google.common.base.CharMatcher#invisible()}
*@see com.google.common.base.CharMatcher#invisible()
*<code>public static com.google.common.base.CharMatcher com.google.common.base.CharMatcher.invisible()
*invisible()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.base.CharMatcher invisible(){
	return com.google.common.base.CharMatcher.invisible();
}
/**
*{@link com.google.common.base.CharMatcher#is(char)}
*@see com.google.common.base.CharMatcher#is(char)
*<code>public static com.google.common.base.CharMatcher com.google.common.base.CharMatcher.is(char)
*is(char p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.base.CharMatcher is(char p0){
	return com.google.common.base.CharMatcher.is(p0);
}
/**
*{@link com.google.common.base.CharMatcher#isNot(char)}
*@see com.google.common.base.CharMatcher#isNot(char)
*<code>public static com.google.common.base.CharMatcher com.google.common.base.CharMatcher.isNot(char)
*isNot(char p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.base.CharMatcher isNot(char p0){
	return com.google.common.base.CharMatcher.isNot(p0);
}
/**
*{@link com.google.common.base.CharMatcher#javaDigit()}
*@see com.google.common.base.CharMatcher#javaDigit()
*<code>public static com.google.common.base.CharMatcher com.google.common.base.CharMatcher.javaDigit()
*javaDigit()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.base.CharMatcher javaDigit(){
	return com.google.common.base.CharMatcher.javaDigit();
}
/**
*{@link com.google.common.base.CharMatcher#javaIsoControl()}
*@see com.google.common.base.CharMatcher#javaIsoControl()
*<code>public static com.google.common.base.CharMatcher com.google.common.base.CharMatcher.javaIsoControl()
*javaIsoControl()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.base.CharMatcher javaIsoControl(){
	return com.google.common.base.CharMatcher.javaIsoControl();
}
/**
*{@link com.google.common.base.CharMatcher#javaLetter()}
*@see com.google.common.base.CharMatcher#javaLetter()
*<code>public static com.google.common.base.CharMatcher com.google.common.base.CharMatcher.javaLetter()
*javaLetter()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.base.CharMatcher javaLetter(){
	return com.google.common.base.CharMatcher.javaLetter();
}
/**
*{@link com.google.common.base.CharMatcher#javaLetterOrDigit()}
*@see com.google.common.base.CharMatcher#javaLetterOrDigit()
*<code>public static com.google.common.base.CharMatcher com.google.common.base.CharMatcher.javaLetterOrDigit()
*javaLetterOrDigit()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.base.CharMatcher javaLetterOrDigit(){
	return com.google.common.base.CharMatcher.javaLetterOrDigit();
}
/**
*{@link com.google.common.base.CharMatcher#javaLowerCase()}
*@see com.google.common.base.CharMatcher#javaLowerCase()
*<code>public static com.google.common.base.CharMatcher com.google.common.base.CharMatcher.javaLowerCase()
*javaLowerCase()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.base.CharMatcher javaLowerCase(){
	return com.google.common.base.CharMatcher.javaLowerCase();
}
/**
*{@link com.google.common.base.CharMatcher#javaUpperCase()}
*@see com.google.common.base.CharMatcher#javaUpperCase()
*<code>public static com.google.common.base.CharMatcher com.google.common.base.CharMatcher.javaUpperCase()
*javaUpperCase()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.base.CharMatcher javaUpperCase(){
	return com.google.common.base.CharMatcher.javaUpperCase();
}
/**
*{@link com.google.common.base.CharMatcher#none()}
*@see com.google.common.base.CharMatcher#none()
*<code>public static com.google.common.base.CharMatcher com.google.common.base.CharMatcher.none()
*none()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.base.CharMatcher none(){
	return com.google.common.base.CharMatcher.none();
}
/**
*{@link com.google.common.base.CharMatcher#noneOf(java.lang.CharSequence)}
*@see com.google.common.base.CharMatcher#noneOf(java.lang.CharSequence)
*<code>public static com.google.common.base.CharMatcher com.google.common.base.CharMatcher.noneOf(java.lang.CharSequence)
*noneOf(java.lang.CharSequence p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.base.CharMatcher noneOf(java.lang.CharSequence p0){
	return com.google.common.base.CharMatcher.noneOf(p0);
}
/**
*{@link com.google.common.base.Splitter#on(com.google.common.base.CharMatcher)}
*@see com.google.common.base.Splitter#on(com.google.common.base.CharMatcher)
*<code>public static com.google.common.base.Splitter com.google.common.base.Splitter.on(com.google.common.base.CharMatcher)
*on(com.google.common.base.CharMatcher p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.base.Splitter on(com.google.common.base.CharMatcher p0){
	return com.google.common.base.Splitter.on(p0);
}
/**
*{@link com.google.common.base.CharMatcher#singleWidth()}
*@see com.google.common.base.CharMatcher#singleWidth()
*<code>public static com.google.common.base.CharMatcher com.google.common.base.CharMatcher.singleWidth()
*singleWidth()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.base.CharMatcher singleWidth(){
	return com.google.common.base.CharMatcher.singleWidth();
}
/**
*{@link com.google.common.base.CharMatcher#whitespace()}
*@see com.google.common.base.CharMatcher#whitespace()
*<code>public static com.google.common.base.CharMatcher com.google.common.base.CharMatcher.whitespace()
*whitespace()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.base.CharMatcher whitespace(){
	return com.google.common.base.CharMatcher.whitespace();
}
}
