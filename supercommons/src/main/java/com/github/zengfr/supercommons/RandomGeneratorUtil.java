package com.github.zengfr.supercommons;
import org.apache.commons.math3.ml.neuralnet.FeatureInitializerFactory;
import org.apache.commons.math3.random.RandomGeneratorFactory;
import org.apache.commons.math3.random.RandomAdaptor;
import org.apache.commons.math3.util.MathArrays;
import org.apache.commons.math3.genetics.GeneticAlgorithm;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class RandomGeneratorUtil{ 
public static org.apache.commons.math3.ml.neuralnet.FeatureInitializer uniform(org.apache.commons.math3.random.RandomGenerator p0,double p1,double p2){
return FeatureInitializerFactory.uniform(p0,p1,p2);
}
public static org.apache.commons.math3.random.RandomGenerator createRandomGenerator(java.util.Random p0){
return RandomGeneratorFactory.createRandomGenerator(p0);
}
public static java.util.Random createAdaptor(org.apache.commons.math3.random.RandomGenerator p0){
return RandomAdaptor.createAdaptor(p0);
}
public static void shuffle(int[] p0,int p1,Position p2,org.apache.commons.math3.random.RandomGenerator p3){
 MathArrays.shuffle(p0,p1,p2,p3);
}
public static void shuffle(int[] p0,org.apache.commons.math3.random.RandomGenerator p1){
 MathArrays.shuffle(p0,p1);
}
public static synchronized org.apache.commons.math3.random.RandomGenerator getRandomGenerator(){
return GeneticAlgorithm.getRandomGenerator();
}
public static synchronized void setRandomGenerator(org.apache.commons.math3.random.RandomGenerator p0){
 GeneticAlgorithm.setRandomGenerator(p0);
}
}
