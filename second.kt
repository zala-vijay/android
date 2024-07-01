fun main() {
    var n = 4
    for (i in n downTo  0){
        for (j in 0 .. n-i){
            print("*")
        }
        print("\n")
    }
}
// output
// *
// **
// ***
// ****
// *****