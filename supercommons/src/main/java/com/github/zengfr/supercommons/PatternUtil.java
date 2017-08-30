package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PatternUtil{ 
/**
*public static com.google.common.base.Predicate<java.lang.CharSequence> com.google.common.base.Predicates.contains(java.util.regex.Pattern)
*/ 
public static com.google.common.base.Predicate<java.lang.CharSequence> contains(java.util.regex.Pattern p0){
	return com.google.common.base.Predicates.contains(p0);
}
/**
*public static com.google.common.base.Splitter com.google.common.base.Splitter.on(java.util.regex.Pattern)
*/ 
public static com.google.common.base.Splitter on(java.util.regex.Pattern p0){
	return com.google.common.base.Splitter.on(p0);
}
}
