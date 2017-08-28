package com.zengfr.supercommons;
import org.apache.commons.text.AlphabetConverter;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class AlphabetConverterUtil{ 
public static org.apache.commons.text.AlphabetConverter createConverter(java.lang.Integer[] p0,java.lang.Integer[] p1,java.lang.Integer[] p2){
return AlphabetConverter.createConverter(p0,p1,p2);
}
public static org.apache.commons.text.AlphabetConverter createConverterFromMap(java.util.Map<java.lang.Integer, java.lang.String> p0){
return AlphabetConverter.createConverterFromMap(p0);
}
public static org.apache.commons.text.AlphabetConverter createConverterFromChars(java.lang.Character[] p0,java.lang.Character[] p1,java.lang.Character[] p2){
return AlphabetConverter.createConverterFromChars(p0,p1,p2);
}
}
