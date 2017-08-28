package com.zengfr.supercommons;
import com.google.common.util.concurrent.Callables;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CallableUtil{ 
public static <T> java.util.concurrent.Callable<T> returning(T p0){
return Callables.returning(p0);
}
}
