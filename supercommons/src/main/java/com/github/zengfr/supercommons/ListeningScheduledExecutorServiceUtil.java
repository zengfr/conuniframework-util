package com.github.zengfr.supercommons;
import com.google.common.util.concurrent.MoreExecutors;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ListeningScheduledExecutorServiceUtil{ 
public static com.google.common.util.concurrent.ListeningScheduledExecutorService listeningDecorator(java.util.concurrent.ScheduledExecutorService p0){
return MoreExecutors.listeningDecorator(p0);
}
}
