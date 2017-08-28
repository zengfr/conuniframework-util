package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.doubles.DoubleIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class DoubleIteratorArrayUtil{ 
public static it.unimi.dsi.fastutil.doubles.DoubleIterator concat(it.unimi.dsi.fastutil.doubles.DoubleIterator[] p0,int p1,int p2){
return DoubleIterators.concat(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.DoubleIterator concat(it.unimi.dsi.fastutil.doubles.DoubleIterator[] p0){
return DoubleIterators.concat(p0);
}
}
