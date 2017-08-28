package com.github.zengfr.supercommons;
import com.google.common.hash.Hashing;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class HashFunctionUtil{ 
public static com.google.common.hash.HashFunction murmur3_128(){
return Hashing.murmur3_128();
}
public static com.google.common.hash.HashFunction murmur3_128(int p0){
return Hashing.murmur3_128(p0);
}
public static com.google.common.hash.HashFunction murmur3_32(int p0){
return Hashing.murmur3_32(p0);
}
public static com.google.common.hash.HashFunction murmur3_32(){
return Hashing.murmur3_32();
}
public static com.google.common.hash.HashFunction sha256(){
return Hashing.sha256();
}
public static com.google.common.hash.HashFunction md5(){
return Hashing.md5();
}
public static com.google.common.hash.HashFunction adler32(){
return Hashing.adler32();
}
public static com.google.common.hash.HashFunction goodFastHash(int p0){
return Hashing.goodFastHash(p0);
}
public static com.google.common.hash.HashFunction sipHash24(long p0,long p1){
return Hashing.sipHash24(p0,p1);
}
public static com.google.common.hash.HashFunction sipHash24(){
return Hashing.sipHash24();
}
public static com.google.common.hash.HashFunction crc32c(){
return Hashing.crc32c();
}
public static com.google.common.hash.HashFunction sha1(){
return Hashing.sha1();
}
public static com.google.common.hash.HashFunction sha512(){
return Hashing.sha512();
}
public static com.google.common.hash.HashFunction concatenating(java.lang.Iterable<com.google.common.hash.HashFunction> p0){
return Hashing.concatenating(p0);
}
public static com.google.common.hash.HashFunction concatenating(com.google.common.hash.HashFunction p0,com.google.common.hash.HashFunction p1,com.google.common.hash.HashFunction... p2){
return Hashing.concatenating(p0,p1,p2);
}
public static com.google.common.hash.HashFunction sha384(){
return Hashing.sha384();
}
public static com.google.common.hash.HashFunction crc32(){
return Hashing.crc32();
}
}
