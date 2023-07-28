@Suppress("DEPRECATION")
fun isPalindrome(s: String): Boolean {
    var left = 0
    var right = s.lastIndex
    while (left <= right) {
        when {
            !s[left].isLetterOrDigit() -> left++
            !s[right].isLetterOrDigit() -> right--
            // must use deprecated toLowerCase(), because leetcode supports only kotlin version 1.3.10
            // that does not support lowercase() or lowercaseChar()
            s[left++].toLowerCase() != s[right--].toLowerCase() -> return false
        }
    }
    return true
}