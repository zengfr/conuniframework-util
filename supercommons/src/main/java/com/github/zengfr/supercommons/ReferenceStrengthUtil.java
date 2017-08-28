package com.github.zengfr.supercommons;
import org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceStrength;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ReferenceStrengthUtil{ 
public static org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceStrength valueOf(java.lang.String p0){
return ReferenceStrength.valueOf(p0);
}
public static org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceStrength resolve(int p0){
return ReferenceStrength.resolve(p0);
}
}
