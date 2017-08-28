package com.zengfr.supercommons;
import org.apache.commons.lang3.tuple.MutableTriple;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MutableTripleUtil{ 
public static <L,M,R> org.apache.commons.lang3.tuple.MutableTriple<L, M, R> of(L p0,M p1,R p2){
return MutableTriple.of(p0,p1,p2);
}
}
