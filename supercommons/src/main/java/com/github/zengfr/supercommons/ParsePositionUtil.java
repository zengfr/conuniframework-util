package com.zengfr.supercommons;
import org.apache.commons.math3.util.CompositeFormat;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ParsePositionUtil{ 
public static void parseAndIgnoreWhitespace(java.lang.String p0,java.text.ParsePosition p1){
 CompositeFormat.parseAndIgnoreWhitespace(p0,p1);
}
public static char parseNextCharacter(java.lang.String p0,java.text.ParsePosition p1){
return CompositeFormat.parseNextCharacter(p0,p1);
}
public static boolean parseFixedstring(java.lang.String p0,java.lang.String p1,java.text.ParsePosition p2){
return CompositeFormat.parseFixedstring(p0,p1,p2);
}
public static java.lang.Number parseNumber(java.lang.String p0,java.text.NumberFormat p1,java.text.ParsePosition p2){
return CompositeFormat.parseNumber(p0,p1,p2);
}
}
