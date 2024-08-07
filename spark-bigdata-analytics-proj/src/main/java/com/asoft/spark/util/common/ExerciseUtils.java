
package com.asoft.spark.bda.common;

import org.apache.spark.api.java.JavaRDD;

public class ExerciseUtils {

	//A method to keep Java running, so that we can explore Spark instance.
	public static void hold() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void printStringRDD(JavaRDD<String> stringRDD, int count) {
		
		for ( String s : stringRDD.take(count)) {
			System.out.println(s);
		}
		System.out.println("-----------------------------------------------------------------------------------");
	}

}
