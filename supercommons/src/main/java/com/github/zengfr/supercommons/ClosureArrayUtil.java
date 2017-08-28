package com.github.zengfr.supercommons;
import org.apache.commons.collections.ClosureUtils;
import org.apache.commons.collections.functors.SwitchClosure;
import org.apache.commons.collections.functors.ChainedClosure;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ClosureArrayUtil{ 
public static org.apache.commons.collections.Closure chainedClosure(org.apache.commons.collections.Closure[] p0){
return ClosureUtils.chainedClosure(p0);
}
public static org.apache.commons.collections.Closure switchClosure(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Closure[] p1,org.apache.commons.collections.Closure p2){
return ClosureUtils.switchClosure(p0,p1,p2);
}
public static org.apache.commons.collections.Closure switchClosure(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Closure[] p1){
return ClosureUtils.switchClosure(p0,p1);
}
public static org.apache.commons.collections.Closure getInstance(org.apache.commons.collections.Predicate[] p0,org.apache.commons.collections.Closure[] p1,org.apache.commons.collections.Closure p2){
return SwitchClosure.getInstance(p0,p1,p2);
}
public static org.apache.commons.collections.Closure getInstance(org.apache.commons.collections.Closure[] p0){
return ChainedClosure.getInstance(p0);
}
}
