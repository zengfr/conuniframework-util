package com.github.zengfr.supercommons;
import org.apache.commons.math3.ode.nonstiff.AdamsNordsieckTransformer;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class AdamsNordsieckTransformerUtil{ 
public static org.apache.commons.math3.ode.nonstiff.AdamsNordsieckTransformer getInstance(int p0){
return AdamsNordsieckTransformer.getInstance(p0);
}
}
