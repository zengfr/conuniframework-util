package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.shorts.ShortIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ShortIteratorArrayUtil{ 
public static it.unimi.dsi.fastutil.shorts.ShortIterator concat(it.unimi.dsi.fastutil.shorts.ShortIterator[] p0,int p1,int p2){
return ShortIterators.concat(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.ShortIterator concat(it.unimi.dsi.fastutil.shorts.ShortIterator[] p0){
return ShortIterators.concat(p0);
}
}
