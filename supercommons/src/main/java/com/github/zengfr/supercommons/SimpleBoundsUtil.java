package com.zengfr.supercommons;
import org.apache.commons.math3.optim.SimpleBounds;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SimpleBoundsUtil{ 
public static org.apache.commons.math3.optim.SimpleBounds unbounded(int p0){
return SimpleBounds.unbounded(p0);
}
}
