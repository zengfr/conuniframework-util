package com.github.zengfr.supercommons;
import com.google.common.escape.Escapers;
import org.apache.commons.lang3.text.translate.UnicodeEscaper;
import org.apache.commons.text.translate.UnicodeEscaper;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class UnicodeEscaperUtil{ 
public static java.lang.String computeReplacement(com.google.common.escape.UnicodeEscaper p0,int p1){
return Escapers.computeReplacement(p0,p1);
}
public static org.apache.commons.lang3.text.translate.UnicodeEscaper above(int p0){
return UnicodeEscaper.above(p0);
}
public static org.apache.commons.lang3.text.translate.UnicodeEscaper below(int p0){
return UnicodeEscaper.below(p0);
}
public static org.apache.commons.lang3.text.translate.UnicodeEscaper between(int p0,int p1){
return UnicodeEscaper.between(p0,p1);
}
public static org.apache.commons.lang3.text.translate.UnicodeEscaper outsideOf(int p0,int p1){
return UnicodeEscaper.outsideOf(p0,p1);
}
}
