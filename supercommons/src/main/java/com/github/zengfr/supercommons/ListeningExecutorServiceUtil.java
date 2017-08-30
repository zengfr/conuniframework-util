package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ListeningExecutorServiceUtil{ 
/**
*public static com.google.common.util.concurrent.ListeningExecutorService com.google.common.util.concurrent.MoreExecutors.sameThreadExecutor()
*/ 
public static com.google.common.util.concurrent.ListeningExecutorService sameThreadExecutor(){
	return com.google.common.util.concurrent.MoreExecutors.sameThreadExecutor();
}
/**
*public static com.google.common.util.concurrent.ListeningExecutorService com.google.common.util.concurrent.MoreExecutors.listeningDecorator(java.util.concurrent.ExecutorService)
*/ 
public static com.google.common.util.concurrent.ListeningExecutorService listeningDecorator(java.util.concurrent.ExecutorService p0){
	return com.google.common.util.concurrent.MoreExecutors.listeningDecorator(p0);
}
/**
*public static com.google.common.util.concurrent.ListeningExecutorService com.google.common.util.concurrent.MoreExecutors.newDirectExecutorService()
*/ 
public static com.google.common.util.concurrent.ListeningExecutorService newDirectExecutorService(){
	return com.google.common.util.concurrent.MoreExecutors.newDirectExecutorService();
}
}
