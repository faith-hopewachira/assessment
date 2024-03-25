fun main(){
    bakery("Barnie bakes brown bagels and buns")
    volume(2.0)
    println(isPalindrome("madam"))



}

//Write and invoke a function that given the string “Barnie bakes brown bagels
//and buns” prints out a list of all the other words and characters making up the
//string excluding all possible occurrences of the letter b.

fun bakery(bake: String){
    println(bake[1])
    println(bake[2])
    println(bake[3])
    println(bake[4])
    println(bake[5])
    println(bake[8])
    println(bake[9])
    println(bake[10])
    println(bake[11])
    println(bake[14])
    println(bake[15])
    println(bake[16])
    println(bake[17])
    println(bake[20])
    println(bake[21])
    println(bake[22])
    println(bake[23])
    println(bake[24])
    println(bake[27])
    println(bake[28])
    println(bake[31])
    println(bake[32])
    println(bake[33])






}

//Write and invoke one function that takes in an array of integers and returns
//these 3 values: sum, count and average of all the elements.

fun takeArray(numbers: Array<Int>): Int{
    var sum = numbers + numbers
    return sum

}

//The volume of a sphere is calculated using the formula below
//
//V = 4/3 π r
//3
//
//Write and invoke a function that is capable of accurately calculating the
//volume of any sphere given its radius. Use 3.14159 as π

fun volume(radius: Double){
    var vol = 4/3 * 3.14159 * (radius)
    println(vol)

}

//A palindrome is a string that reads the same forwards and backwards e.g
//madam, wow, kayak. Write and invoke a function:
//isPalindrome(word: String): Boolean
//that takes in a single word and returns true or false depending on whether the
//word is a palindrome.

fun isPalindrome(word: String): Boolean {


}