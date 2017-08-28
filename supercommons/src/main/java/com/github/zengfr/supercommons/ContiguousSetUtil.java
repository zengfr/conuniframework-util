package com.zengfr.supercommons;
import com.google.common.collect.ContiguousSet;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ContiguousSetUtil{ 
public static <C extends java.lang.Comparable > com.google.common.collect.ContiguousSet<C> create(com.google.common.collect.Range<C> p0,com.google.common.collect.DiscreteDomain<C> p1){
return ContiguousSet.create(p0,p1);
}
}
