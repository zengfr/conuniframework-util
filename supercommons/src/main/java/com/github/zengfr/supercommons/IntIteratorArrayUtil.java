package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.ints.IntIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IntIteratorArrayUtil{ 
public static it.unimi.dsi.fastutil.ints.IntIterator concat(it.unimi.dsi.fastutil.ints.IntIterator[] p0,int p1,int p2){
return IntIterators.concat(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.IntIterator concat(it.unimi.dsi.fastutil.ints.IntIterator[] p0){
return IntIterators.concat(p0);
}
}
