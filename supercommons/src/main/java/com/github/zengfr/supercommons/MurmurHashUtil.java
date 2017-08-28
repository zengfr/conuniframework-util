package com.github.zengfr.supercommons;
import com.facebook.util.digest.MurmurHash;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MurmurHashUtil{ 
public static com.facebook.util.digest.MurmurHash createRepeatableHasher(){
return MurmurHash.createRepeatableHasher();
}
}
