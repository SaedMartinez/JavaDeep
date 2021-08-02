package com.PooCurse.Advanced;

public class TailList {
    private Node start, end;
    String Tail = "";

    public TailList() {
        start = null;
        end = null;
    }

    public boolean BlankTail() {
        if (start == null) {
            return true;
        } else {
            return false;
        }
    }

    public void InNode(int NodeInfo) {
        Node NewNode = new Node();
        NewNode.information = NodeInfo;
        NewNode.nextN = null;
        if (BlankTail()) {
            start = NewNode;
            end = NewNode;
        } else {
            end.nextN = NewNode;
            end = NewNode;
        }
    }

    public int GetNode() {
        if (!BlankTail()) {
            int finalInfo = start.information;
            if (start == end) {
                start = null;
                end = null;
            } else {
                start = start.nextN;
            }
            return finalInfo;
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public void PrintTail() {
        Node runner = start;
        String InvertTail = "";
        while (runner != null) {
            Tail += runner.information + " ";
            runner = runner.nextN;
        }
        String StringArray[] = Tail.split(" ");
        for (int i = StringArray.length - 1; i >= 0; i--) {
            InvertTail += " " + StringArray[i];
        }
        System.out.print(InvertTail);
            Tail=" ";
    }

}
