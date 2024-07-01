fun main() {
    var n = 5
    for (i in 0 .. n) {
        for (j in i-1 .. n) {
            print(" ")
        }
        for (k in 0 .. i) {
            print("*")
        }
        print("\n")
    }
}
// output
//     *
//    **
//   ***
//  ****
// *****