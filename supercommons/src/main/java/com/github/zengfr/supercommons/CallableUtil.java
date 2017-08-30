package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CallableUtil{ 
/**
*public static <T> java.util.concurrent.Callable<T> com.google.common.util.concurrent.Callables.returning(T)
*/ 
public static <T> java.util.concurrent.Callable<T> returning(T p0){
	return com.google.common.util.concurrent.Callables.returning(p0);
}
}
