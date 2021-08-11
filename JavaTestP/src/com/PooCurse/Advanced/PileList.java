package com.PooCurse.Advanced;

public class PileList {
    private Node LastNode;

    public PileList(){
        LastNode=null;
    }

    public void InNode(char FromString){
        Node TempNode = new Node();
        TempNode.informationC=FromString;
        if(LastNode == null){
            TempNode.nextN=null;
            LastNode=TempNode;
        }else{
            TempNode.nextN=LastNode;
            LastNode=TempNode;
        }
    }

    public char GetNode(){
        if (LastNode != null) {
            char GetNodeInfo = LastNode.informationC;
            LastNode=LastNode.nextN;
            return GetNodeInfo;
        } else {
            return Character.MAX_VALUE;
        }
    }

    public boolean BlankPile(){
        return LastNode == null;
    }

}
