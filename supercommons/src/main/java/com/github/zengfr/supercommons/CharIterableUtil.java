package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.chars.CharCollections;
import it.unimi.dsi.fastutil.io.BinIO;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CharIterableUtil{ 
public static it.unimi.dsi.fastutil.chars.CharCollection asCollection(it.unimi.dsi.fastutil.chars.CharIterable p0){
return CharCollections.asCollection(p0);
}
public static it.unimi.dsi.fastutil.chars.CharIterable asCharIterable(java.lang.CharSequence p0){
return BinIO.asCharIterable(p0);
}
public static it.unimi.dsi.fastutil.chars.CharIterable asCharIterable(java.io.File p0){
return BinIO.asCharIterable(p0);
}
}
