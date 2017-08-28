package com.zengfr.supercommons;
import com.google.common.util.concurrent.Striped;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class StripedUtil{ 
public static com.google.common.util.concurrent.Striped<java.util.concurrent.locks.Lock> lock(int p0){
return Striped.lock(p0);
}
public static com.google.common.util.concurrent.Striped<java.util.concurrent.locks.ReadWriteLock> readWriteLock(int p0){
return Striped.readWriteLock(p0);
}
public static com.google.common.util.concurrent.Striped<java.util.concurrent.Semaphore> semaphore(int p0,int p1){
return Striped.semaphore(p0,p1);
}
public static com.google.common.util.concurrent.Striped<java.util.concurrent.locks.Lock> lazyWeakLock(int p0){
return Striped.lazyWeakLock(p0);
}
public static com.google.common.util.concurrent.Striped<java.util.concurrent.Semaphore> lazyWeakSemaphore(int p0,int p1){
return Striped.lazyWeakSemaphore(p0,p1);
}
public static com.google.common.util.concurrent.Striped<java.util.concurrent.locks.ReadWriteLock> lazyWeakReadWriteLock(int p0){
return Striped.lazyWeakReadWriteLock(p0);
}
}
