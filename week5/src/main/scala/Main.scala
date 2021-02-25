import java.time.LocalDate
import java.time.format.DateTimeFormatter

object Main extends App{
  class CalculatorSalary(){
    def maxProduct(nums: Array[Int]): Int = {
      var newArr = nums.sorted
      (newArr(newArr.length-1)-1) * (newArr(newArr.length-2)-1)
    }
  }

  class CalculateDay(){
    def dayOfTheWeek(day: Int, month: Int, year: Int): String = {
      var df = DateTimeFormatter.ofPattern("dd/MM/yyyy")
      var text = ""
      if(month < 10){
        if(day < 10){
          text = "0" + day.toString + "/0" + month.toString + "/" + year.toString
        }
        else{
          text = day.toString + "/0" + month.toString + "/" + year.toString
        }
      }
      else{
        if(day < 10){
          text = "0" + day.toString + "/" + month.toString + "/" + year.toString
        }
        else{
          text = day.toString + "/" + month.toString + "/" + year.toString
        }
      }
      var dayOfWeek = LocalDate.parse(text,df).getDayOfWeek
      dayOfWeek.toString.toLowerCase().capitalize
    }

  }

  class CalculatorPair(){
    //4
    def findPairs(nums: Array[Int], k: Int): Int = {
      if(k < 0) return 0
      var sum = 0
      val sorted = nums.sorted
      var start = 0
      var end = 1
      while(end < sorted.length) {
        if(end <= start || sorted(start) +  k > sorted(end)) end += 1
        else if((start > 0 && sorted(start) == sorted(start - 1)) || (sorted(start) + k < sorted(end))) start += 1
        else {
          sum += 1
          start += 1
        }
      }
      sum
    }
  }


}