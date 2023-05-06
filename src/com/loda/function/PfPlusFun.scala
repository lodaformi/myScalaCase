package com.loda.function

/**
 * @Author loda
 * @Date 2023/2/19 16:09
 * @Description TODO(一句话描述该类的功能)
 * @Version 1.0
 */
object PfPlusFun {
	def main(args: Array[String]): Unit = {
		val list: List[Int] = (1 to 10).toList
		//找出偶数
		val res1: List[Int] = list.collect({
			case x if x % 2 == 0 => x
		})
		println(res1)

		//map是对每一个元素做操作，而且每一个元素都要都匹配的case否则报错
		val res2: List[Int] = list.map({
			case x if x % 2 == 0 => x
			case _ => -1
		})
		println(res2)

		//map是对每一个元素做操作，而且每一个元素都要都匹配的case否则报错，而且返回值是Unit
		val res3: Unit = list.foreach({
			case x if x % 2 == 0 => print(s"${x}, ")
			case _ => print("-1, ")
		})
		res3
	}
}
