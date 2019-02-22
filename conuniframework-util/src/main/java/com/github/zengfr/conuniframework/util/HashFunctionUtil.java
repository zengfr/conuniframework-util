package com.github.zengfr.conuniframework.util;
import java.util.*;
import java.util.Map.Entry;
import com.google.common.collect.Table;
import com.google.common.collect.Table.Cell;
/**
* @author zengfr
* @author https://github.com/zengfr/conuniframework-util
* @author https://gitee.com/zengfr/conuniframework-util
* @author  http://blog.csdn.net/zfrong/
* @author zengfr3000@qq.com
*/
public final class HashFunctionUtil{ 
/**
*{@link com.google.common.hash.Hashing#adler32()}
*@see com.google.common.hash.Hashing#adler32()
*<code>public static com.google.common.hash.HashFunction com.google.common.hash.Hashing.adler32()
*adler32()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.hash.HashFunction adler32(){
	return com.google.common.hash.Hashing.adler32();
}
/**
*{@link com.google.common.hash.Hashing#concatenating(java.lang.Iterable<com.google.common.hash.HashFunction>)}
*@see com.google.common.hash.Hashing#concatenating(java.lang.Iterable<com.google.common.hash.HashFunction>)
*<code>public static com.google.common.hash.HashFunction com.google.common.hash.Hashing.concatenating(java.lang.Iterable<com.google.common.hash.HashFunction>)
*concatenating(java.lang.Iterable<com.google.common.hash.HashFunction> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.hash.HashFunction concatenating(java.lang.Iterable<com.google.common.hash.HashFunction> p0){
	return com.google.common.hash.Hashing.concatenating(p0);
}
/**
*{@link com.google.common.hash.Hashing#concatenating(com.google.common.hash.HashFunction,com.google.common.hash.HashFunction,com.google.common.hash.HashFunction...)}
*@see com.google.common.hash.Hashing#concatenating(com.google.common.hash.HashFunction,com.google.common.hash.HashFunction,com.google.common.hash.HashFunction...)
*<code>public static com.google.common.hash.HashFunction com.google.common.hash.Hashing.concatenating(com.google.common.hash.HashFunction,com.google.common.hash.HashFunction,com.google.common.hash.HashFunction...)
*concatenating(com.google.common.hash.HashFunction p0,com.google.common.hash.HashFunction p1,com.google.common.hash.HashFunction... p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.hash.HashFunction concatenating(com.google.common.hash.HashFunction p0,com.google.common.hash.HashFunction p1,com.google.common.hash.HashFunction... p2){
	return com.google.common.hash.Hashing.concatenating(p0,p1,p2);
}
/**
*{@link com.google.common.hash.Hashing#crc32()}
*@see com.google.common.hash.Hashing#crc32()
*<code>public static com.google.common.hash.HashFunction com.google.common.hash.Hashing.crc32()
*crc32()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.hash.HashFunction crc32(){
	return com.google.common.hash.Hashing.crc32();
}
/**
*{@link com.google.common.hash.Hashing#crc32c()}
*@see com.google.common.hash.Hashing#crc32c()
*<code>public static com.google.common.hash.HashFunction com.google.common.hash.Hashing.crc32c()
*crc32c()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.hash.HashFunction crc32c(){
	return com.google.common.hash.Hashing.crc32c();
}
/**
*{@link com.google.common.hash.Hashing#farmHashFingerprint64()}
*@see com.google.common.hash.Hashing#farmHashFingerprint64()
*<code>public static com.google.common.hash.HashFunction com.google.common.hash.Hashing.farmHashFingerprint64()
*farmHashFingerprint64()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.hash.HashFunction farmHashFingerprint64(){
	return com.google.common.hash.Hashing.farmHashFingerprint64();
}
/**
*{@link com.google.common.hash.Hashing#goodFastHash(int)}
*@see com.google.common.hash.Hashing#goodFastHash(int)
*<code>public static com.google.common.hash.HashFunction com.google.common.hash.Hashing.goodFastHash(int)
*goodFastHash(int p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.hash.HashFunction goodFastHash(int p0){
	return com.google.common.hash.Hashing.goodFastHash(p0);
}
/**
*{@link com.google.common.hash.Hashing#hmacMd5(java.security.Key)}
*@see com.google.common.hash.Hashing#hmacMd5(java.security.Key)
*<code>public static com.google.common.hash.HashFunction com.google.common.hash.Hashing.hmacMd5(java.security.Key)
*hmacMd5(java.security.Key p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.hash.HashFunction hmacMd5(java.security.Key p0){
	return com.google.common.hash.Hashing.hmacMd5(p0);
}
/**
*{@link com.google.common.hash.Hashing#hmacMd5(byte...)}
*@see com.google.common.hash.Hashing#hmacMd5(byte...)
*<code>public static com.google.common.hash.HashFunction com.google.common.hash.Hashing.hmacMd5(byte[])
*hmacMd5(byte... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.hash.HashFunction hmacMd5(byte... p0){
	return com.google.common.hash.Hashing.hmacMd5(p0);
}
/**
*{@link com.google.common.hash.Hashing#hmacSha1(byte...)}
*@see com.google.common.hash.Hashing#hmacSha1(byte...)
*<code>public static com.google.common.hash.HashFunction com.google.common.hash.Hashing.hmacSha1(byte[])
*hmacSha1(byte... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.hash.HashFunction hmacSha1(byte... p0){
	return com.google.common.hash.Hashing.hmacSha1(p0);
}
/**
*{@link com.google.common.hash.Hashing#hmacSha1(java.security.Key)}
*@see com.google.common.hash.Hashing#hmacSha1(java.security.Key)
*<code>public static com.google.common.hash.HashFunction com.google.common.hash.Hashing.hmacSha1(java.security.Key)
*hmacSha1(java.security.Key p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.hash.HashFunction hmacSha1(java.security.Key p0){
	return com.google.common.hash.Hashing.hmacSha1(p0);
}
/**
*{@link com.google.common.hash.Hashing#hmacSha256(byte...)}
*@see com.google.common.hash.Hashing#hmacSha256(byte...)
*<code>public static com.google.common.hash.HashFunction com.google.common.hash.Hashing.hmacSha256(byte[])
*hmacSha256(byte... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.hash.HashFunction hmacSha256(byte... p0){
	return com.google.common.hash.Hashing.hmacSha256(p0);
}
/**
*{@link com.google.common.hash.Hashing#hmacSha256(java.security.Key)}
*@see com.google.common.hash.Hashing#hmacSha256(java.security.Key)
*<code>public static com.google.common.hash.HashFunction com.google.common.hash.Hashing.hmacSha256(java.security.Key)
*hmacSha256(java.security.Key p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.hash.HashFunction hmacSha256(java.security.Key p0){
	return com.google.common.hash.Hashing.hmacSha256(p0);
}
/**
*{@link com.google.common.hash.Hashing#hmacSha512(byte...)}
*@see com.google.common.hash.Hashing#hmacSha512(byte...)
*<code>public static com.google.common.hash.HashFunction com.google.common.hash.Hashing.hmacSha512(byte[])
*hmacSha512(byte... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.hash.HashFunction hmacSha512(byte... p0){
	return com.google.common.hash.Hashing.hmacSha512(p0);
}
/**
*{@link com.google.common.hash.Hashing#hmacSha512(java.security.Key)}
*@see com.google.common.hash.Hashing#hmacSha512(java.security.Key)
*<code>public static com.google.common.hash.HashFunction com.google.common.hash.Hashing.hmacSha512(java.security.Key)
*hmacSha512(java.security.Key p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.hash.HashFunction hmacSha512(java.security.Key p0){
	return com.google.common.hash.Hashing.hmacSha512(p0);
}
/**
*{@link com.google.common.hash.Hashing#md5()}
*@see com.google.common.hash.Hashing#md5()
*<code>public static com.google.common.hash.HashFunction com.google.common.hash.Hashing.md5()
*md5()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.hash.HashFunction md5(){
	return com.google.common.hash.Hashing.md5();
}
/**
*{@link com.google.common.hash.Hashing#murmur3_128(int)}
*@see com.google.common.hash.Hashing#murmur3_128(int)
*<code>public static com.google.common.hash.HashFunction com.google.common.hash.Hashing.murmur3_128(int)
*murmur3_128(int p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.hash.HashFunction murmur3_128(int p0){
	return com.google.common.hash.Hashing.murmur3_128(p0);
}
/**
*{@link com.google.common.hash.Hashing#murmur3_128()}
*@see com.google.common.hash.Hashing#murmur3_128()
*<code>public static com.google.common.hash.HashFunction com.google.common.hash.Hashing.murmur3_128()
*murmur3_128()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.hash.HashFunction murmur3_128(){
	return com.google.common.hash.Hashing.murmur3_128();
}
/**
*{@link com.google.common.hash.Hashing#murmur3_32(int)}
*@see com.google.common.hash.Hashing#murmur3_32(int)
*<code>public static com.google.common.hash.HashFunction com.google.common.hash.Hashing.murmur3_32(int)
*murmur3_32(int p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.hash.HashFunction murmur3_32(int p0){
	return com.google.common.hash.Hashing.murmur3_32(p0);
}
/**
*{@link com.google.common.hash.Hashing#murmur3_32()}
*@see com.google.common.hash.Hashing#murmur3_32()
*<code>public static com.google.common.hash.HashFunction com.google.common.hash.Hashing.murmur3_32()
*murmur3_32()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.hash.HashFunction murmur3_32(){
	return com.google.common.hash.Hashing.murmur3_32();
}
/**
*{@link com.google.common.hash.Hashing#sha1()}
*@see com.google.common.hash.Hashing#sha1()
*<code>public static com.google.common.hash.HashFunction com.google.common.hash.Hashing.sha1()
*sha1()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.hash.HashFunction sha1(){
	return com.google.common.hash.Hashing.sha1();
}
/**
*{@link com.google.common.hash.Hashing#sha256()}
*@see com.google.common.hash.Hashing#sha256()
*<code>public static com.google.common.hash.HashFunction com.google.common.hash.Hashing.sha256()
*sha256()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.hash.HashFunction sha256(){
	return com.google.common.hash.Hashing.sha256();
}
/**
*{@link com.google.common.hash.Hashing#sha384()}
*@see com.google.common.hash.Hashing#sha384()
*<code>public static com.google.common.hash.HashFunction com.google.common.hash.Hashing.sha384()
*sha384()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.hash.HashFunction sha384(){
	return com.google.common.hash.Hashing.sha384();
}
/**
*{@link com.google.common.hash.Hashing#sha512()}
*@see com.google.common.hash.Hashing#sha512()
*<code>public static com.google.common.hash.HashFunction com.google.common.hash.Hashing.sha512()
*sha512()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.hash.HashFunction sha512(){
	return com.google.common.hash.Hashing.sha512();
}
/**
*{@link com.google.common.hash.Hashing#sipHash24(long,long)}
*@see com.google.common.hash.Hashing#sipHash24(long,long)
*<code>public static com.google.common.hash.HashFunction com.google.common.hash.Hashing.sipHash24(long,long)
*sipHash24(long p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.hash.HashFunction sipHash24(long p0,long p1){
	return com.google.common.hash.Hashing.sipHash24(p0,p1);
}
/**
*{@link com.google.common.hash.Hashing#sipHash24()}
*@see com.google.common.hash.Hashing#sipHash24()
*<code>public static com.google.common.hash.HashFunction com.google.common.hash.Hashing.sipHash24()
*sipHash24()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static com.google.common.hash.HashFunction sipHash24(){
	return com.google.common.hash.Hashing.sipHash24();
}
}
