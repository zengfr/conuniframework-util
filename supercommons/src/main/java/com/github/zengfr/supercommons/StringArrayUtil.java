package com.zengfr.supercommons;
import org.apache.commons.lang3.text.translate.EntityArrays;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class StringArrayUtil{ 
public static java.lang.String[][] invert(java.lang.String[][] p0){
return EntityArrays.invert(p0);
}
public static java.lang.String[][] BASIC_ESCAPE(){
return EntityArrays.BASIC_ESCAPE();
}
public static java.lang.String[][] APOS_ESCAPE(){
return EntityArrays.APOS_ESCAPE();
}
public static java.lang.String[][] ISO8859_1_ESCAPE(){
return EntityArrays.ISO8859_1_ESCAPE();
}
public static java.lang.String[][] APOS_UNESCAPE(){
return EntityArrays.APOS_UNESCAPE();
}
public static java.lang.String[][] BASIC_UNESCAPE(){
return EntityArrays.BASIC_UNESCAPE();
}
public static java.lang.String[][] HTML40_EXTENDED_ESCAPE(){
return EntityArrays.HTML40_EXTENDED_ESCAPE();
}
public static java.lang.String[][] ISO8859_1_UNESCAPE(){
return EntityArrays.ISO8859_1_UNESCAPE();
}
public static java.lang.String[][] HTML40_EXTENDED_UNESCAPE(){
return EntityArrays.HTML40_EXTENDED_UNESCAPE();
}
public static java.lang.String[][] JAVA_CTRL_CHARS_UNESCAPE(){
return EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
}
public static java.lang.String[][] JAVA_CTRL_CHARS_ESCAPE(){
return EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
}
}
