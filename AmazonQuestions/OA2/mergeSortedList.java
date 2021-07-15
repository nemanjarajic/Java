package AmazonQuestions.OA2;

public class mergeSortedList {
    static ListNode solution(ListNode l1, ListNode l2){
        if(l1 == null || l2 == null){
            return l1 ==null ? l2:l1;
        }

        if(l1 == null && l2 == null) return null;

        ListNode newHead = new ListNode(-1,null);
        ListNode res= newHead;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                newHead.next = l1;
                l1 = l1.next;
            }else{
                newHead.next = l2;
                l2 = l2.next;
            }

            newHead = newHead.next;
        }

        if( l1 != null || l2 != null){
            newHead.next = (l1==null)? l2:l1;
        }
        return res.next;
    }
}
