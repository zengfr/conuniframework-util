package com.github.zengfr.supercommons;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.text.AlphabetConverter;
import org.apache.commons.lang.ArrayUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CharacterArrayUtil{ 
public static java.lang.Character[] nullToEmpty(java.lang.Character[] p0){
return ArrayUtils.nullToEmpty(p0);
}
public static java.lang.Character[] toObject(char[] p0){
return ArrayUtils.toObject(p0);
}
public static char[] toPrimitive(java.lang.Character[] p0){
return ArrayUtils.toPrimitive(p0);
}
public static char[] toPrimitive(java.lang.Character[] p0,char p1){
return ArrayUtils.toPrimitive(p0,p1);
}
public static org.apache.commons.text.AlphabetConverter createConverterFromChars(java.lang.Character[] p0,java.lang.Character[] p1,java.lang.Character[] p2){
return AlphabetConverter.createConverterFromChars(p0,p1,p2);
}
}
