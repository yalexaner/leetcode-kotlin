fun longestCommonPrefix(words: Array<String>): String {
    var res = ""
    for (ch in words[0]) {
        val c = res + ch
        if (!words.all {it.startsWith(c)}) break
        res += ch
    }
    return res
}