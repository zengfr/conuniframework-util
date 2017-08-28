package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.chars.CharBigListIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CharBigListIteratorUtil{ 
public static it.unimi.dsi.fastutil.chars.CharBigListIterator singleton(char p0){
return CharBigListIterators.singleton(p0);
}
public static it.unimi.dsi.fastutil.chars.CharBigListIterator unmodifiable(it.unimi.dsi.fastutil.chars.CharBigListIterator p0){
return CharBigListIterators.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.chars.CharBigListIterator asBigListIterator(it.unimi.dsi.fastutil.chars.CharListIterator p0){
return CharBigListIterators.asBigListIterator(p0);
}
}
