package com.zengfr.supercommons;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.event.EventUtils;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.ImmutableTriple;
import org.apache.commons.lang3.tuple.Triple;
import org.apache.commons.lang3.tuple.MutablePair;
import org.apache.commons.lang3.tuple.MutableTriple;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LUtil{ 
public static <L,R> org.apache.commons.lang3.tuple.Pair<L, R> of(L p0,R p1){
return Pair.of(p0,p1);
}
public static <L> void addEventListener(java.lang.Object p0,java.lang.Class<L> p1,L p2){
 EventUtils.addEventListener(p0,p1,p2);
}
public static <L,M,R> org.apache.commons.lang3.tuple.ImmutableTriple<L, M, R> of(L p0,M p1,R p2){
return ImmutableTriple.of(p0,p1,p2);
}
}
