package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class RandomGeneratorUtil{ 
/**
*public static org.apache.commons.math3.ml.neuralnet.FeatureInitializer org.apache.commons.math3.ml.neuralnet.FeatureInitializerFactory.uniform(org.apache.commons.math3.random.RandomGenerator,double,double)
*/ 
public static org.apache.commons.math3.ml.neuralnet.FeatureInitializer uniform(org.apache.commons.math3.random.RandomGenerator p0,double p1,double p2){
	return org.apache.commons.math3.ml.neuralnet.FeatureInitializerFactory.uniform(p0,p1,p2);
}
/**
*public static org.apache.commons.math3.random.RandomGenerator org.apache.commons.math3.random.RandomGeneratorFactory.createRandomGenerator(java.util.Random)
*/ 
public static org.apache.commons.math3.random.RandomGenerator createRandomGenerator(java.util.Random p0){
	return org.apache.commons.math3.random.RandomGeneratorFactory.createRandomGenerator(p0);
}
/**
*public static java.util.Random org.apache.commons.math3.random.RandomAdaptor.createAdaptor(org.apache.commons.math3.random.RandomGenerator)
*/ 
public static java.util.Random createAdaptor(org.apache.commons.math3.random.RandomGenerator p0){
	return org.apache.commons.math3.random.RandomAdaptor.createAdaptor(p0);
}
/**
*public static void org.apache.commons.math3.util.MathArrays.shuffle(int[],org.apache.commons.math3.random.RandomGenerator)
*/ 
public static void shuffle(int[] p0,org.apache.commons.math3.random.RandomGenerator p1){
	 org.apache.commons.math3.util.MathArrays.shuffle(p0,p1);
}
/**
*public static void org.apache.commons.math3.util.MathArrays.shuffle(int[],int,org.apache.commons.math3.util.MathArrays$Position,org.apache.commons.math3.random.RandomGenerator)
*/ 
public static void shuffle(int[] p0,int p1,Position p2,org.apache.commons.math3.random.RandomGenerator p3){
	 org.apache.commons.math3.util.MathArrays.shuffle(p0,p1,p2,p3);
}
/**
*public static synchronized void org.apache.commons.math3.genetics.GeneticAlgorithm.setRandomGenerator(org.apache.commons.math3.random.RandomGenerator)
*/ 
public static synchronized void setRandomGenerator(org.apache.commons.math3.random.RandomGenerator p0){
	 org.apache.commons.math3.genetics.GeneticAlgorithm.setRandomGenerator(p0);
}
/**
*public static synchronized org.apache.commons.math3.random.RandomGenerator org.apache.commons.math3.genetics.GeneticAlgorithm.getRandomGenerator()
*/ 
public static synchronized org.apache.commons.math3.random.RandomGenerator getRandomGenerator(){
	return org.apache.commons.math3.genetics.GeneticAlgorithm.getRandomGenerator();
}
}
