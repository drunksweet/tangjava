public class mergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(-1);
        ListNode cur = result;

        ListNode note1 = list1,note2 =list2;
        if (note1 == null &&note2 != null){
            cur.next = note2;
            return cur.next;
        }else if(note2 == null &&note1 != null){
            cur.next = note1;
            return cur.next;
        }else if(note1 == null &&note2 == null){
            return cur.next;
        }
        while (note1 != null && note2 != null){
            if (note1.val <= note2.val){
                cur.next = note1;
                note1=note1.next;
            }else{
                cur.next=note2;
                note2=note2.next;
            }
            cur = cur.next;
        }
        cur. next =(note1 != null) ? note1 : note2;
        return result.next;
    }
}
