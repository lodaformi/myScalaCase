package com.loda.function

/**
 * @Author loda
 * @Date 2023/2/17 20:26
 * @Description TODO(一句话描述该类的功能)
 * @Version 1.0
 */
object PartialFunctionDemo {
	def main(args: Array[String]): Unit = {
		val pf: PartialFunction[Int,String] = {
			case 1 => "ONE"
			case 2 => "TWO"
			case 3 => "THREE"
			//注意：最好有case _处理都不匹配的情况，否则在都不匹配的时候，程序报错MatchError
			case _ => "OTHER"
		}
		println(pf(1), pf(2), pf(3), pf(4))

		val pf2: PartialFunction[Int,String] = {
			case 1 => "ONE"
			case 2 => "TWO"
			case 3 => "THREE"
		}
		println(pf2.isDefinedAt(1), pf2.isDefinedAt(4))

		//orElse：将多个偏函数组合起来使用，效果类似 case 语句
		val onePF: PartialFunction[Int, String] = {
			case 1 => "One"
		}
		val twoPF: PartialFunction[Int, String] = {
			case 2 => "Two"
		}
		val threePF: PartialFunction[Int, String] = {
			case 3 => "Three"
		}
		val otherPF: PartialFunction[Int, String] = {
			case _ => "Other"
		}

		val newPF = onePF orElse twoPF orElse threePF orElse otherPF
		println(newPF(1),newPF(2),newPF(3),newPF(4) )

		val pf3: PartialFunction[Int, String] = {
			case 1 => "num1"
			case _ => "other"
		}
		val pf4:PartialFunction[String, String] = {
			case "num1" => "num is 1"
			case "other" => "what"
		}
		val andPF = pf3 andThen pf4
		println(andPF(2))

		val pf5: PartialFunction[Int, String] = {
			case 1 => "One"
		}
		println(pf5.applyOrElse(1, {n:Int => "other"}))
		println(pf5.applyOrElse(2, {n:Int => "other"}))
	}
}
