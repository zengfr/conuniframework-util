package com.github.zengfr.supercommons;
import org.apache.commons.lang3.tuple.Triple;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TripleUtil{ 
public static <L,M,R> org.apache.commons.lang3.tuple.Triple<L, M, R> of(L p0,M p1,R p2){
return Triple.of(p0,p1,p2);
}
}
