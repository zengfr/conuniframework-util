package com.zengfr.supercommons;
import com.google.common.util.concurrent.MoreExecutors;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ListeningExecutorServiceUtil{ 
public static com.google.common.util.concurrent.ListeningExecutorService sameThreadExecutor(){
return MoreExecutors.sameThreadExecutor();
}
public static com.google.common.util.concurrent.ListeningExecutorService listeningDecorator(java.util.concurrent.ExecutorService p0){
return MoreExecutors.listeningDecorator(p0);
}
public static com.google.common.util.concurrent.ListeningExecutorService newDirectExecutorService(){
return MoreExecutors.newDirectExecutorService();
}
}
