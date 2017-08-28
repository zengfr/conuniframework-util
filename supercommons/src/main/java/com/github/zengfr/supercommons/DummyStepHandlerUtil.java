package com.zengfr.supercommons;
import org.apache.commons.math3.ode.sampling.DummyStepHandler;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class DummyStepHandlerUtil{ 
public static org.apache.commons.math3.ode.sampling.DummyStepHandler getInstance(){
return DummyStepHandler.getInstance();
}
}
