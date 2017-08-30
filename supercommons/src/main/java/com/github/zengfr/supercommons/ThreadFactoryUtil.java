package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ThreadFactoryUtil{ 
/**
*public static java.util.concurrent.ThreadFactory com.google.common.util.concurrent.MoreExecutors.platformThreadFactory()
*/ 
public static java.util.concurrent.ThreadFactory platformThreadFactory(){
	return com.google.common.util.concurrent.MoreExecutors.platformThreadFactory();
}
}
