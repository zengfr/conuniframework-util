package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.doubles.DoubleCollections;
import it.unimi.dsi.fastutil.io.BinIO;
import it.unimi.dsi.fastutil.io.TextIO;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class DoubleIterableUtil{ 
public static it.unimi.dsi.fastutil.doubles.DoubleCollection asCollection(it.unimi.dsi.fastutil.doubles.DoubleIterable p0){
return DoubleCollections.asCollection(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleIterable asDoubleIterable(java.lang.CharSequence p0){
return BinIO.asDoubleIterable(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleIterable asDoubleIterable(java.io.File p0){
return BinIO.asDoubleIterable(p0);
}
}
