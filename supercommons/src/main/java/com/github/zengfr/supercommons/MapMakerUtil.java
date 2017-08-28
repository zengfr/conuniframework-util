package com.zengfr.supercommons;
import com.google.common.collect.ConcurrentHashMultiset;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MapMakerUtil{ 
public static <E> com.google.common.collect.ConcurrentHashMultiset<E> create(com.google.common.collect.MapMaker p0){
return ConcurrentHashMultiset.create(p0);
}
}
