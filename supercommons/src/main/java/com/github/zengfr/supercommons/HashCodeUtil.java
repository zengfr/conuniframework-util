package com.github.zengfr.supercommons;
import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class HashCodeUtil{ 
public static com.google.common.hash.HashCode fromLong(long p0){
return HashCode.fromLong(p0);
}
public static com.google.common.hash.HashCode fromString(java.lang.String p0){
return HashCode.fromString(p0);
}
public static com.google.common.hash.HashCode fromInt(int p0){
return HashCode.fromInt(p0);
}
public static com.google.common.hash.HashCode fromBytes(byte[] p0){
return HashCode.fromBytes(p0);
}
public static com.google.common.hash.HashCode combineUnordered(java.lang.Iterable<com.google.common.hash.HashCode> p0){
return Hashing.combineUnordered(p0);
}
public static com.google.common.hash.HashCode combineOrdered(java.lang.Iterable<com.google.common.hash.HashCode> p0){
return Hashing.combineOrdered(p0);
}
public static int consistentHash(com.google.common.hash.HashCode p0,int p1){
return Hashing.consistentHash(p0,p1);
}
}
