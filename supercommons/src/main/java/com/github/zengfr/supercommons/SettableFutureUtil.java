package com.github.zengfr.supercommons;
import com.google.common.util.concurrent.SettableFuture;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SettableFutureUtil{ 
public static <V> com.google.common.util.concurrent.SettableFuture<V> create(){
return SettableFuture.create();
}
}
