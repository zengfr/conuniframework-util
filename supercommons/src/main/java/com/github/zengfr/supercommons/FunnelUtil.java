package com.zengfr.supercommons;
import com.google.common.hash.Funnels;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FunnelUtil{ 
public static com.google.common.hash.Funnel<java.lang.CharSequence> unencodedCharsFunnel(){
return Funnels.unencodedCharsFunnel();
}
public static com.google.common.hash.Funnel<byte[]> byteArrayFunnel(){
return Funnels.byteArrayFunnel();
}
public static <E> com.google.common.hash.Funnel<java.lang.Iterable<? extends E>> sequentialFunnel(com.google.common.hash.Funnel<E> p0){
return Funnels.sequentialFunnel(p0);
}
public static com.google.common.hash.Funnel<java.lang.Long> longFunnel(){
return Funnels.longFunnel();
}
public static com.google.common.hash.Funnel<java.lang.Integer> integerFunnel(){
return Funnels.integerFunnel();
}
public static com.google.common.hash.Funnel<java.lang.CharSequence> stringFunnel(java.nio.charset.Charset p0){
return Funnels.stringFunnel(p0);
}
}
