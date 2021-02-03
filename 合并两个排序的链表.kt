/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        if (l1 != null || l2 != null) {
            var valL1 = l1
            var valL2 = l2
            var next = ListNode()
            var result = next
            while (true) {
                if (valL1 == null) {
                    println("L2 ${valL2?.`val`}")
                    next.`val` = valL2?.`val` ?: -1
                    if (valL2?.next == null)
                        return result
                    valL2 = valL2?.next
                } else if (valL2 == null) {
                    println("L1 ${valL1?.`val`}")
                    next.`val` = valL1?.`val` ?: -1
                    if (valL1?.next == null)
                        return result
                    valL1 = valL1?.next
                } else {
                    println("${valL1.`val`} ${valL2.`val`}")
                    if (valL1.`val` < valL2.`val`) {
                        next.`val` = valL1?.`val` ?: -1
                        valL1 = valL1?.next
                    } else {
                        next.`val` = valL2?.`val` ?: -1
                        valL2 = valL2?.next
                    }
                }
                next.next = ListNode()
                next = next.next
            }
        }
        println("null")
        return null
    }
}
