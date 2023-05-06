package com.loda.function

/**
 * @Author loda
 * @Date 2023/2/17 20:48
 * @Description TODO(一句话描述该类的功能)
 * @Version 1.0
 */
object CollectFunctionCaseDemo {
	def main(args: Array[String]): Unit = {
		// 已知一个 List 列表，存储元素为：1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		val list = (1 to 10).toList

		//通过 collect 函数筛选出集合中所有的偶数
		val pf: PartialFunction[Int, Int] = {
			case a if a %2 == 0 => a
		}
		println(list.collect(pf))

		//精简
		println(list.collect {
				case a if a %2 == 0 => a
			})
		val l = Nil

		val logic1: Int => Int = (x:Int)=> x * 2
		val logic2: Int => Int = x=> x * 2
		val logic3: Int => Int = _ * 2
	}
}
