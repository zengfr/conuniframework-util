package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class StripedUtil{ 
/**
*public static com.google.common.util.concurrent.Striped<java.util.concurrent.locks.Lock> com.google.common.util.concurrent.Striped.lazyWeakLock(int)
*/ 
public static com.google.common.util.concurrent.Striped<java.util.concurrent.locks.Lock> lazyWeakLock(int p0){
	return com.google.common.util.concurrent.Striped.lazyWeakLock(p0);
}
/**
*public static com.google.common.util.concurrent.Striped<java.util.concurrent.locks.ReadWriteLock> com.google.common.util.concurrent.Striped.lazyWeakReadWriteLock(int)
*/ 
public static com.google.common.util.concurrent.Striped<java.util.concurrent.locks.ReadWriteLock> lazyWeakReadWriteLock(int p0){
	return com.google.common.util.concurrent.Striped.lazyWeakReadWriteLock(p0);
}
/**
*public static com.google.common.util.concurrent.Striped<java.util.concurrent.Semaphore> com.google.common.util.concurrent.Striped.lazyWeakSemaphore(int,int)
*/ 
public static com.google.common.util.concurrent.Striped<java.util.concurrent.Semaphore> lazyWeakSemaphore(int p0,int p1){
	return com.google.common.util.concurrent.Striped.lazyWeakSemaphore(p0,p1);
}
/**
*public static com.google.common.util.concurrent.Striped<java.util.concurrent.locks.Lock> com.google.common.util.concurrent.Striped.lock(int)
*/ 
public static com.google.common.util.concurrent.Striped<java.util.concurrent.locks.Lock> lock(int p0){
	return com.google.common.util.concurrent.Striped.lock(p0);
}
/**
*public static com.google.common.util.concurrent.Striped<java.util.concurrent.locks.ReadWriteLock> com.google.common.util.concurrent.Striped.readWriteLock(int)
*/ 
public static com.google.common.util.concurrent.Striped<java.util.concurrent.locks.ReadWriteLock> readWriteLock(int p0){
	return com.google.common.util.concurrent.Striped.readWriteLock(p0);
}
/**
*public static com.google.common.util.concurrent.Striped<java.util.concurrent.Semaphore> com.google.common.util.concurrent.Striped.semaphore(int,int)
*/ 
public static com.google.common.util.concurrent.Striped<java.util.concurrent.Semaphore> semaphore(int p0,int p1){
	return com.google.common.util.concurrent.Striped.semaphore(p0,p1);
}
}
