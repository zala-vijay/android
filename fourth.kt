fun main() {
    var n = 5
    for (i in n downTo 0){
        for (j in 0 .. n-i){
            print(" ")
        }
        for (k in 0 .. i){
            print("*")
        }
        print("\n")
    }
}
// output
// *****
//  ****
//   ***
//    **
//     *