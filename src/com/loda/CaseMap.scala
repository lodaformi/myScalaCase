package com.loda

/**
 * @Author loda
 * @Date 2023/2/17 20:09
 * @Description TODO(一句话描述该类的功能)
 * @Version 1.0
 */
object CaseMap {
	def main(args: Array[String]): Unit = {
		// 定义 Map
		val map = Map("A" -> 1, "B" -> 2, "C" -> 3)

//		for ((k,v) <- map) println(s"${k}--${v}")
		for ((k,v) <- map if v >=2 ) println(s"${k}--${v}")
//		for (("B",v) <- map) println(s"B--${v}")
//		for ((k,3) <- map) println(s"${k}--${3}")
	}
}
