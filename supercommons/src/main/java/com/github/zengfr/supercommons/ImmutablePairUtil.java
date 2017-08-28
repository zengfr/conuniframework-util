package com.zengfr.supercommons;
import org.apache.commons.lang3.tuple.ImmutablePair;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ImmutablePairUtil{ 
public static <L,R> org.apache.commons.lang3.tuple.ImmutablePair<L, R> of(L p0,R p1){
return ImmutablePair.of(p0,p1);
}
}
