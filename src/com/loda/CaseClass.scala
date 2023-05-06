package com.loda

/**
 * @Author loda
 * @Date 2023/2/17 19:45
 * @Description 匹配样例类
 * @Version 1.0
 */
object CaseClass {
	case class User(name: String, age: Int)
	case class Order(id: Int)
	def main(args: Array[String]): Unit = {
//		val a: Any = User("张三", 18)
//		val a: Any = Order(1)
		val a: Any = 5
		val res = a match {
			case User(name, age) => println("user")
			case Order(id) => println("order")
			case _ => println("not match")
		}
	}
}
