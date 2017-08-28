package com.github.zengfr.supercommons;
import com.google.common.hash.BloomFilter;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BloomFilterUtil{ 
public static <T> com.google.common.hash.BloomFilter<T> create(com.google.common.hash.Funnel<? super T> p0,int p1){
return BloomFilter.create(p0,p1);
}
public static <T> com.google.common.hash.BloomFilter<T> create(com.google.common.hash.Funnel<? super T> p0,long p1){
return BloomFilter.create(p0,p1);
}
public static <T> com.google.common.hash.BloomFilter<T> create(com.google.common.hash.Funnel<? super T> p0,long p1,double p2){
return BloomFilter.create(p0,p1,p2);
}
public static <T> com.google.common.hash.BloomFilter<T> create(com.google.common.hash.Funnel<? super T> p0,int p1,double p2){
return BloomFilter.create(p0,p1,p2);
}
public static <T> com.google.common.hash.BloomFilter<T> readFrom(java.io.InputStream p0,com.google.common.hash.Funnel<T> p1) throws java.io.IOException{
return BloomFilter.readFrom(p0,p1);
}
}
