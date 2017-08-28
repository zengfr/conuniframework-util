package com.github.zengfr.supercommons;
import com.google.common.util.concurrent.CycleDetectingLockFactory;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class CycleDetectingLockFactoryUtil{ 
public static com.google.common.util.concurrent.CycleDetectingLockFactory newInstance(Policy p0){
return CycleDetectingLockFactory.newInstance(p0);
}
}
