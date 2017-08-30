package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FileCleaningTrackerUtil{ 
/**
*public static org.apache.commons.io.FileCleaningTracker org.apache.commons.io.FileCleaner.getInstance()
*/ 
public static org.apache.commons.io.FileCleaningTracker getInstance(){
	return org.apache.commons.io.FileCleaner.getInstance();
}
}
