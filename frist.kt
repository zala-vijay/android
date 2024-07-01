fun main() {
    var n = 4
    for (i in 0 .. n){
        for (j in 0 .. n-i){
            print("*")
        }
        print("\n")
    }
}
// output
// *****
// ****
// ***
// **
// *
