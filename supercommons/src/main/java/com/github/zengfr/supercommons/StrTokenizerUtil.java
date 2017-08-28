package com.zengfr.supercommons;
import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.text.StrTokenizer;
import org.apache.commons.lang.text.StrTokenizer;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class StrTokenizerUtil{ 
public static org.apache.commons.lang3.text.StrTokenizer getCSVInstance(java.lang.String p0){
return StrTokenizer.getCSVInstance(p0);
}
public static org.apache.commons.lang3.text.StrTokenizer getCSVInstance(){
return StrTokenizer.getCSVInstance();
}
public static org.apache.commons.lang3.text.StrTokenizer getCSVInstance(char[] p0){
return StrTokenizer.getCSVInstance(p0);
}
public static org.apache.commons.lang3.text.StrTokenizer getTSVInstance(){
return StrTokenizer.getTSVInstance();
}
public static org.apache.commons.lang3.text.StrTokenizer getTSVInstance(java.lang.String p0){
return StrTokenizer.getTSVInstance(p0);
}
public static org.apache.commons.lang3.text.StrTokenizer getTSVInstance(char[] p0){
return StrTokenizer.getTSVInstance(p0);
}
}
