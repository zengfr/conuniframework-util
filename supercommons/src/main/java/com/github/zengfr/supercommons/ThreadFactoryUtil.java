package com.zengfr.supercommons;
import com.google.common.util.concurrent.MoreExecutors;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ThreadFactoryUtil{ 
public static java.util.concurrent.ThreadFactory platformThreadFactory(){
return MoreExecutors.platformThreadFactory();
}
}
