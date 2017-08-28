package com.github.zengfr.supercommons;
import org.apache.commons.lang3.tuple.MutablePair;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MutablePairUtil{ 
public static <L,R> org.apache.commons.lang3.tuple.MutablePair<L, R> of(L p0,R p1){
return MutablePair.of(p0,p1);
}
}
