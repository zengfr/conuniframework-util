package com.github.zengfr.supercommons;
import com.google.common.hash.Hashing;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class HashFunctionArrayUtil{ 
public static com.google.common.hash.HashFunction concatenating(com.google.common.hash.HashFunction p0,com.google.common.hash.HashFunction p1,com.google.common.hash.HashFunction... p2){
return Hashing.concatenating(p0,p1,p2);
}
}
