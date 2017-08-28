package com.github.zengfr.supercommons;
import org.apache.commons.lang.CharRange;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CharRangeUtil{ 
public static org.apache.commons.lang.CharRange is(char p0){
return CharRange.is(p0);
}
public static org.apache.commons.lang.CharRange isNot(char p0){
return CharRange.isNot(p0);
}
public static org.apache.commons.lang.CharRange isNotIn(char p0,char p1){
return CharRange.isNotIn(p0,p1);
}
public static org.apache.commons.lang.CharRange isIn(char p0,char p1){
return CharRange.isIn(p0,p1);
}
}
