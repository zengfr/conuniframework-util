package com.github.zengfr.supercommons;
import com.google.common.collect.DiscreteDomain;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class DiscreteDomainUtil{ 
public static com.google.common.collect.DiscreteDomain<java.lang.Integer> integers(){
return DiscreteDomain.integers();
}
public static com.google.common.collect.DiscreteDomain<java.math.BigInteger> bigIntegers(){
return DiscreteDomain.bigIntegers();
}
public static com.google.common.collect.DiscreteDomain<java.lang.Long> longs(){
return DiscreteDomain.longs();
}
}
